package file;

import java.io.File;
import java.util.Date;
import java.io.IOException;

public class TestFile{
	public static void main(String[]arg) {
		//1
		File f1 = new File("E:/test.txt");
		
		System.out.println(f1);
		System.out.println(f1.exists());
		System.out.println(f1.isDirectory());
		System.out.println(f1.length());
		
		long time = f1.lastModified();
		System.out.println(new Date(time).toString());
		
		File f2 = new File("E:/Javacode");
		for(String k: f2.list())//f2.list() return a String[]
			System.out.println(k);
		
		File f = new File("E:/Test/text.txt");
		if(!f.getParentFile().exists()){//is the upper folder exist
			f.getParentFile().mkdirs();//create a new folder
			f.getParent();//return the String of the folder
			f.listRoots();//list the disc
			try{
				//create must need a existed folder first!
				f.createNewFile();//createNewFile() need IOException
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		findExtreme(f2);
		travelFolder(f2);
		
		//File can also wrap folder 
		File fn = new File("E:/Javacode");//wrap the file first 
		searchFileDemo(fn);
	}
	public static void findExtreme(File f) {
		if(!f.exists())
			return;
		File[] two = new File[2];
		
		long small = Integer.MAX_VALUE;
		long large = Integer.MIN_VALUE;
		
		File[]fs = f.listFiles();
		for(File t:fs) {
			if(!t.isDirectory() && t.length()!=0) {
				if(t.length()<small)
					two[0] = t;
				else if(t.length()>large)
					two[1] = t;
			}
		}
		System.out.println(two[0].toString());
		System.out.println(two[1].toString());
	}
	public static void travelFolder(File f) {
		if(!f.exists())
			return;
		File[]fs = f.listFiles();
		for(File t: fs) {
			if(!t.isDirectory())
				System.out.println(t.getName());
			else if(t.isDirectory()) {
				System.out.println(t.getName());
				travelFolder(t);
			}
		}
	}
	//when you search, no need for Exception
	public static void searchFileDemo(File fn) {
		//return all files
		File[] fileArray = fn.listFiles();
		
		for(File f : fileArray) {
			if(f.isDirectory())
				//if f is a Directory, make a recursion
				searchFileDemo(f);
			else
				if(f.getName().endsWith(".txt"))
					System.out.println(f.getAbsolutePath());
			}
		}
	
}