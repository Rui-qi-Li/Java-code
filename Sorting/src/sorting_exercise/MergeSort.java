package sorting_exercise;
import java.util.*;

/**
 * The MergeSort ONLY has one method called "mergeSort".
 * The other method shown bellow is the separate methods of the method "mergeSort"
 * @author asus
 *
 */
public class MergeSort{
	public static void main(String[]arg) {
		int[]array = {15,24,52,9,65,30,37,98,27,46};
		int a = array.length;
		int[]workSpace = new int[a];
		mergeSort(array,workSpace,0,a-1);
		
	}
	/**
	 * This alternative version copies the elements into the
	 * workspace first and then merges these back into array.
	 * 
	 * @param array
	 * @param workSpace
	 * @param left
	 * @param right
	 */
	public static void mergeSort(int[] array, int[] workSpace, int left, int right){
		//mid, left, right, i1,i2, i,j are all indexes.
		int mid = (left + right)/2;//compute midpoint
		if(left == right)
			return;
		mergeSort(array, workSpace,left, mid);
		mergeSort(array, workSpace, mid+1, right);
		
		//compare and merge using workspace
		for(int i : array) 
			workSpace[i] = array[i];//copies entire array into workspace
		
		int i1 = left;//"0" index of 1st part
		int i2 = mid+1;//"0" index of 2nd part
		for(int j = left; j<=right; j++) {
			if(i1>mid)//1st halve has been empty,copy all remnants of 2nd halve
				array[j] = workSpace[i2++];
			else if(i2>right)//2nd halve has been empty,copy all remnants of 1st halve
				array[j] = workSpace[i1++];
			else if(workSpace[i1]>workSpace[i2])
				array[j] = workSpace[i2++];//merge and back
			else
				array[j] = workSpace[i1++];//merge and back
		}
	}
	
	public static void merge(int[]theArray, int[]workSpace, int left, int right ) {
		int j = 0; //workspace index
		int i1 = left;//temp
		int i2 = right;//temp
		int mid = (left + right)/2;//floor around
		int n = right - left +1;
		
		while(i1<= mid && i2<=right) {
			if(theArray[i1]>theArray[i2])
				workSpace[j++] = theArray[i2++];
			else
				workSpace[j++] = theArray[i1++];
		}
		//if finish while loop there are still remnants:
		while(i1<=mid)//check first half of remaining
			workSpace[j++] = theArray[i1++];
		while(i2<=right)
			workSpace[j++] = theArray[i2++];
		for(j=0;j<n;j++)
			theArray[left+j] = workSpace[j];//copy the workspace back
	}//end merge
	
	public static void recMergeSort(int[]array,int[]workSpace,int left, int right) {
		if(left == right)
			return;//if range is 1, no use sorting
		else {
			int mid = (left + right)/2;//find midpoint
			recMergeSort(array, workSpace,left,mid);
			recMergeSort(array, workSpace, mid+1, right);
			merge(array, workSpace,left,right);
		}
	}
}
