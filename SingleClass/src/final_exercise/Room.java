package final_exercise;

public class Room
{
	private double width;
	private double height;
	public final double PI = 3.14;
	
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
}