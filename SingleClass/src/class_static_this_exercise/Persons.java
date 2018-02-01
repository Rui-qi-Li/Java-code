package class_static_this_exercise;

public class Persons
{
	public static int instanceCount;
	public int localCount;
	
	public Persons()
	{
		instanceCount++;
		localCount++;
	}
	public static int addSum(int a, int b)
	{
		return (a+b);
	}
	
	public static void main(String[] arg)
	{
		Persons person1 = new Persons();
		Persons person2 = new Persons();
		Persons person3 = new Persons();
		Persons person4 = new Persons();
		
		System.out.println("(" + person4.localCount + "," + Persons.instanceCount + ")");
		int a = 4;
		int b = 5;
		System.out.println(addSum(a,b));
	}
	
}