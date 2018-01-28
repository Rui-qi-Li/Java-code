package exam_exercise;
import java.util.*;

public class lab5{
	public static void main(String[]arg) {
		Scanner sc = new Scanner(System.in);
		
		/*Q1 Problem Statement
		 *The goal is to read in a number of fair coin tosses, and the probability that a given coin toss will produce heads, 
		 *and output the probability that the majority of coin tosses will be heads, rounded to the nearest percent.
		 */
		
		double tosses = sc.nextInt();
		double onepro = sc.nextInt();
		
		int count = 0;
		int simulations = 100000;
		
		for(int i =0;i<simulations;i++) {//simulation times
			double total = 0;
			for(int j =0;j<tosses;j++) {//each toss
				if(Math.random()<onepro/100.0)//show heads，(0,1]落在onepro里的情况
					total++;
			}
			if(total>tosses/2.0)//majority show heads
				count++;
		}
		//Math.round()+0.5 再做地板除
		System.out.println(Math.round(count*100/simulations));//round to the nearest percent
		
		/*Q2
		 * The goal is to read in a number of fair coin tosses, and a target number of heads, and output the probability 
		 * that the target number of heads in a row will be tossed at some point in the sequence, rounded to the nearest 
		 * percent.
		 */
		
		int tosses2 = sc.nextInt();// i.e, 50
		int heads = sc.nextInt();// i.e, 7
		double simulations2=100000;
		double count_2 =0;
		
		for(int i=0;i<simulations2;i++)
		{
			int record = 0;
			for(int j = 0;j<tosses2;j++) {//each toss
				if(Math.random()>0.5) {
					record++;
					if(record == heads)//只有一次相等的机会
						count_2++;
				}
				else
					record = 0;
			}
		}
		System.out.println(Math.round(count_2*100/simulations2));//round to the nearest percent
	}
}
