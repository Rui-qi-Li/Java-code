package exam_exercise;
import java.util.*;
import exam_exercise.StackList.Link;

public class lab8{
	public static void main(String[]arg) {
		Scanner sc = new Scanner(System.in);
		
		//Q1
		int size = Integer.parseInt(sc.nextLine());//avoid enter key
		Priqueue array = new Priqueue(size);
	
		for(int i=0;i<size;i++) {
			String ss[] = sc.nextLine().split(" ");//string.split(regular)
			if(ss[0].matches("REMOVE"))
				array.remove();//����û��variable���գ�
			else
				array.insert(ss[1]);
		}
		System.out.println(array.remove());
		
		/*Q2
		 * Manipulate a queue according to the given insert and remove commands and then output the string that is at the 
		 * front of the queue. If a remove command is issued for an empty queue then nothing should happen.
		 * If the queue is empty output "empty"
		 * 
		 *  Sample Input
		 *  INSERT yes
		 *  INSERT we
		 *  REMOVE
		 *  INSERT can
		 *  REMOVE
		 *  
		 *  Sample Output
		 *  can
		 */
		Queuelist list = new Queuelist();
		String str[];
		while(sc.hasNextLine()) {
			str = sc.nextLine().split(" ");
			if(str[0].equals(""))//����ʹ��ctrl+z
				break;
			if(str[0].equals("REMOVE"))
				list.dequeue();
			else
				list.enqueue(str[1]);
		}
		if(!list.isEmpty())
			System.out.println(list.dequeue().data);
		else
			System.out.println("empty");
	}
}
//priority queue array, ��������stack��
class Priqueue{
	private int maxSize;
	private String[] queArray;
	private int n;
	
	public Priqueue(int s) {
		maxSize = s;
		queArray = new String[maxSize];
		n = 0;
	}
	public void insert(String j) {//leftmost: largest
		if(isFull()) 
			{}
		else{
			int i;//save the index
			if(isEmpty())//have no item,insert at 0
				queArray[n++] = j;
			else//have some items,sort and insert
			{
				for(i=n-1;i>=0;i--) {//start at the end!!
					if(compare(j,queArray[i])>0)//������С+�ֵ���С�����Ҵ�����ȡ����
						queArray[i+1] = queArray[i];//shift upward
					else
						break;//done shifting
				}
				queArray[i+1] = j;//insert it (a[-1+1] or a[n-1+1] is OK)
				n++;
			}
		}
	}
	private int compare(String a, String b) {//leftmost: largest
		if(a.length()==b.length())
			return a.compareTo(b);//alphabetical ordering,start at the end!!
		return a.length()-b.length();
	}
	public String remove() {//leftmost: largest
		if(isEmpty())
			return "";//null only to object, String is OK
		else {
			return queArray[--n];//!! [new], then n-1
		}
	}
	public boolean isEmpty() {
		return n == 0;
	}
	public boolean isFull() {
		return n == maxSize;
	}
}
//��Ϊpriority queue��array��ʱ����Դ�β����sorting�����㷨
//��single linked list �����Դ�β����������ò�Ҫ��list��

class Queuelist{
	private Link head;
	private Link rear;
	
	public Queuelist() {
		head = null;
		rear = null;
	}
	public boolean isEmpty() {
		return head == null;//������head�������ں�����ж�
	}
	//insert data to the rear of the list
	public void enqueue(String data) {
		Link newLink = new Link(data);//same time: .next = null
		if(isEmpty())
			head = newLink;//������д��head = rear�� ��Ϊrear�����Ǻ�һ����head�޷�ͬ������
		else
			rear.next = newLink;
		rear = newLink;
	}
	//remove from the head of the list
	public Link dequeue() {
		Link temp = head;
		if(isEmpty())
			return null;
		else {
			head = head.next;
			if(isEmpty())
				rear = null;//ͬ��rear�����
			return temp;//null or something
		}
	}
}

//rear, front ���������ߣ�++
class Queue{
	private int maxSize;
	private String[] queArray;
	private int front;
	private int rear;
	private int n;
	
	public Queue(int s) {
		s = maxSize;
		queArray = new String[maxSize];
		front = 0;
		rear = -1;//����stack���top = -1
		n = 0;
	}
	public void insert(String data) {
		if(isFull())
			System.out.println("full!");
		else {
			if(rear == maxSize-1)
				rear = -1;
			queArray[++rear] = data;
			n++;
		}
	}
	public String remove() {
		if(isEmpty())
			return null;
		else {
			String temp = queArray[front++];//[old],front+1
			if(front == maxSize)
				front = 0;
			n--;
			return temp;
		}
	}
	public boolean isFull() {
		return n == maxSize;
	}
	public boolean isEmpty() {
		return n == 0;
	}
}
