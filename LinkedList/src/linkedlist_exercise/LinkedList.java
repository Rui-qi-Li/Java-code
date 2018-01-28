package linkedlist_exercise;

import java.util.NoSuchElementException;

/*
 * Linked list only contains a reference to the first link
 * This is originally set to null
 * ATTENTION: change the pointer will change the whole chain list
 */
public class LinkedList {
	/*
	 * head: reference variable
	 * always point to null
	 * it is HEAD in C++
	 */
	private Link head; 
	
	public LinkedList()
	{
		head = null;
	}
	public boolean isEmpty() 
	{
		return (head == null);
	}
	/*
	 * Inserting the first node:
	 * newLink.next point to null (nothing behind the head node)
	 * 
	 * Inserting more node
	 * newLink.next point to the PREVIOUS node (existed nodes)
	 */
	public void insertHead(String data) 
	{
		Link newLink = new Link(data); //newLink: reference variable
		newLink.next = head; // newLink point to what head point to (previous 'newLink')
		head = newLink; // update the head
	}
	public Link peek()
	{
		Link temp = head;
		return temp;
	}
	public Link deleteHead()
	{
		Link temp = head; //back up the head link
		/*
		 * "head." is equivalent to "head->", can be exchange into a actual object
		 * head->next == newLink.next
		 */
		if(isEmpty())
			throw new NoSuchElementException();
		head = head.next; 
		return temp;
	}
	
	/*
	 * with a linked list, you have to start at the beginning 
	 * of the chain and work your way along in order to find an item
	 */
	 public void printout()
	 {
		 Link cur = head;
		 while(cur != null)
		 {
			 System.out.println(cur.data);
			 cur = cur.next;
		 }
	 }
	 
	 /*
	  * Find a particular node
	  * you have to track the current pointer and the previous pointer
	  * join the current and previous pointer together
	  * fix the absence (bypass)
	  */
	 public Link delete(String key)
	 {
		 Link p = head; //current 
		 Link q = head; //previous
		 if(isEmpty())
			 return null;
		 while(p.data != key)
		 {
			 if(p.next == null)
				 return null; // didn't find it at the end
			 else
			 {
				 q = p; // copy the current pointer
				 p = p.next; // go to the next link
			 }
		 }
		 //if(p == head)
			 //head = head.next; // the first node is what we find, nothing change
		 //else
			 q.next = p.next; // copy, bypass it (change the chain structure)
		 /*
		  * "pointer." represent the actual object, not the pointer anymore
		  * so "p.next" represent the pointer belong to the object 
		  * but return "p" will only return the pointer p
		  */
		 return p;
	 }	 
	 public void insertOrder(String data)
	 {
		 /**
		  * remember, you have to change the list itself 
		  * only by using head or newLink
		  * you CANNOT change the list just with p or q 
		  * because they are pointers point to a pointer--head
		  */
		 Link newLink = new Link(data);
		 Link p = head; //assignment: you CANNOT change head by p!!
		 Link q = null;
		 
		 while(p != null && p.data.length()<data.length())
		 {
			 q = p;
			 p = p.next;
		 }
		 //the old list has already been sorted !!
		 //always concerned the situation about start at beginning !!
		 newLink.next = p; // 
		 if(q == null)//start at begin: 1. empty list; 2. the first item is larger or equal to the key data
			 //p = newLink; //worry !! you didn't change the head !!
			 head = newLink; 
		 else //not at begin, bypass it 
			 q.next = newLink; 
	 }
		
}

