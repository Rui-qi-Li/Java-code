package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SplitCombine {
	public static void main(String[]arg)throws IOException{
		
		File f1 = new File("E:/database.txt");//database.txt is over 100K
		String fileName = f1.getAbsolutePath();
		byte[]data1 = new byte[(int)(f1.length())];//»º³åÇø´óÐ¡
		long splitNum = f1.length()/102400;
		
		FileInputStream fis = new FileInputStream(f1);
		fis.read(data1);//information has upload into data1 byte array
		fis.close();
		
		for(int i=0;i<splitNum;i++) {
			//1K = 100b
			int restSize = (int)(f1.length()-102400*i);//bytes
			//if no such a file, it will create a new file
			File fn = new File(fileName+i);
			FileOutputStream fos = new FileOutputStream(fn);
			//Writes len bytes from the specified byte array starting 
			//at offset off to this file output stream.
			//when no file exist, FileOutputStream will create a new file and write something into it
			fos.write(data1, i*102400,102400);
			fos.close();
		}
		FileOutputStream fos = new FileOutputStream(f1);
	}
}
