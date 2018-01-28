package exam_exercise;
import java.util.*;

public class lab7_1{
	public static void main(String[]arg) {
		Scanner sc = new Scanner(System.in);
		StackList2 list = new StackList2();
		String s[];
		//hasNext() from System.in is a default infinite loop
		while(true){
			s = sc.nextLine().split(" ");
			if(s[0].equals("Arrived"))
				break;
			if(s[1].equals("Back"))
				list.pop();//可以不设任何接收variable
			else
				list.push(s[1]);
		}
		if(!list.isEmpty()) {//空list 不可能有null.data!
			String temp = list.pop().data;
			
			if(temp.equals("North"))
				System.out.println("Go South");
			else if(temp.equals("South"))
				System.out.println("Go North");
			else if(temp.equals("West"))
				System.out.println("Go East");
			else if(temp.equals("East"))
				System.out.println("Go West");
		}
	}
	
}
class StackList2{
	
	public static class Link2{
		public String data;
		public Link2 next;
		
		public Link2(String data) {
			this.data = data;
			next = null;
		}
	}
	private Link2 head; 
	
	public StackList2() {
		head = null;
	}
	public boolean isEmpty() {
		return (head == null);
	}
	public void push(String data) {
		Link2 newLink = new Link2(data);
		newLink.next = head;
		head = newLink;
	}
	public Link2 pop() {
		if(isEmpty())
			return null;
		Link2 temp = head;
		head = head.next;
		return temp;
	}
}