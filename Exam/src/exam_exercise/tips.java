package exam_exercise;
import java.util.*;

public class tips{
	public static void main(String[]arg) {
		int n = 2;
		int test[] = new int[4];
		test[0]=000;
		test[1]=111;
		test[2]=222;
		test[3]=333;
		
		System.out.println(test[++n]);//[new],then n+1
		n=2;
		System.out.println(test[n++]);//[old],then n+1
		
	}
}