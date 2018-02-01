import java.util.Scanner;
import java.util.Arrays;


public class introduction2
{
	public static void main(String [] arg)
	{
		Scanner sc=new Scanner(System.in);
		
		int top=0,bottom=0;
		double smallest=2/3.0;
		double cal,diff;
		for(int i=3;i<=20;i++)
		{
			for(int j=1;j<i;j++)
			{
				if(j<=(i/2) || (j%2==0 && i%2==0))
					continue;
				cal=j/(i*1.0);
				diff=Math.abs(cal-0.618);
				if(diff<smallest)
				{
					smallest=diff;
					top=j;bottom=i;
				}
			}
		}
		System.out.println("The cloest combination is: "+top+"/"+bottom);
		
		int a,b,c;
		for(int i=100;i<=999;i++)
		{
			a=i/100;
			b=(i%100)/10;
			c=i%10;
			double sum = Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3);
			if(sum==i)
				System.out.println(i);
		}
		
		int[] my;//declaration
		my=new int [5];//refer to
		for(int i=0;i<5;i++)
		{
			my[i]=(int)(Math.random()*100+1);
			System.out.print(my[i]+" ");
			if(my[i]<my[0])
				my[0]=my[i];
		}
		System.out.println("\nthe minimum number is: "+my[0]);
		
		int[] my_2=new int [5];//declaration+refer to
		how2j_2 x=new how2j_2(); //Initialization:create an object
		for(int i=0;i<5;i++)
		x.setRandomarray(my_2);
		Arrays.sort(my_2); //Arrays.sort(a)
		System.out.println("\nthe minimum number is: "+my_2[0]);
		
		int [] my_3={34,33,25,3,6,453};
		showArray(my_3);
	
		for(int each: my_3)
		{
			if(each>my_3[0])
				my_3[0]=each;
		}
		System.out.println("\nthe biggest number is: "+my_3[0]);
		
		int my_4[]={18,62,68,82,65,9};
		int my_5[]=new int[3];
		// (void)System.arraycopy(src,start,dest,start,length);
		System.arraycopy(my_4,0,my_5,0,3);
		showArray(my_5);
		
		int length6=getRandomlength();//random number from 5 to 10;
		int length7=getRandomlength();
		int my_6[]=new int[length6];
		x.setRandomarray(my_6);
		int my_7[]=new int[length7];
		x.setRandomarray(my_7);
		int length8=length6+length7;
		int my_8[]=new int[length8];
		System.arraycopy(my_6,0,my_8,0,length6);//copy the array my_6 into array my_8
		System.arraycopy(my_7,0,my_8,length6,length7);
		showArray(my_8);
		
		int size=5;
		int [][]my2D=new int[size][size];
		for(int i=0;i<my2D.length;i++)
		{
			for(int j=0;j<my2D[i].length;j++)
			{
				my2D[i][j]=(int)(Math.random()*100);
				System.out.print(my2D[i][j]+" ");
				if(my2D[i][j]>my2D[0][0])
					my2D[0][0]=my2D[i][j];	
			}
			System.out.println();
		}
		System.out.println("the biggest number is:"+my2D[0][0]);	
		
		int d[]={16,23,67,34,2,8,456,0};
		//(return array)Array.copyOfRange(int[]original, int from, int end)
		//int from : accessiable
		//int end: unaccessialbe
		int e[]=Arrays.copyOfRange(d,0,3);
		showArray(e); //print: {16,23,67}
		
		System.out.println(Arrays.toString(d));
		//print: [16,23,67,34,2,8,456,0] --> in a list, it's convinent to check the contents
		Arrays.sort(d);
		System.out.println("the new order is: "+Arrays.toString(d));
		
		Arrays.sort(my_8);
		System.out.println(Arrays.toString(my_8));
		System.out.println("the position of number 0 is (-1: not found): "+Arrays.binarySearch(my_8,0));
		
		System.out.println("the result of comparasion to my_6 and my_7 is: "+Arrays.equals(my_6,my_7));
		
		int f[]=new int[10];
		Arrays.fill(f,5);
		System.out.println(Arrays.toString(f));
		
		int myArray[][]=new int [5][8];
		int array1D[]=new int [(5*8)]; 
		for(int i=0;i<myArray.length;i++)
		{
			x.setRandomarray(myArray[i]);
			System.arraycopy(myArray[i],0,array1D,(i*myArray[i].length),myArray[i].length);//void 
			//copy those reference to the new array,which will refer to the new one.
		}
		System.out.println(Arrays.toString(array1D));
		Arrays.sort(array1D);
		
		for(int i=0;i<myArray.length;i++)
		{
			System.arraycopy(array1D,(i*myArray[i].length),myArray[i],0,myArray[i].length);
			showArray(myArray[i]);
		}
		for(int[]row:myArray)
			System.out.println(Arrays.toString(row));//2D array: for(int[]row: 2D array)
		
		System.out.println("************");
		int [][]myArray_neat=new int[5][8];
		int []array1D_neat=new int[5*8];
		int index=0;
		for(int i=0;i<myArray_neat.length;i++)
		x.setRandomarray(myArray_neat[i]);
	    for(int[]row:myArray_neat)
			System.arraycopy(row,0,array1D_neat,8*(index++),8);
		System.out.println(Arrays.toString(array1D_neat));
		Arrays.sort(array1D_neat);
		index=0;
		for(int[]row:myArray_neat){
			System.arraycopy(array1D_neat,8*(index++),row,0,8);
			System.out.println(Arrays.toString(row));}
		
		
		
		
		
	}
	
	//assigned with random number
	public void setRandomarray(int[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			array[i]=(int)(Math.random()*100+1);// random number:[1-100]
			System.out.print(array[i]+" ");
		}System.out.println();
	}
	
	//random length:[5,10]
	public static int getRandomlength()
	{
		int length=(int)(Math.random()*5.1+5);
		return length;
	}
	
	public static void showArray(int[] array)
	{
		for(int each: array)
			System.out.print(each+" ");
		System.out.println();
	}
	
}