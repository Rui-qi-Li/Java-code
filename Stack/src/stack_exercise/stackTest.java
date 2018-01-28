package stack_exercise;
import java.util.Scanner;

public class stackTest
{
	public static void main(String[]arg)
	{
		stack theStack = new stack(10);
		theStack.push('2');
		theStack.push('4');
		theStack.push('6');
		theStack.push('8');
		
		while(!theStack.isEmpty()) {
			System.out.println(theStack.pop());
		}
		
		//Palindromes
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a word : ");
		String word = sc.nextLine();
		stack palin = new stack(word.length());
		for (int i = 0;i<word.length();i++)
			palin.push(word.charAt(i));
		//check if the same as the original
		char[] temp = new char [word.length()];
		for (int i = 0;i<word.length();i++)
			temp[i] = palin.pop();
		String word2 = new String(temp);
		if(word.equals(word2))
			System.out.println("it's a palindromes word");
		else
			System.out.println("it's not a palindromes word");
		
		//{{{a+b}}}(())
		//}
		//{{{}()}[]}
		System.out.print("enter the symbols: ");
		String symbol = sc.nextLine();//char [] c = str.toCharArray();	
		stack match = new stack(symbol.length());
		
		char a ;
		boolean b = true;
		for(int i = 0;i<symbol.length();i++)
		{
			a =symbol.charAt(i);
			
			if(a =='(' || a == '[' || a =='{' )
				match.push(a);
			if(a ==')' || a == ']' || a =='}')
			{
				if(match.isEmpty())
				{
					b=false;
					break;
				}
				else
				{
					if(a == ')' && match.peek()=='(')
						a = match.pop();
					else if(a == ']' && match.peek()=='[')
						a = match.pop();
					else if(a == '}' && match.peek()=='{')
						a = match.pop();
					else
						break;
				}
				
			}
			
		}
		if(!b || !match.isEmpty() )
			System.out.println("not match! ");
		else
			System.out.println("match! ");
		sc.close();
		
	}
	
	
}