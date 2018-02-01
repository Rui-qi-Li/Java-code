package upcase_polymorphism_exercise;
import extends_implements_interface_exercise.Item;
//extends from Item (super class) and inherited from a interface Mortal(interface)
public class MagicPotion extends Item implements Mortal{
	public void effect() {
		System.out.println("3");
	}
	
	@Override
	public void die() {
		System.out.println("you will die");
	}
}