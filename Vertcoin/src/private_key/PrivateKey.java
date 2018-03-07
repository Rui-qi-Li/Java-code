package private_key;
import java.util.Scanner;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PrivateKey{
	public static void main(String[]arg){
	
		String result = to64Hex(64);
		System.out.println(80+result);
		System.out.println(result.length());
		
	}
	public static String to64Hex(int n) {
		String temp;
		StringBuffer array = new StringBuffer();
		for(int i=0;i<n;i++) {
			temp = Integer.toHexString((int)(Math.random()*16)).toUpperCase();
			array.append(temp);
		}
		
		return array.toString();
		
	}
	
}