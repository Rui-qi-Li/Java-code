import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMethod
{
	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);
		//create
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		int k = 0;
		while(true)
		{
			k = Integer.parseInt(sc.nextLine());
			if(k != -1)
				arraylist.add(k); //add to the end 
			else
				break;
		}
		arraylist.add(2,25);
		arraylist.remove(1);//index
		arraylist.remove((Object)25);//element
		//boolean exist = arraylist.contains(5);
		for(int i=0;i<arraylist.size();i++)
			System.out.print(arraylist.get(i)+" ");
		/*
		for(int x = array)
			System.out.print(x+" ");
		*/
		Integer[] array= new Integer[arraylist.size()];
		array = arraylist.toArray(array);
		System.out.println();
		System.out.println(array[0]);
		for(int x :array)
			System.out.print(x+" ");
	}
}