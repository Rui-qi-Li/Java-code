package integer;

public class TestInteger{
	public static void main(String[]arg) {
		int i = 10;
		
		//wrapped object in
		Integer in = new Integer(i);
		int j = in.intValue();
		
		//automatically boxing and unboxing
		Integer in2 = i;
		int j2 = in2;
		
		System.out.println(Integer.MAX_VALUE);
		
		//toString()method
		System.out.println(in2.toString());
		System.out.println(j2);
		
		//valueOf() method
		String str = String.valueOf(j2);
		
		//parseInt() method
		j2 = Integer.parseInt(str);
	}
}