package innerclass_exercise;

public abstract class AnonymousClass{
	String name;
	
	public abstract void attack();
	
	public static void mian(String[]arg) {
		AnonymousClass a = new AnonymousClass() {
			//implement outside abstract class
			//up casting
			public void attack() {
				System.out.println("attack");
			}
		};
		a.attack();
	}
	
}