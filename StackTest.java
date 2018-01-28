import java.util.Scanner;

public class StackTest
{
    public static void main(String[] arg)
    {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	String temp = sc.nextLine();
	String[] counter = new String[n];
	int nn = 0;
	 
	while(n>0)
	{
		String symbol = sc.nextLine();//char[] c = str.toCharArray()
		Stack match = new Stack(symbol.length()); 
		 
		char a;
		boolean b = true;
		for(int i = 0;i<symbol.length();i++)
		{
			a = symbol.charAt(i);
			 
			if(a == '(' || a == '[' || a == '{')
				match.push(a);
			if(a == ')' || a == ']' || a == '}')
			{
				if(match.isEmpty())
				{
					b = false;
					break;
				}
				 
				if(a == ')' && match.peek() == '(')
					a = match.pop();
				else if (a == ']' && match.peek() == '[')
					a = match.pop();
				else if (a == '}' && match.peek() == '{')
					a = match.pop();
				else
					break;	 
			}
		}
			if(!b || !match.isEmpty())
				 counter[nn] = "NO";
			else
				 counter[nn] = "YES";
			nn++;
			n--;
	}
	for(String k : counter)
		 System.out.println(k);
 } 
}