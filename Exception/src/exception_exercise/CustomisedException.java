package exception_exercise;

public class CustomisedException{
	public String name;
	protected int hp;
	
	public void waterplant(CustomisedException p) throws PlantDeadException{
		if(p.hp == 0)
			//这里用 throw 指明是哪一种exception
			//Exception(String msg) contains the message that can be return be getMessage() method
			throw new PlantDeadException(p.name + "the plant has dead");	
	}
	
	//inner class
	class PlantDeadException extends Exception{
		public PlantDeadException() {}
		public PlantDeadException(String name) {
			super(name);//Exception has a method called getMessage()
		}
	}
	
	public static void main(String[]arg) {
		CustomisedException tulip = new CustomisedException();
		tulip.name = "Tulip";
		tulip.hp = 0;
		//相当于一种if statement
		try {
			tulip.waterplant(tulip);
		}catch(PlantDeadException e) {
			System.out.println(e.getMessage());//Exception(String msg)
		}
	}
}