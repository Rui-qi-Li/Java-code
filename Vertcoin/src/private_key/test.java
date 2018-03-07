package private_key;

public class test{
	public static void main(String[]arg) {
		String temp;
		StringBuffer array = new StringBuffer();
		for(int i=0;i<4;i++) {
			temp = Integer.toHexString((int)(Math.random()*16+1)).toUpperCase();
			array.append(temp);
		}
		System.out.println(array.toString());
		
		byte[]bytes = hexStringToByteArray(array.toString());
		for(byte k:bytes)
			System.out.print(k+" ");
		
		
	}
	public static byte[] hexStringToByteArray(String hexstring) {
		//byte length is half of hexString
		
		int len = hexstring.length()/2;
		byte[] bytes = new byte[len];
		char[] hexChar = hexstring.toCharArray();
		for(int i=0;i<len;i++) {
			int pos = i*2;
			//16-->10-->2
			bytes[i] = (byte)(charToByte(hexChar[pos])<<4
					|charToByte(hexChar[pos+1]));
		}
		return bytes;
	}
	public static byte charToByte(char c) {
		//16-->10-->2
		return (byte)"0123456789ABCDEF".indexOf(c);
	}
}