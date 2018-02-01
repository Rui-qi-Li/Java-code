package dragon_exercise;
//this pattern will create a instance only when getins is called
public class GiantDragon_c{
	private GiantDragon_c() {}
	
	//create a static object member, point to null
	private static GiantDragon_c ins = null ;
	
	public static GiantDragon_c getins() {
		//create a instance when getins is called
		if(ins == null) 
			ins = new GiantDragon_c();
		return ins;
	}
	
}