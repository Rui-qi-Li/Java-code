
public class StringMethod
{
	public static void main(String[] arg)
	{
		String s = "hello world";
		System.out.println(s.length());
		System.out.println(s.charAt(2));
		System.out.println(s.indexOf("e"));
		System.out.println(s.contains(""));
		System.out.println(s.equals("ehhsiehs"));
		System.out.println("it will start with: "+s.startsWith("h"));
		//compare to
		//A -> 68 a ->92 so A<a
		System.out.println("Hello".compareTo("hello"));//print: -32
		System.out.println("Hello".compareTo("HelloWorld")); //print:-5 (first one is shorter)
		System.out.println("Hello".compareTo("Helle"));//print(o-e)=10
		System.out.println("9".compareTo("A"));//print (9-A)=-8
		System.out.println("Hello".compareToIgnoreCase("Hello"));//ignore case
	}
}