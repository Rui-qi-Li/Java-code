public class String_and_Character{
	public static void main(String[]arg){
		String str1 = "hello";
		String str2 = "world";
		int n = 4;
		
		//format print out
		String senFormat = "%s and %s and %d";
		System.out.printf(senFormat,str1,str2,n);
		System.out.format(senFormat,str1,str2,n);
		
		char c1 = 'a';
		char c2 = '3';
		
		System.out.println(Character.isLowerCase(c1));
		System.out.println(Character.toUpperCase('a'));
		str1 = Character.toString(c2);
		
		//create string objects
		String n1 = "name";
		String n2 = new String("age");
		String n3 = n1+n2;
		
		//length() method for all object
		int num = n1.length();
		
		//charAt()
		char c3 = str2.charAt(0);
		
		//toCharArray()
		char[]c4 = str2.toCharArray();
		System.out.println(c4.length == str.length());
		
		//subString(xx,xx)
		String str3 = str2.subString(2);
		String str4 = str2.subString(1,3);
		
		//split -- > String[] array
		Stirng str5 = "heppy new year";
		String[] spl = str5.split(" ");
		for(str3 : spl)
			System.out.println(str3);
		
		//trim
		String str6 = " happy spring festival ";
		System.out.println(str6.trim());
		
		//toLowerCase toUpperCase
		System.out.println(str6.toLowerCase());
		System.out.println(str6.toUpperCase());
		
		//indexOf , contains
		num = str6.indexOf('a');//first appear
		num = str6.indexOf('1');
		num = str6.lastIndexOf('a');
		num = str6.indexOf(" ",3);//from 3
	    System.out.println(str6.contains("e"))//boolean
		
		//replaceAll , replaceFirst
		str6 = str6.replaceAll("a","3");
		str6 = str6.replaceFirst("i"," ");
		
		//== whether they are same object
		String s1 = "the day";
		String s2 = new String(s1);
		System.out.println(s1 == s2);//print: false;
		
		//equals . equalsIgnoreCase
		String s3 = "THE DAY";
		System.out.println(s1.equals(s3));//print: false
		System.out.println(s1.equalsIgnoreCase(s3));//print: true
			
		//startsWith , endsWith
		System.out.println(s1.startsWith("the"));
		System.out.println(s3.startsWith("the"));
		
		StringBuffer ss = new StringBuffer(s3);
		ss.append(" IS GOOD");
		ss.delete(4,8);
		ss.insert(4,"OH");
		ss.reverse();
		System.out.println(ss.length());//contents length
		System.out.println(ss.capacity());//capacity length
		
		//current time
		System.currentTimeMillis();
		
	}
}