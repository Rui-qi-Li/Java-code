package dragon_exercise;

public class TestGiantDragon{
	public static void main(String[] arg) {
		//wrong: the constructor is invisible
		//GiantDragon g = new GiantDragon();
		
		GiantDragon g1 = GiantDragon.getIns();
		GiantDragon g2 = GiantDragon.getIns();
		
		System.out.println(g1 == g2);//true, they are the same object instance
		
	}
}