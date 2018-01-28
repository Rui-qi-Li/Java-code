public class Linklist
{
	private Link head;
	
	public Linklist()
	{
		head = null;
	}
	public boolean isEmpty()
	{
		return (head == null);
	}
	
	public void insertHead(String data)
	{
		Link newLink = new Link(data);
		newLink.next = head; // point to what head point to 
		head = newLink;
	}
	public Link peek()
	{
		Link temp = head;
		return temp;
	}
	public Link deleteHead()
	{
		Link temp = head;
		head = head.next; // head->next == newLink.next, a new pointer
		return temp;
	}
	public void print()
	{
		Link cur = head;
		while(cur != null)
		{
			System.out.println(cur.data);
			cur = cur.next;
		}
	}
}