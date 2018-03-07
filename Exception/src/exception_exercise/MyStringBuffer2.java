package exception_exercise;

public class MyStringBuffer2 implements iStringBuffer2{
	int capacity = 16;
	int length = 0;
	char[]value;
	
	public MyStringBuffer2() {
		value = new char[capacity];
	}
	class IndexIsNagetiveException extends Exception{
		public IndexIsNagetiveException() {}
		public IndexIsNagetiveException(String description) {
				super(description);//super must be on the first line
		}
	}
	class IndexIsOutofRangeException extends Exception{
		public IndexIsOutofRangeException () {}
		public IndexIsOutofRangeException (String description) {
			super(description);
		}
	}
	
	public MyStringBuffer2(String str) {
		if(str != null)
			value = str.toCharArray();//point to an array
		length = value.length;
		if(capacity<length)
			capacity = value.length * 2;
	}

	public void insert(int pos, String str) throws Exception{
		if(pos<0)
			throw new IndexIsNagetiveException("index is less then 0");
		if(pos>length)
			throw new IndexIsOutofRangeException("index is out of range");
		if(str == null)
			throw new NullPointerException("index is null");//don' need to import 
		
		while(length+str.length()>capacity) {
			capacity = (length+str.length())*2;
			char[] newValue = new char[capacity];
			System.arraycopy(value, 0, newValue, 0, length);
			value = newValue;
		}
		
		char[]temp = str.toCharArray();
		
		//split the old array 2 pars the leave the room for insertion
		//example: {0,1,2} insert some numbers into index 1
		System.arraycopy(value, pos, value, pos+temp.length, length-pos);
		System.arraycopy(temp, 0, value, pos, temp.length);
		
		length += temp.length;
	}
	public static void main(String[]arg) {
		MyStringBuffer2 my = new MyStringBuffer2();
		try {
			my.insert(1,"hello");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}