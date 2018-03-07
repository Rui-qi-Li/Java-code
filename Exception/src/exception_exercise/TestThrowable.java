package exception_exercise;
import java.io.File;
import java.io.FileInputStream;

public class TestThrowable{
	public static void main(String[]arg) {
		File f = new File("d:/haha.exe");
		
		try {
			method2();
		}catch(Throwable t){//Throwable  «…œ…œ≤„class
			t.printStackTrace();
		}
	}
	public static void method2()throws Throwable {
		File f = new File("notExisted.exe");
		new FileInputStream(f);
	}
}