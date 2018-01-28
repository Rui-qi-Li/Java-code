/*
basic monte carlo simulation
*/
import java.util.Scanner;
public class monte_carlo
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		int n=1000;
		double count=0;
		for(int i=0;i<n;i++)
		{
			int j = Math.round(Math.random())>0.5?1:0;
			//or: (int)(Math.random()*2) -> 0 1
			if(j==1)
				count++;	
		}
		System.out.println(count/n);
	}
}