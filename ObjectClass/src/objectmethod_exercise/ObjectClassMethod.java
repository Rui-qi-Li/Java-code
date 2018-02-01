package objectmethod_exercise;

public class ObjectClassMethod{
	public static void main(String[]arg) {
		//1. all class has toString() method
		hero h = new hero();
		h.name = "hero name";
		System.out.println(h.toString());
		
		//2. all class has finalize() to collect null reference
		hero g = new hero();
		g = new hero();
		g = new hero();
		
		//3. all class has equals(object) method
		g.name = "hero name";
		h.equals(g);
		
	}
}
class hero{
	public String name ;
	
	public void finalize() {
		System.out.println("collected");
	}
}