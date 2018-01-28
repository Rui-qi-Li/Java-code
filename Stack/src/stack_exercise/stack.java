package stack_exercise;

public class stack {
	private int maxSize;
	private char[] stackArray;
	private int top;

	public stack(int s)
	{
		maxSize = s;
		stackArray = new char [maxSize];
		top = -1;
	}
	public void push(char j)
	{
		top ++;
		stackArray[top] = j;
	}
	public char pop ()
	{
		char x = stackArray[top];
		top--;
		return x;
		
	}
	public char peek()
	{
		return stackArray[top];
	}
	public boolean isEmpty()
	{
		return (top == -1);
	}
	public boolean isFull()
	{
		return (top == maxSize-1);
	}
	public void makeEmpty()
	{
		top = -1;
	}
}
