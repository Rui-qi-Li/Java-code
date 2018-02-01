package dragon_exercise;
//this pattern will create a instance, no matter whether getins is called or not
public class GiantDragon{
	//a private constructor avoid instance through using the new keyword
	private GiantDragon() {}
	
	//a static object member which is related to the class, so only has one
	private static GiantDragon ins = new GiantDragon();
	
	//user can be accessed to the public method to get a and only one instance
	//it must be a "static" because constructor is private, no instance can be get by new
	public static GiantDragon getIns() {
		return ins;
	}
}