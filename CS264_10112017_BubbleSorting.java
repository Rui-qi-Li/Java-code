import java.util.Scanner;

public class CS264_10112017_BubbleSorting
{
public static void main(String[] arg)
{
	Scanner sc = new Scanner(System.in);
	int n = Integer.parseInt(sc.nextLine());
	int x = Integer.parseInt(sc.nextLine());
	String[] array = new String[n];
	for(int i=0;i<n;++i)
		array[i] = sc.nextLine();
	bubble(array);
	System.out.println("**************");
	for(String xx : array)
		System.out.println(xx);
	System.out.println("the special element is: "+array[x-1]);
}
public static void bubble(String array[])
{
	String temp = " ";
	for(int i=0;i<array.length;i++) //(n-1)times
	{
		for(int j=1;j<(array.length-i);j++)
		{
			if(array[j].length() < array[j-1].length())
			{
				temp = array[j-1];
				array[j-1] = array[j];
				array[j] = temp;
			}
			else if(array[j].length() == array[j-1].length())
			{
				if(array[j].compareTo(array[j-1]) > 0)
				{
					temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;
				}
			} 
		}
	}
}
}
