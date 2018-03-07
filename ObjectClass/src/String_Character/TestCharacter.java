package String_Character;

public class TestCharacter{
	public static void main(String[]arg) {
		char c1 = 'a';
		char c2 = '3';
		
		System.out.println(Character.isLowerCase(c1));
		Character.toUpperCase(c1);//non receiver
		
		//convert char to String
		String s = Character.toString('b');
		
		//initialize a new char array
		String ss = "hello java";
		char[]c3 = ss.toCharArray();
	}
}