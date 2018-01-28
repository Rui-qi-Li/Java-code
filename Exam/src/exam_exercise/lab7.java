package exam_exercise;
import java.util.*;

public class lab7{
	public static void main(String[]arg) {
		Scanner sc = new Scanner(System.in);
		
		//Q1 
		int n = Integer.parseInt(sc.nextLine());
		String values[] = new String[n];
		for(int i =0;i<n;i++) {
			values[i] = sc.nextLine();
		}
		braces(values);
		for(int i=0;i<n;i++)
			System.out.println(values[i]);
		 
		/* Q2
		 * In this task you will get a set of instructions to get from a home location to a destination location. You have 
		 * to give the instructions which begin at the destination location and return to the home location. In other words,
		 * you need to reverse the directions. Sometimes a mistake will be make with the directions, meaning that the latest 
		 * direction should be deleted. The possible set of directions is "Go North", "Go South", "Go East" and "Go West". 
		 * 
		 * Another possible instruction is "Go Back" which means to undo the latest step. The instruction "Arrived" means 
		 * the sequence of directions is complete.
		 * 
		 * Sample Input
		 * Go North
		 * Go North
		 * Go West
		 * Go Back
		 * Arrived
		 * 
		 * Sample Output
		 * Go South
		 * Go South
		 */
		StackList list = new StackList();//changeable list
		String s[];
		//hasNext() from System.in is a default infinite loop
		while(sc.hasNextLine()) {
			s = sc.nextLine().split(" ");//string.split(" ")
			if(s[0].equals("Arrived"))
				break;
			if(s[1].matches("Back"))
				list.pop();//可以不接收
			else
				list.push(s[1]);	
		}
		String temp;
		while(!list.isEmpty()) {//while loop!
			temp = list.pop().data;//class Link should be public
			if(temp.matches("North"))
				System.out.println("Go South");
			else if(temp.matches("South"))
				System.out.println("Go North");
			else if(temp.matches("West"))
				System.out.println("Go East");
			else if(temp.matches("East"))
				System.out.println("Go West");
		}
	}
	public static void braces(String[] values) {
		String s;
		char c;
		for(int i =0;i<values.length;i++) {//each string 
			s = values[i];
			Stack match = new Stack(s.length());
			
			for(int j = 0;j<s.length();j++) {//each char, string is an object, using length()
				c = s.charAt(j);
				if(c == '(' || c == '[' || c == '{')
					match.push(c);
				else if(c == ')' || c == ']' || c == '}') {
					if(match.isEmpty()) {
						match.push(c);
						break;//break the whole inner loop
					}
					else if(c == ')' && match.peek()=='(')
						match.pop();
					else if(c == ']' && match.peek()=='[')
						match.pop();
					else if(c == '}' && match.peek()=='{')
						match.pop();
					else
						break;
				}
			}
			if(!match.isEmpty())
				values[i] = "NO";
			else
				values[i] = "YES";
		}
	}
}

/* Q1
 * For every opening brace (i.e., (, {, or [), there is a matching closing brace (i.e., ), }, or ]) of the same type 
 * (i.e., ( matches ), { matches }, and [matches ]). An opening brace must appear before (to the left of) its matching 
 * closing brace. For example, ]{}[ is not balanced.
 * 
 * No unmatched braces lie between some pair of matched braces. For example, ({[]}) is balanced, but {[}] and [{)] are 
 * not balanced.
 * 
 * Complete the braces function in the editor below. 
 * The function must return an array of strings where the string at each index i (where 0 ≤ i < n) denotes whether or not 
 * all the braces in string values were balanced. If yes, then index i in the return array must contain the string YES; 
 * otherwise, index i in the return array must contain the string NO.
 */
class Stack{
	private int maxSize;
	private char[] stackArray;
	private int top;
	
	public Stack(int s) {
		maxSize = s;
		stackArray = new char[maxSize];
		top = -1;//加在top上!!!
	}
	public void push(char j) {
		if(isFull()) {}
		stackArray[++top] = j;
	}
	public char pop() {
		if(isEmpty())//check empty!
			return ' ';
		return stackArray[top--];
	}
	public char peek() {
		return stackArray[top];
	}
	public boolean isEmpty() {
		return (top == -1);
	}
	public boolean isFull() {
		return (top == maxSize - 1);
	}
} 

class StackList{
	//inner helper class Link
	public static class Link{
		public String data;
		public Link next;
		
		public Link(String data) {
			this.data = data;
			next = null;
		}
	}
	private Link head; //head is pointer (no data)
	
	public StackList() {
		head = null;
	}
	public boolean isEmpty() {
		return (head == null);
	}
	public void push(String data) {
		Link newLink = new Link(data);//"new" object
		newLink.next = head;
		head = newLink;//head point to object
	}
	public Link pop() {
		if(isEmpty())
			return null;
		Link temp = head;//temp: pointer
		head = head.next;
		return temp;
	}
	public Link peek() {
		return head;
	}
	public void print() {
		Link cur = head;
		while(cur != null) {
			System.out.println(cur.data);
			cur = cur.next;
		}
		
	}
}