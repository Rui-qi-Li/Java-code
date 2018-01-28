package linkedlist_exercise;
public class LinkedTest
{
	public static void main(String[]arg)
	{
		LinkedList list = new LinkedList();
		list.insertOrder("ab");
		list.insertOrder("absdfsd");
		list.insertOrder("df");
		list.insertOrder("a");
		
		//System.out.println(list.peek().data);
		DEDLinkedList doublelist = new DEDLinkedList();
		doublelist.insertHead("a");
		doublelist.insertHead("b");
		doublelist.insertHead("c");
		//doublelist.print();
		//doublelist.printReverse();
		
		doublelist.makeEmpty();
		
		doublelist.insertTail("x");
		doublelist.insertTail("y");
		doublelist.insertTail("z");
		
		doublelist.removeTail();
		//doublelist.print();
		
		doublelist.makeEmpty();
		
		doublelist.insertOrder("a");
		doublelist.insertOrder("dd");
		doublelist.insertOrder("sdfsdfsdfs");
		doublelist.insertOrder("ddss");
		
		doublelist.insertOrder("werwe");
		doublelist.insertOrder("bb");
		
		//DoubleLink temp = doublelist.delete("a");
		//DoubleLink temp = doublelist.delete("sdfsdfsdfs");
		DoubleLink temp = doublelist.delete("dd");
		doublelist.removeTail();
		
		
		doublelist.print();
		
		
	}
}