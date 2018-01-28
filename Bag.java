public class Bag
{
	private int currentWeight;
	
	private boolean canAddItem(Item item)
	{
		if((currentWeight + item.Weight) >20)
			return false;
		else
			return true;
	}
}