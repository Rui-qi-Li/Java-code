package exam_exercise;
import java.util.*;
public class lab10{
	public static void main(String[]arg) {
		Scanner sc = new Scanner(System.in);
		/*Q1
		 * A long which is the nth term of the Tribonnaci sequence
		 * Fn = F(n-1) + F(n-2) + F(n-3) and the first three terms are F(0)=0, F(1)=0 and F(2)=1
		 */
		int n = sc.nextInt();
		long a = 0, b = 0, c = 1;
		long d = a+b+c;
		if(n <=2)
			System.out.println(0);
		else if(n == 3)
			System.out.println(1);
		else {
			for(int i=4;i<=n;i++) {
				a = b;
				b = c;
				c = d;
				d = a+b+c;
			}
			System.out.println(d);
		}
			//triBu(n-1);
			
		
			/*Q2
			 * The goal is to read in an int and output the largest int that can be created by bit shifting the original 
			 * 32-bit number any number of positions either to the left or the right (i.e. using a single operator, 
			 * either <<, >> or >>>).
			 */
			int num = sc.nextInt();
			int record = num;
			if(num>0) 
				for(int i=0;i<32;i++) {//2^0~2^31
					if(num<<i>0)//一个一个试过去
						record = num<<i;//需要有variable接收
				}	
			else if(num<0){
				record = num>>>1;
			}
			else {}
			System.out.println(record);
			
			/* Q3
			 * Write a recursive method that takes in a bank account balance x, an interest rate i and a number of years 
			 * y, and outputs how much the bank account will be worth after y years. For example, if you invest €100 at 
			 * 2% annual interest, then after year 1 you have €102.00, after year 2 you have €104.04, after year 3 you 
			 * have €106.12 and so for
			 * 
			 * A double representing how much the bank account is worth after y years, correct to two decimal places.
			 */
			double x= sc.nextDouble(), i=sc.nextDouble();
			int y=sc.nextInt();
			System.out.println(String.format("%.2f", balance(x,i,y)));
			
			/* Q4
			 * 
			 */
			int n1 = sc.nextInt(), n2= sc.nextInt();
			int k = 0;
			if((n1&n2) >k)//括号啊！！！
				k = (n1&n2);
			if((n1|n2) >k)
				k = (n1|n2);
			if((n1^n2) >k)
				k = (n1^n2);
			if(~(n1&n2) >k)
				k = ~(n1&n2);
			if(~(n1|n2) >k)
				k = ~(n1|n2);
			if(~(n1^n2) >k)
				k = ~(n1^n2);
			
				
	}
	public static double balance(double x, double i, int y) {
		if(y == 0)
			return x;
		else
			return (1+i/100)*balance(x,i,y-1);
	}
	public static long triBU(int n) {
		long tri[] = new long [n+1];//index from 0
		tri[0]=0;
		tri[1]=0;
		tri[2]=1;
		if(n>=3) {
			for(int i=3;i<=n;i++)
				tri[i] = tri[i-1]+tri[i-2]+tri[i-3];
		}
		return tri[n];
	}
}