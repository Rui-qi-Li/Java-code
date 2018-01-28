public class Caravan implements Habitable, Movable
{
	
	//you must implent every single method from the interface.
	void move(int distance)
	{
		s += distance;
	}
	boolean canFit(int inhabitants)
	{
		return max <= inhabitants;
	}
	boolean canMove()
	{
		return true;
	}
}