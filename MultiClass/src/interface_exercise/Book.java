package interface_exercise;

public class Book
{
	protected String title;
	protected String author;
	protected boolean isBorrowed;
	protected int numberOfPage;
	
	public Book(){}
		
	public Book(String title, String author, int num)
	{
		this.title = title;
		this.author = author;
		numberOfPage = num;
	}
	
	public void borrowBook()
	{
		isBorrowed = true;
	}
	public void returnBook()
	{
		isBorrowed = false;
	}
	
	public boolean isBookBorrowed()
	{
		return isBorrowed;
	}
}