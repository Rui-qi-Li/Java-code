/*
imporved monte carlo simulation
the possibility of 3 of 5 in 1000 times?
*/
import java.util.Scanner;
public class monte_carlo2
{
	public static void main(String[]arg)
	{
		Scanner sc=new Scanner(System.in);
		int total=Integer.parseInt(sc.nextLine());// i.e, 5
		int head=Integer.parseInt(sc.nextLine());// i.e, 3
		int n=10000;
		double count_2 =0;
		if(total==0 && head==0)
		{
			System.out.println(100);
		}
		else
		{
		for(int i=0;i<n;i++)  
		{
			if(exist(total,head))
				count_2++;
		}
		System.out.println(Math.round((count_2/n)*100));
		}
	}
	
	public static boolean exist(int total,int head)
	{
		boolean []array=new boolean[total]
		for(int i=0;i<total;i++)
			array[i]=one_try();
		
		int count=0;
		for(int i=0;i<total;i++)
		{
			if(array[i])
			{
				count++;
				if(count==head)
					return true;
			}
			else
				count==0;
		}
		return false;
	}
	
	
	public static boolean one_try()
	{
		int j = Math.round(Math.random())>0.5?1:0;
			if(j==1)
				return true;
			else
				return false;
		}
		
	}
	
}