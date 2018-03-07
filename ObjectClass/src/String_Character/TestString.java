package String_Character;

public class TestString{
	public static void main(String[]arg) {
		String str1 = "hello";
		String str2 = "world";
		int n = 4;
		
		//format print out
		String senFormat = "%s and %s and %d";
		System.out.printf(senFormat,str1,str2,n);
		System.out.format(senFormat,str1,str2,n);
		
		//create string objects using string
		String n1 = "name";
		String n2 = new String("age");
		String n3 = n1+n2;
		
		//create string object using char array
		char[]ca1 = new char[] {'1','a','c'};
		char[]ca2 = {'d','e','f'};
		String n4 = new String(ca1);
		
		
		//length() method for all object
		n = n1.length();
		
		//charAt()
		char c1 = str1.charAt(0);
				
		//toCharArray()   
		char[]c2 = str2.toCharArray();
		System.out.println(c2.length == str2.length());//length vs length()
		
		//subString(xx,xx)
		String str3 = str2.substring(2);
		String str4 = str2.substring(1,3);
		
		//split -- > String[] array
		String str5 = "heppy new year";
		String[] spl = str5.split(" ");
		for(String k : spl)
			System.out.println(k);
		
		//trim : delete white space
		String str6 = " happy spring festival ";
		System.out.println(str6.trim());
		
		//toLowerCase toUpperCase
		System.out.println(str6.toLowerCase());
		System.out.println(str6.toUpperCase());
		
		//indexOf , contains
		n = str6.indexOf('a');//first appear
		n = str6.indexOf('1');
		n = str6.lastIndexOf('a');//last appear
		n = str6.indexOf(" ",3);//find sth from index 3
	    System.out.println(str6.contains("e"));//whether contains,return boolean value
		
	    //replaceAll , replaceFirst
	  	str6 = str6.replaceAll("a","3");//replace all "a" with 3;
	  	str6 = str6.replaceFirst("i"," ");//replace the first "i" with
	
	    //== whether they are from the same object
	  	String s1 = "the day";
	  	String s2 = new String(s1);
	  	System.out.println(s1 == s2);//print: false;
	  	
	  	//object pool, recycled using
	  	String s3 = "the day";
	  	System.out.println(s3 == s1);//print: true
	  	
	    //equals . equalsIgnoreCase
	  	String s4 = "THE DAY";
	  	System.out.println(s4.equals(s3));//print: false
	  	System.out.println(s4.equalsIgnoreCase(s3));//print: true
	  	
	    //startsWith , endsWith
	  	System.out.println(s3.startsWith("the"));
	  	System.out.println(s3.endsWith("day"));
	  	
	}
	
}