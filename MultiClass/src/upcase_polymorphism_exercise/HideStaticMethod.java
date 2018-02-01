package upcase_polymorphism_exercise;

public class HideStaticMethod extends Hero implements Mortal{
	@Override
	public void die() {
		System.out.println("4");
	}
	//hide static class method
	public static void battlewin() {
		System.out.println("hide battle win");
	}
	
}