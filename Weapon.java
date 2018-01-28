public class Weapon extends Item
{
	int damage;//default: private attribute
	
	public void display()
	{
		System.out.println("Weapon display:");
	}
	public void display(Item armor)//pass a object as a argument into parameter lists
	{
		System.out.println(name+"is best match with "+armor.name);
	}
	public void display(Item ... others)//others[] is a array of objects
	{
		for(int i=0;i<others.length;i++)
			System.out.println(name+"is best match with "+others[i].name);
	}
	public static void main(String [] arg)
	{
		Weapon blade=new Weapon();
		blade.damage=65;// this private attribute can be accessed in this class
		blade.name="KILL";// this private attribute is inherited from super class--Item
		blade.price=3600;
		
		Weapon arrow=new Weapon();
		arrow.damage=50;//chird class
		arrow.name="SORE";//inherited from super class
		arrow.price=2800;//inherited from super class
		
		Item armor=new Item();//super class constructor
		armor.name="cloth";//initialization to super class
		
		Item accessories=new Item();
		accessories.name="necklace";
		
		blade.display();
		blade.display(armor);
		blade.display(armor,accessories);
	}
}