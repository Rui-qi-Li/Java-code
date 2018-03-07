package exception_exercise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class TestException{
	public static void main(String[]arg) {
		File f = new File("d:/aaa.exe");
		
		//try,catch,finally must use code block {}
		try {
			new FileInputStream(f);//try to open the file
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date d = sdf.parse("2017-10-21");	
		}
		//单|， 用一个e
		catch(FileNotFoundException | ParseException e) {//记不住写Exception
			if(e instanceof FileNotFoundException)
				System.out.println("file is not existed");
			if(e instanceof ParseException)
				System.out.println("format error");
			e.printStackTrace();
		}
		finally {
			System.out.println("run no matter what happen");
		}
		try {
			method1();
		}catch(Exception e){//Exception 是上层class
			e.printStackTrace();
		}
		
	}
	//when meet the exception, the method1() will throw it to the main method 
	public static void method1()throws Exception {
		File f = new File("notExisted.exe");
		new FileInputStream(f);
	}
}