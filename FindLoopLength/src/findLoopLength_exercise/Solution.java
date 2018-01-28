package findLoopLength_exercise;

import java.util.*;

//import linkedlist_exercise.Link;
public class Solution
{
	public static void main(String[]arg)
	{
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		Link[]node = new Link[num];//node array
		for(int i= 0;i<num;i++)
			node[i] = new Link(sc.nextLine());//Initialise each node
		while(true)
		{
			int select = sc.nextInt();
			int next = sc.nextInt();
			if(next != -1)
				node[select].next = node[next];
			else
				break;
		}
		LinkedList mylist = new LinkedList();
		if(num>0)
			mylist.first = node[0];//point to the first one
		System.out.println(findLoopLength(mylist));
		//Link node = new Link(sc.nextLine());
		//mylist.insert(node);
			
	}
	/*Q1
	 * A loop in a linked list occurs when following the linked list chain brings you back where you started. For example, 
	 * link 1 points to link 2 which points to link 3 which points to link 1, to link 2, to link 3, to link 1...and you go 
	 * round in an infinite loop. Each test case here involves a single-ended singly-linked list with a potential loop. 
	 * Output the size of the loop, or 0 if there is no loop. In the above example, the loop is of size 3 (e.g. link 1, 
	 * link 2, link 3...repeating forever).
	 */
	public static int findLoopLength(LinkedList mylist)
	{
		//需要考虑 partial loop!
		if(mylist.isEmpty())
			return 0;
		
		int count = 0;
		Link arr[] = new Link[100];//用来装100个node
		Link temp = mylist.first;//开头
		while(temp != null)//和null.next!=null 一样，测试是否存在循环
		{
			arr[count] = temp;//装入arr[]
			//一个node是不可能构成loop的
			for(int i=0;i<count;i++)
				if(arr[i]==temp)//一个一个看是否出现相同的Link
					return count-i;//最小情况：2-0=2
			count++;
			temp = temp.next;
		}
		return 0;
	}

}
class Link
{
	public String data;
	public Link next;
	
	public Link(String data)
	{
		this.data =data; //next will automatically set to null
		next = null;
	}
}

class LinkedList {
	
	public Link first; //first must be public!
	
	public LinkedList()
	{
		first = null;
	}
	public boolean isEmpty() 
	{
		return (first == null);
	}
	
	public void insertHead(Link insert) 
	{
		insert.next = first; 
		first = insert; // update the head
	}
	/*
	 * public Link removeHead()
	 * {
	 * 		Link temp = first;
	 * 		first = first.next
	 * 		return temp; 
	 * }
	 */
}


