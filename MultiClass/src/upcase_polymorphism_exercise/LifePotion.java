package upcase_polymorphism_exercise;
import extends_implements_interface_exercise.Item;
//extends from Item (super class) and inherited from a interface Mortal(interface)
public class LifePotion extends Item implements Mortal{
	public void effect() {
		System.out.println("2");
	}
	
	@Override
	public void die() {
		System.out.println("you won't die");
	}
}
