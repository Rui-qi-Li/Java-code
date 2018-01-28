package linkedlist_exercise;

public class QueuesLink {

	private Link front; 
	private Link rear;
	
	public QueuesLink()
	{
		front = null;
		rear = null;
	}
	//insert data to the rear of the list
	public void insert(String data)
	{
		Link newLink = new Link(data);
		if(isEmpty())
			front = newLink;//������д��head = rear�� ��Ϊrear�����Ǻ�һ����head�޷�ͬ������
		else
			rear.next = newLink;
		rear = newLink;
	}
	//remove from the head of the list
	public Link remove()//ʹ��ʱע����isEmpty
	{
		Link temp = front;
		if(isEmpty())
			return null; // empty, nothing can be changed
		else
		{
			front = front.next;
			if(isEmpty())
				rear = null;//ͬ��rear
			return temp;
		}
	}
	public Link peek()
	{
		if(isEmpty())
			return null;
		else
			return rear;
	}
	public boolean isEmpty()
	{
		return (front == null);
	}
	public void makeEmpty()
	{
		front = null;
		rear = null;
	}
	
}
