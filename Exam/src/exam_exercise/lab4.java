package exam_exercise;
import java.util.*;
public class lab4{
	public static void main(String[]arg) {
		
		/*Q1
		* Spacing between primes 
		* The goal is to read in a number N and output the distance between the prime number that preceeds it, 
		* and the prime that follows it. If the number itself happens to be prime, then output the distance 
		* to the subsequent prime. For example, if N is 7, then output 4, because the next prime is 11, 
		* which is 4 away. 
		* 
		* 2≤N≤1000
		 */
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		if(isPrime(n))
			System.out.println(add(n+1)-n);
		else {
			int big = add(n);
			int small = minus(n);
			//Math.abs(big-n)
			System.out.println(big-small);
		}
		
		/*Q2
		 * Number of primes under a limit 
		 * The goal is to read in a number N and output the number of primes below that number. For example, if N is 11, 
		 * then output 4, because there are 4 primes below 11, namely, 2, 3, 5, and 7.
		 */
		int num = sc.nextInt();
		int count = 0;
		while(num>2) {//num = 2 是最小的prime
			num = minus(num-1);
			count++;
		}
		System.out.println(count);
		
	} 
	public static boolean isPrime(int n)
	{
		if(n==2 || n==3)
			return true;
		else
			for(int i=2;i<=Math.sqrt(n);i++)
			{
				if(n%i==0)
					return false;
			}
			return true;//全部检查完了，没有整除的
	}
	
	public static int add(int n) {
		if(n==3)
			return n;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				n++;
				return add(n);//return at once!检测下一个
			}
		}
		return n;//检查没有任何能整除的，返回这个n
	}
	public static int minus(int n) {
		if(n==2 || n==3)
			return n;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				n--;//不是它，再减
				return minus(n);
			}
		}
		return n;
	}
}