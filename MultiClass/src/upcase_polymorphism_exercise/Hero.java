package upcase_polymorphism_exercise;

import extends_implements_interface_exercise.Item;

public class Hero{
	protected String name;
	protected float hp;
	static String copyright;
	
	public Hero() {}
	public Hero(String name) {
		this.name = name;
	}
	//class method
	public static void battleWin() {
		System.out.println("battel win");
	}
	//Mortal ... m : array
	public void kill(Mortal ... m) {
		for(int i = 0;i<m.length;i++)
			m[i].die();
	}
	
	public void useItem(Item item) {
		item.effect();
	}
	
}