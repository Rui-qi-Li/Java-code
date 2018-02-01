package extends_implements_interface_exercise;

public class Item
{
	String name;//default: private attribute
	protected int price = 50;//protected: ready for inherited 
	
	public Item() {}
	public Item(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void effect() {
		System.out.println("1");
	}
}