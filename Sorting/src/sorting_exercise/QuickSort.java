package sorting_exercise;
import java.util.Arrays;

public class QuickSort{
	public static void main(String[]arg) {
		int[]array = {15,24,52,9,65,30,37,98,27,46};
		int left = 0;
		int right = array.length-1;//rightmost:pivot
		quickSort(array,left,right);
	}
	public static void quickSort(int[] array,int left,int right) {
		if(right - left <= 0)
			return;
		//in case the array size = 1/0, means already sorted
		
		//low,high are both index
		int low = left;
		int pivot = right;
		int high = right-1;
		
		while(true) {
			while(array[low]<array[pivot])//find the 1st larger element
				low++;//Extreme: low == pivot => right order
			while(array[high]>array[pivot] && high >0)//find the 1st smaller element
				high--;//Extreme: high = 0 => reverse order
			if(high>low) 
				swap(array,low++,high--);//swap the low and high
				
			else//if the pointer cross, means the right position for pivot is marked
				break;
		}
		//now, low>=high
		swap(array,low,pivot);//test:3,5 (test:5,3 test:2,2) test:3,3,3
		System.out.println(Arrays.toString(array));
		quickSort(array,left,low-1);
		quickSort(array,low+1,right);
	}
	public static void swap(int[]array,int a, int b) {
		int temp = 0;
		temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
	
}