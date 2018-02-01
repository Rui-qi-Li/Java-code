package interface_exercise;

public class Books extends Book implements Comparable
{	
	public int compareTo(Book specifiedBook)
	{
		//first check if they have different page counts
		return this.numberOfPage - specifiedBook.numberOfPage;
			
	}
}