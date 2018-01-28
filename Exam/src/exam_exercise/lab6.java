package exam_exercise;
import java.util.*;

public class lab6{
	public static void main(String[]arg) {
		
		/*Q1
		 * In this task the input is two numbers, followed by a series of strings. Those strings must be sorted and then 
		 * one particular string must be outputted. The first number denotes the quantity of strings to follow. 
		 * The second number indicates which string should be outputted following the sort. For example, if it's a 3, 
		 * then output the string that falls in third place. If it's a 5 then output the string that falls in fifth place.
		 * 
		 * The sorting that should be applied is as follows: sort words by their length, with the shortest words coming 
		 * first. If two words have the same length, then sort them in reverse alphabetical order (i.e. with "zoo" coming 
		 * ahead of "ape").
		 * 
		 * Sample Input
		 * 6
		 * 3
		 * this
		 * is
		 * how
		 * to
		 * do
		 * it
		 * 
		 * Sample Output
		 * is
		 */
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());//how many words
		int x = Integer.parseInt(sc.nextLine());//chosen one
		String array[] = new String[n];
		
		for(int i=0;i<n;i++)
			array[i] = sc.nextLine();
		bubble(array);
		System.out.println(array[x-1]);
		
		/*Q2
		 * The goal is to read in a list of students and their exam scores into an array, sort the class by their exam 
		 * scores, and output the name of the student with a particular ranking.
		 * TIP: To avoid issues with a scanner when reading a line after reading a number, you can read in the number 
		 * using Integer.parseInt(scan.nextLine()) where scan in the name of the Scanner you are using.
		 * 
		 * Sample Input
		 * 5
		 * 2
		 * Eoin
		 * 18
		 * Claire
		 * 94
		 * David
		 * 34
		 * Dylan
		 * 69
		 * John
		 * 25
		 * 
		 * Sample Output
		 * Dylan
		 */
		int num = Integer.parseInt(sc.nextLine()),r = Integer.parseInt(sc.nextLine());
		String array2[] = new String [num];
		int score[] = new int[num];
		
		for(int i=0;i<num;i++) {//同步
			array2[i] = sc.nextLine();
			score[i] = Integer.parseInt(sc.nextLine());
		}
		sort2(array2,score);
		System.out.println(array2[r-1]);
		
	}
	//Q1 冒泡排序要想好是最大推到最后， 还是最小推到最后
	public static void bubble(String array[]) {
		String temp = " ";
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length-i-1;j++) {//最大推到最后，每次都要从第一个检查
					if(compare(array[j],array[j+1])<0) {
						temp = array[j];
						array[j] = array[j+1];
						array[j+1] = temp;
					}
			}
		}
	}
	//Q1 目的：只做一次交换
	public static int compare (String s1, String s2) {
		if(s2.length()-s1.length() == 0)
			return s1.compareTo(s2);//reverse alphabetically 
		return s2.length()-s1.length();	//长度要越往后越大
	}
	//Q2 两个array同步sorting
	public static void sort2(String a[], int b[]) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(b[j]<b[j+1]) {//推最大
					swap(b,j);
					swap(a,j);
				}
			}
		}
	}
	
	public static void swap(String a[], int x) {
		String temp = a[x];
		a[x] = a[x+1];
		a[x+1] = temp;
	}
	public static void swap(int b[], int x) {
		int temp = b[x];
		b[x] = b[x+1];
		b[x+1] = temp;
	}
	public static void selection(int a[]) {//找到最值，并放到正确的位置
		int key,temp;
		for(int i=0;i<a.length-1;i++) {
			key = i;
			for(int j=i+1;j<a.length;j++) {//永远在跟之后的数比较，找到最值
				if(a[j]<a[i])
					key = j;
			}//find the smallest index
			temp = a[i];
			a[i] = a[key];
			a[key] = temp;
		}
		
	}
	public static void insert(int a[]) {
		int temp;
		for(int i=1;i<a.length;i++) {//永远在跟之前的数比较,插入之前的数列之中
			for(int j=i-1;j>=0;j--) {//j-- !!
				if(a[j]>a[i]) {//from smallest to biggest
					temp = a[j];
					a[j] = a[i];
					a[i] = a[j];
				}
			}
		}
	}
}