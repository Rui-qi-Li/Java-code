package integer;
//java.lang.Math 
//all are static method

public class TestMath{
	public static void main(String[]arg) {
		float f1 = 3.4f;
		float f2 = 3.5f;
		int temp;
		
	    temp = Math.round(f1);// print 3
	    temp = Math.round(f2);// print 4
	    
	    //random int [0,10)
	    temp = (int)(Math.random()*10);
		
	    //2^4
	    temp = (int)(Math.pow(2,4));
	    
	    System.out.println(Math.PI);
	    System.out.println(Math.E);
	}
}