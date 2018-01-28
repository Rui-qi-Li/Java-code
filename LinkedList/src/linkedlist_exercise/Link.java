package linkedlist_exercise;
/*
 * Note that although the Link object contains another Link(next),
 * this is only a reference to the next Link
 * This is the same for any object, the label(next) is only a reference 
 * and does not represent the actual object itself
 * 
 * next = new Link() : next act as a reference to this object
 * which is created somewhere else in memory
 */
public class Link {
	
	public String data;
	public Link next;
	
	public Link(String data)
	{
		this.data =data; //next will automatically set to null
		next = null;
	}
}

