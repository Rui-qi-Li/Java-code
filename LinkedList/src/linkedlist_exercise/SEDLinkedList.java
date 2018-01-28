package linkedlist_exercise;
//Handy for implementing a queue (items arrive one end and leave at the other)
public class SEDLinkedList {

	private Link head; 
	private Link tail;
	
	public SEDLinkedList()
	{
		head = null;
		tail = null;
	}
	
	public void insertHead(String data) 
	{
		Link newLink = new Link(data); 
		newLink.next = head; // point to new object (link)
		if(isEmpty())
			tail = newLink;
		head = newLink; //point to new object (head) 
		
	}
	public void insertTail(String data) 
	{
		Link newLink = new Link(data); 
		newLink.next = null; //point to null (null)
		if(isEmpty())
			head = newLink;
		else
			tail.next = newLink; //tail. represent the actual object, point to new object (link)
		tail = newLink; // update: point to new object (tail) 
		
	}
	public Link deleteHead()
	{
		Link temp = head; 
		head = head.next; //point to new object (head) 
		return temp;
	}
	public boolean isEmpty()
	{
		return (head == null);
	}
	public Link deleteTail() 
	{
		Link temp = head;
		while(temp.next != tail)
			temp = temp.next;
		tail = temp; //save
		return temp.next;
	}
	
	
	
	
}
