package queues_exericese;

public class priQueues 
{
	private int maxSize;
	private long[] queArray;
	private int n;
	
	public priQueues(int s)
	{
		maxSize = s;
		queArray = new long[maxSize];
		n = 0;
	}
	
	public void insert(long j)
	{
		if(isFull())
			System.out.println("full!");
		if(n == 0)
		{
			queArray[0] = j;
			n++;
		}
		else
		{
			int mark = 0;
			for(int i=0;i<=n;i++)
			{
				if(queArray[i]<j)
					mark++;
				else
					queArray[i+1] = queArray[i];
			}
			queArray[mark] = j;
			n++;
		}
	}
	 public long remove()
	 {
		 if(isEmpty())
			 System.out.println("empty!");;
		 return queArray[0];
	 }
	 
	 public boolean isFull()
	 {
		 return (n == maxSize);
	 }
	 public boolean isEmpty()
	 {
		 return (n == 0);
	 }
}
