package String_Character;

public interface iStringBuffer{
	public void append(String str);
	public void append(char c);
	public void insert(int pos, String s);
	public void insert(int pos, char c);
	public void delete(int start);
	public void delete(int start,int end);
	public void reverse();
	public int length();
}