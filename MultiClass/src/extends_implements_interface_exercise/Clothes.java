package extends_implements_interface_exercise;

public class Clothes extends Item
{
	public void setPrice(Item ... others)
	{
		for(int i=0;i<others.length;i++)
		{
			others[i].price=(i+1000);
			System.out.println(name+"give a price to the "+(i+1)+"st item: "+others[i].price);
		}
	}
	
	public static void main(String[] arg)
	{
		Clothes top=new Clothes();
		top.name="Pennys";
		top.price=35;
		
		Clothes trousers=new Clothes();
		trousers.name="Topshop";
		trousers.price=55;
		
		Item accessories1=new Item();
		Item accessories2=new Item();
		
		top.setPrice(accessories1,accessories2);
		
	}
}