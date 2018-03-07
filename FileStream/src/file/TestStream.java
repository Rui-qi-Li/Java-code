package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class TestStream{
	public static void main(String[]arg) {
		//wrap the file into type File
		File f = new File("E:/TestRead.txt");
		try {
			//FileInputStream need FileNotFoundException if the file is not exist
			FileInputStream fis = new FileInputStream(f);
			
			byte[] all = new byte[(int)(f.length())];
			
			//read() will return a int�� how long you read
			int len = fis.read(all);//byte array accept the input
			
			//close() need IOException 
			fis.close();
			for(byte b: all)
				System.out.print(b);//print 
			for(byte c:all)
				System.out.print((char)c);//casting
			
			//create a output stream and buffer byte array
			byte[]data = {85,86,87,88,89};//they are UVWXY
			FileOutputStream fos = new FileOutputStream(f);
			
			//write(): overwritten, will create a new file is no file existed
			fos.write(data);
			fos.write("i like you".getBytes());//turn a string into byte array
			
			//close
			fos.close();
			readDemo();
			writeDemo();
			read_writeDemo();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}	
	}
	public static void readDemo() throws IOException{
		File f2 = new File("E:/TestRead.txt");
		FileInputStream in = new FileInputStream(f2);
		//1.read()���ص��Ƕ�ȡ����һ���ֽڣ����ܶ����֣�unicode�� 
        //2.read(byte[] b)���ص��Ƕ�ȡ�����ֽ����飬�����ֱ���ż��  
		//���ַ������������ȴ�����ĩβ����-1
		int b = -1;
		while((b=in.read())!=-1) {//continue reading
			System.out.println((char)b);//casting
		}
		in.close();
		
		FileInputStream in2 = new FileInputStream(f2);
		//1K: buffer capacity
		byte[] bytes = new byte[1024];
		int len = -1;
		//read has mark inside to avoid reading the same content repeatly
		while((len=in2.read(bytes)) != -1)
			//create a String object by byte array
			System.out.print(new String(bytes,0,len));
		in2.close();
		
		//3.read(<whole_length>) risk:����ʱ���޷�������Ӧ�ֽ�����
		//��
	}
	public static void writeDemo()throws IOException{
		//1.new FileOutputStream():����д��
		//2.new FileOutputStream(<file_name>,true):׷��д��
		//FileOutputStream fos = new FileOutputStream("E:/writeDemo.txt");//����д��
		File temp = new File("E:/writeDemo.txt");
		temp.createNewFile();//if file already exists will do nothing
		FileOutputStream fos = new FileOutputStream("E:/writeDemo.txt",true);//׷��д��
		
		for(int i=0;i<10;i++)
			//getByte() return a byte array
			fos.write(("I like Stream \n").getBytes());
		fos.close();
	}
	
}