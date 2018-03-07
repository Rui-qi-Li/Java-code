package String_Character;

public class MyStringBuffer implements iStringBuffer{
	//default: private
	int capacity = 16;
	int length = 0;
	char[]value; //reference
	
	//default constructor
	public MyStringBuffer() {
		value = new char[capacity];
	}
	//parameterized constructor
	public MyStringBuffer(String str) {
		if(str != null)
			value = str.toCharArray();//point to an array
		length = value.length;
		if(capacity<length)
			capacity = value.length * 2;
	}
	@Override
	public void append(String str) {
		insert(length,str);
	}
	public void append(char c) {
		append(String.valueOf(c));//valueOf return a String object
	}
	@Override
	public void insert(int pos, String s) {
		if(pos<0 || pos>length ||s == null)
			return;//ʲôҲ����
		
		while(length+s.length()>capacity) {
			capacity = (length+s.length())*2;
			char[] newValue = new char[capacity];
			//copy all the elements into a new array
			//��value �ĵ�0λ����length��ô���newValue�ĵ�0λ
			System.arraycopy(value, 0, newValue, 0, length);
			value = newValue;
		}
		
		char[]temp = s.toCharArray();
		
		//split the old array 2 pars the leave the room for insertion
		//example: {0,1,2} insert some numbers into index 1
		System.arraycopy(value, pos, value, pos+temp.length, length-pos);
		System.arraycopy(temp, 0, value, pos, temp.length);
		
		length += temp.length;
	}
	public void insert(int pos, char c) {
		insert(pos,String.valueOf(c));
	}
	//! delete range: [start,end)
	//copy null reference into index 0
	public void delete(int start) {
		delete(start,length);
	}
	//example {0,1,2,3} delete(0,2)
	public void delete(int start,int end) {
		if(start<0 || end<0 || start>=length || end>length)
			return;
		//arraycopy will not change the original 
		System.arraycopy(value, end, value, start, end-start);
		//��ֻ������ȡ����element�����������ν��
		length -=end-start;
	}
	
	@Override
	public void reverse() {
		for(int i=0;i<length/2;i++) {//length/2 round
			//swap
			char temp = value[i];
			value[i] = value[length-i-1];
			value[length-i-1] = temp;
		}
	}
	public int length() {
		return length;
	}
	//toString() can only accept char, so it need to be overrided
	@Override
	public String toString() {
		char[]stringvalue = new char[length];
		//value�����кܶ�ո��������¸���һ��������������������
		System.arraycopy(value, 0, stringvalue, 0, length);
		return new String(stringvalue);
	}
	public static void main(String[]arg) {
		MyStringBuffer my = new MyStringBuffer("hello");
		my.append('a');
		my.append("world");
		my.reverse();
	}
}