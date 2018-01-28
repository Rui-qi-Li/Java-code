import java.util.Scanner;

public class stack_goHome
{
	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);
		Linklist goHome = new Linklist();
		String way;
		String home;
		while(true)
		{
			way = sc.nextLine();
			if(way == "end")
				break;
			if(way.compareTo("west") == 0)
			{
				home = "east";
				if(goHome.peek()!= null && goHome.peek().data == way)
					goHome.deleteHead();
				else
					goHome.insertHead(home);
				
			}
			if(way.compareTo("east") == 0)
			{
				home = "west";
				if(goHome.peek()!= null && goHome.peek().data == way)
					goHome.deleteHead();
				else
					goHome.insertHead(home);
				
			}
			if(way.compareTo("north") == 0)
			{
				home = "south";
				if(goHome.peek()!= null && goHome.peek().data == way)
					goHome.deleteHead();
				else
					goHome.insertHead(home);
				
			}
			if(way.compareTo("south") == 0)
			{
				home = "north";
				if(goHome.peek()!= null && goHome.peek().data == way)
					goHome.deleteHead();
				else
					goHome.insertHead(home);
				
			}
			
			
		}
		goHome.print();
		
	}
}