package queues_exericese;

public class Queues {

	private int maxSize;
	private long[] queArray;
	private int front;
	private int rear;
	private int nItems;
	
	public Queues(int s)
	{
		maxSize = s;
		queArray = new long[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}
	
	public void insert(long j) //put item at rear of queues
	{
		if(isFull())
			System.out.println("full!"); //don't insert if full
		else {
			if(rear == maxSize-1) //deal with wrapround
				rear = -1;
			rear++;
			queArray[rear] = j; //increment rear and insert
			nItems++; //one more item
		}
	}
	
	public long remove() //take item from front of queue
	{
		if(isEmpty())
			System.out.println("empty!"); //don't remove if empty (front > rear and you cannot get the value of queArray[front])
		long temp = queArray[front]; //get value and increment front
		if(front == maxSize) //dear with wrapround
			front = 0; 
		front++;
		nItems--; //one less items
		return temp;
	}
	
	public boolean isFull()
	{
		return (nItems == maxSize);
	}
	
	public boolean isEmpty()
	{
		return (nItems == 0);
	}
	
	public long peek()
	{
		return queArray[front];
	}
	
	public int nItems()
	{
		return nItems;
	}
}

