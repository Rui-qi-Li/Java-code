package exam_exercise;
import java.util.*;
import exam_exercise.StackList;

public class lab9{
	public static void main(String[]arg) {
	Scanner sc = new Scanner(System.in);
	
	/*
	 * Go through the double-ended doubly-linked list to find the largest int value held in any of the links. If the 
	 * doubly-linked list is empty or defective in any way, return 0. The main method is already completed, you simply 
	 * have to write the search() method which reports to the main method.
	 */
	LinkedList list = new LinkedList();
	Link node = new Link(1);
	Link node2 = new Link(6);
	Link node3 = new Link(3);
	list.add(node);
	list.add(node2);
	list.add(node3);

	System.out.println(search(list));
	
	}
	public static int search(LinkedList mylist) {
		if(mylist.first == null)
			return 0;
		else {
			Link cur = mylist.first;
			int max = mylist.first.data;
			
			while(cur.next != null) {//要考虑只有一个node的情况
				if(cur != cur.next.prev)
					return 0;
				cur = cur.next;
				if(cur.data>max)//此处是已经更新的cur，且!=null
					max = cur.data;
			}
			return max;
		}
		
	}
}
class Link{
	public Link prev;
	public Link next;
	public int data;
	
	public Link(int data) {
		prev = null;
		next = null;
		this.data = data;
	}
}
//single-ended doubly-linked list
class LinkedList{
	
	public Link first;
	
	public LinkedList() {
		first = null;
	}
	public boolean isEmpty() {
		return first == null;
	}
	public void add(Link node) {
		node.next = first;
		if(!isEmpty())
			first.prev = node;//设置prev
		first = node;
	}
	public Link remove() {
		Link temp = first;
		if(!isEmpty()) {
			first = first.next;
			if(!isEmpty())
				first.prev = null;//设置prev
		}
		return temp;
	}
}