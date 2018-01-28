import java.util.Arrays;
import java.util.Scanner;

public class Sorting
{
	public static void main(String[] arg)
	{
		int array[] = {45,24,8,23,0,36,7,9,23,1,6,98}; 
		//bubble(array);
		//selection(array);
		//insert(array);
		//arraySort(array);
		
		Scanner sc = new Scanner(System.in);
		String numstring = sc.nextLine();
		int [] numarray = new int[numstring.length()];
		for(int i=0;i<numstring.length();i++)
			numarray[i] = Integer.parseInt(numstring.substring(i,i+1));
		System.out.println(numarray[0]);
		Arrays.sort(numarray);
		for(int x :numarray)
			System.out.print(x + " ");
		System.out.println();
	}
	
	public static void bubble(int array[])
	{
		int temp;
		for(int i=0;i<array.length;i++) //(n-1)times
		{
			for(int j=1;j<(array.length-i);j++)
			{
				if(array[j] < array[j-1])
				{
					temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;
				}
			}
			
		}
		for(int k: array)
		System.out.print(k+" ");
	}
	
	public static void selection(int array[])
	{
		int temp;
		for(int i=0;i<array.length;i++)
		{
			int key = i;
			for(int j=1+i;j<array.length;j++)
			{
				//find the minmun number
				if(array[j]<array[key])
					key = j; //marked
			}	
			temp = array[i];
			array[i] = array[key];
			array[key] = temp;
		}
		for(int k: array)
		System.out.print(k+" ");
	}
	public static void insert(int array[])
	{
		int temp;
		for(int i=1;i<array.length;i++)
		{
			int key = array[i];
			int j = i-1;
			while(j>=0 && key<array[j]) //desc
			{
				temp = array[j];
				array[j] = array[j+1];
				array[j+1] = temp;
				j--;
			}
		}
		for(int k: array)
		System.out.print(k+" ");
	}
	public static void arraySort(int array[])
	{
		int array2[] = new int[array.length];
		for(int i=0;i<array.length;i++)
			array2[i] = array[i];
		Arrays.sort(array2);
		for(int k: array2)
			System.out.print(k+" ");
		System.out.println();
	}
	/*public static void quick(int array[])
	{
			int temp;
			int pivot = array(array.length-1);
			j=0
			i= array.length-1-1<pivot
		if(array[j]>pivot && array[i]<pivot)
		{
			temp = array[j];
			array[j] = array[i];
			array[i] = temp;
		}
		else if (array[j]>pivot)
			j++;
		else if (array[i]<pivot)
			i--;
		else
		{
			
		}
			
	}*/
	
	//Arrays.sort(a);
	//int index = Arrays.binarySearch(a,number);
}