package extends_implements_interface_exercise;

public class Caravan implements Habitable, Movable
{
	int s,max;
	
	//you must implement every single method from the interface.
	@Override
	public void move(int distance)
	{
		s += distance;
	}
	
	@Override
	public boolean canFit(int inhabitants)
	{
		return max <= inhabitants;
	}
	
	@Override
	public boolean canMove()
	{
		return true;
	}
}