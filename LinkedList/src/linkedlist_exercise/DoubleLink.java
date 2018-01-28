package linkedlist_exercise;

public class DoubleLink {

	public DoubleLink prev;
	public String data;
	public DoubleLink next;
	
	
	public DoubleLink(String data)
	{
		this.data = data; 
		prev = null;
		next = null;
	}
	
}
