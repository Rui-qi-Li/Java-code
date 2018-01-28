package exam_exercise;
import java.util.*;

public class lab2{
	public static void main(String[]arg)throws Exception {
		Scanner sc = new Scanner(System.in);
		
		//Q1 find the outlier of 3 numbers
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		int avg = (n1+n2+n3)/3;
		
		int onediff = Math.abs(n1-avg);//Math没有s！
		int twodiff = Math.abs(n2-avg);
		int threediff = Math.abs(n3-avg);
		
		if(onediff>twodiff && onediff>threediff)
			System.out.println(n1);
		else if(twodiff>onediff && twodiff>threediff)
			System.out.println(n2);
		else if(threediff>twodiff && threediff>onediff)
			System.out.println(n3);
		else
			System.out.println("NA");
		
		//Q2 find the xth biggest number
		int a[] = new int[sc.nextInt()];// array size 
		for(int i=0;i<a.length;i++)
			a[i] = sc.nextInt();
		//Arrays.sort(a);
		a = bubblesort(a);
		System.out.println(a[sc.nextInt()-1]);
		
	}
	//bubble sort:最小的会浮动到最右边
	public static int[] bubblesort(int a[]) {
		for(int i =0;i<a.length;i++) {
			for(int j =0;j<a.length-1-i;j++) {
				if(a[j]<a[j+1]) {//rightmost: smallest
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		return a;
	}
}