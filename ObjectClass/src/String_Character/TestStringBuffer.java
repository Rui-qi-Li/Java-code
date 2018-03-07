package String_Character;

public class TestStringBuffer{
	public static void main(String[]arg) {
		String str = "forzen";
		StringBuffer buf = new StringBuffer(str);
		
		//append : add at the last
		buf.append(" disney");//append str
		buf.append('a');//append char
		
		//delete: delete a range of string
		buf.delete(1,3);
		
		//insert "and " at index 1
		buf.insert(1, "and");
		
		//reverse()
		buf.reverse();
		System.out.println(buf);
		
		//capacity()
		System.out.println(buf.capacity());//contents length
		System.out.println(buf.length());//max capacity
		
		//conjunction
		String s1 = str+"world";
		buf.append("world");
		
		//performance
		long start = System.currentTimeMillis();
		buf.append('c');
		long over = System.currentTimeMillis();
		System.out.println(over - start);
		
	}
}
	