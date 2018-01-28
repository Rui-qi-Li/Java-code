import java.util.Scanner;

public class PrimeDistance
{
	public static void main(String[]arg)
	{
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		if(isPrime(n))//return true or false
		System.out.print(n+"0");
		else
		{
			int big=add(n);
			int small=mius(n);
			if((big-n)<(n-small))
				System.out.print(big);
			else
				System.out.print(small);
				
		}
		
			
	}
	
	
	
	
	public static boolean isPrime(int n)
	{
		if(n==3)//!!!!!!!
			return true;
		else
			for(int i=2;i<Math.sqrt(n);i++)
			{
				if(n%i==0)
					return false
			}
			return true
	}
	
	
	public static int add(int n)
	{
		for(int i=2;i<Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				n++;
				return add(n);
			}
		}
		return n;
	}
}