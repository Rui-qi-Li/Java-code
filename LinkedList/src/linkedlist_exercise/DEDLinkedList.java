package linkedlist_exercise;
/**
 * this class implements a doubly linked list 
 * it contain a default and a parameterized constructor
 * every item(data) has 2 pointer to the previous item and next item
 * @author RUIQI LI
 *
 */
public class DEDLinkedList {
	private DoubleLink head;
	private DoubleLink tail;
	//prev and next are set by nodes themselves!
	
	//DEDLinkedList is just a iterator !
	public DEDLinkedList()
	{
		head = null;
		tail = null;
	}
	public boolean isEmpty()
	{
		return (head == null);
	}
	
	//queue.add()
	public void insertHead(String data)
	{
		DoubleLink newLink = new DoubleLink(data);
		if(isEmpty())
			tail = newLink; // empty list: tail is affected
		
		//just modify "head." and "head"
		else
			head.prev = newLink; //newLink <-- old head. object
		
		newLink.next = head;
		head = newLink;	
	}
	public void insertTail(String data)
	{
		DoubleLink newLink = new DoubleLink(data);
		if(isEmpty())
			head = newLink;
		
		//just modify "tail." and "tail"
		else
			tail.next = newLink;
		
		newLink.prev = tail;
		tail = newLink;
	}
	
	//removeHead(): all things happen on "head."
	public DoubleLink removeHead()
	{
		DoubleLink temp = head;
		
		if(isEmpty())
			return null;
		if(head == tail)
			tail = null; //1 item: tail is affected

		head = head.next;
		head.prev = null;
		//do not need to change the old "head.next", because it cannot be accessed
		return temp;
	}
	
	//removeHead(): all things happen on "tail."
	//queue.remove()
	public DoubleLink removeTail()
	{
		DoubleLink temp = tail;
		
		if(isEmpty())
			return null;
		if(head == tail)
			head = null;
		
		tail = tail.prev;
		tail.next = null;
		//do not need to change old "tail.prev", because it cannot be accessed
		return temp;
	}
	public void print()
	{
		DoubleLink cur = head;
		while(cur != null)
		{
			System.out.println(cur.data);
			cur = cur.next;
		}
	}
	
	public void printReverse() 
	{
		DoubleLink cur = tail;
		while(cur != null)
		{
			System.out.println(cur.data);
			cur = cur.prev;
		}
	}
	public void makeEmpty()
	{
		head = null;
		tail = null;
	}
	
	//all things happen on "head." !!
	//priority queue
	public void insertOrder(String data)
	{
		DoubleLink newLink = new DoubleLink(data);
		DoubleLink temp = head;
		
		while(temp != null && temp.data.length()<data.length())
			temp = temp.next;
		if(temp == head) //1. empty list 2.only has 1 item
			insertHead(data);
		else if(temp == null)//universe all the list, data is the largest 
			insertTail(data);
		else //in the middle
		{
			//newLink should insert before temp
			newLink.prev = temp.prev; //step 1;
			temp.prev.next = newLink; // step 2;
			newLink.next = temp; // (!!) step 3
			temp.prev = newLink; // step 4	
		}
	}
	public DoubleLink delete(String data)
	{
		DoubleLink temp = head; //from head
	
		while(temp != null && temp.data != data)
			temp = temp.next;
		
		if(temp == null)//1. empty list 2.didn't find it
			return null;
		else if(temp == head) //temp is the first item
			temp = removeHead();
		else if(temp == tail) //temp is the last item
			temp = removeTail();
		else //in the middle 
			temp.prev.next = temp.next;
		  //temp.next.prev = temp.prev;
		return temp;
	}
	

}
