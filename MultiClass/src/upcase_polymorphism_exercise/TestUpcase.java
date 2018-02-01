package upcase_polymorphism_exercise;
import extends_implements_interface_exercise.Item;
public class TestUpcase{
	public static void main(String[]arg) {
		Item i1 = new LifePotion(); // extend from super class
		Item i2 = new MagicPotion();
		
		i1.effect();//"2"
		i2.effect();//"3"
	}
}