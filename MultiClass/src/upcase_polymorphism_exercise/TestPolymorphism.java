package upcase_polymorphism_exercise;
import extends_implements_interface_exercise.Item;

public class TestPolymorphism extends Hero{
	public static void main(String[]arg) {
		Hero exa = new Hero();
		exa.name = "garen";
		
		LifePotion l1 = new LifePotion();
		MagicPotion l2 = new MagicPotion();
		
		exa.useItem(l1);//up casting
		exa.useItem(l2);//up casting
		
		exa.kill(l1);//inherited interface
		exa.kill(l2);//inherited interface
		
		Hero.battleWin();
		HideStaticMethod.battlewin();//hide static class method
	}
}