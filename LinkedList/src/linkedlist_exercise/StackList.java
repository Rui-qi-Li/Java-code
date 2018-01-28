package linkedlist_exercise;

public class StackList {

private Link top; 
	
	public StackList()
	{
		top = null;
	}
	public boolean isEmtpy() 
	{
		return (top == null);
	}
	public void push(String data)
	{
		Link newLink = new Link(data);
		newLink.next = top;
		top = newLink;
	}
	public Link pop()
	{
		Link temp = top;
		top = top.next;
		return temp;
	}
	public Link peek()
	{
		Link temp = top;
		return temp;
	}
	public void printout()
	{
		Link cur = top;
		while(cur.next != null)
		{
			System.out.println(cur.data);
			cur = cur.next;
		}
	}
	
}
