package extends_implements_interface_exercise;

public class SuperUse extends Item{
	int level;
	
	public SuperUse(String name) {
		super(name);//call super class's constructor 
		System.out.println("the name of armor is "+name);
	}
	
	public int getPrice() {
		return this.price;//return object member
	}
	
	public int getPrice2() {
		return super.price;//return super class member
	}
	
	public void effect() {
		System.out.println("SuperUse override method");
		super.effect();//call super class method
	}
}

