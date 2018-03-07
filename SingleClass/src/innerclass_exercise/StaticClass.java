package innerclass_exercise;

public class StaticClass{
	String name;
	protected int moveSpeed;
	
	private static void battlewin() {
		System.out.println("win");
	}
	
	//there is no different between inner static class and a normal class
	//except it can access the private static member.
	static class result{
		
		public void show() {
			StaticClass.battlewin();
		}
	}
	
	//new outsideclass.innerclass();
	public static void main(String[]arg) {
		StaticClass.result r = new StaticClass.result();
	}
}