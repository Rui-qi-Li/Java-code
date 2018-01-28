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
		double avg = sum/n;//�õ�ƽ��ֵ
		double closest = Math.abs(arr[0]-avg);//[0]��ƽ��ֵ�ľ���
		
		
		for(int i=0;i<n;i++) {
			temp = Math.abs(arr[i]-avg);
			if(temp < closest) {//the earliest!
				closest = temp;//��¼
				index = i;//��¼
			}
		}
		System.out.println(arr[index]);
		
		//Q2 find the mode ����
		int num = sc.nextInt();
		int data[] = new int[num]; //array size
		for(int i=0;i<num;i++) {
			data[i] = sc.nextInt();
		}
		
		int count, record = 1;//���ٳ���һ�Σ�record = 1
		int x = Integer.MIN_VALUE;
		for(int i=0;i<num;i++) {
			count =0;
			for(int j=0;j<num;j++) {//ÿ�ζ�Ҫ��ͷ��飡��
				if(data[i]==data[j])
					count++;//���� ����һ��
			}
			if(count>=record) {//����record��value
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