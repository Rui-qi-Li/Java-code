package innerclass_exercise;

public class NonStaticClass{
	String name;
	protected int moveSpeed;
	
	//Non static class will make sense when there is a object of outside class
	class BattleScore {
			int score;
			
			public void result() {
				System.out.println(score);
			}
	}
	
	//new outsideclass().new insideclass();
	public static void main(String[]arg) {
		BattleScore s = new NonStaticClass().new BattleScore();
		
		
	}
}