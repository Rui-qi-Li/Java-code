package exam_exercise;
import java.util.*;

public class lab3{
	public static void main(String[]arg)throws Exception {
		Scanner sc = new Scanner(System.in);
		
		//Q1 find the closest to the average
		int n = sc.nextInt();
		int arr[] = new int[n];//array size
		int index = 0;
		double sum = 0;
		double temp = 0;
		
		for(int i =0;i<n;i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		double avg = sum/n;//得到平均值
		double closest = Math.abs(arr[0]-avg);//[0]离平均值的距离
		
		
		for(int i=0;i<n;i++) {
			temp = Math.abs(arr[i]-avg);
			if(temp < closest) {//the earliest!
				closest = temp;//记录
				index = i;//记录
			}
		}
		System.out.println(arr[index]);
		
		//Q2 find the mode 众数
		int num = sc.nextInt();
		int data[] = new int[num]; //array size
		for(int i=0;i<num;i++) {
			data[i] = sc.nextInt();
		}
		
		int count, record = 1;//至少出现一次，record = 1
		int x = Integer.MIN_VALUE;
		for(int i=0;i<num;i++) {
			count =0;
			for(int j=0;j<num;j++) {//每次都要从头检查！！
				if(data[i]==data[j])
					count++;//至少 出现一次
			}
			if(count>=record) {//更新record和value
				if(count>record)
					x = data[i];
				else
					x = Math.min(x, data[i]);
				record = count;
			}
		}
		System.out.println(x);
	}
}