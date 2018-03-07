package final_exercise;

public final class Room// final class cannot be inherited
{
	private double width;
	private double height;
	public final double PI = 3.14;//final variable can only be assigned once
	public static final int NUMBER = 8;// constants. public and unchangeable
	
	public Room(){}
	public Room(double width, double height)
	{
		this.width = width;
		this.height = height;
	}
	//protected your method from being override
	public final double getArea()
	{
		return width * height;
	}
	
	public static void main(String[]arg) {
		final Room r;
		r = new Room();//the reference can only point to one object
	}
}