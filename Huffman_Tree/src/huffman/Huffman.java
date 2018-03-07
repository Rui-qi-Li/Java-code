package huffman;
import java.util.*;

public class Huffman{
	public static void main(String[]arg) {
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Node> PQ = new PriorityQueue<Node>();
		//calculate the frequency of each character
		char[] array = (sc.nextLine()).toCharArray();
		int[] pairs = frequency(array);
		for(int i=0;i<256;i++) {
			if(pairs[i]!=0) {
				Node t = new Node();
				t.letter = (char)i;
				t.weight = pairs[i];
				PQ.add(t);
			}
		}
		
		//create a Huffman tree 
		while(PQ.size()>1) {
			Node n = new Node();
			int s = 0;
			n.RightChild = PQ.poll();//left: weight less
			s += n.RightChild.weight;
			n.leftChild = PQ.poll();//right: weight more
			s += n.leftChild.weight;
			n.weight = s;
			PQ.add(n);
			//test node: System.out.println(n.leftChild.letter+":"+n.RightChild.letter);
		}
		
	
		//print the route
		StringBuffer str = new StringBuffer();//create a stringbuffer to record the route
		Node p = PQ.peek();
		inOrder(p,null,str);
		
	}
	
	//frequency method
	public static int[] frequency(char[]array) {
		int frequency[] = new int[256];
		//Arrays.fill(frequency, 0);
		
		for(int i=0;i<array.length;i++) {
			frequency[(int)array[i]]++;
		}
		return frequency;
	}
	//path method
	public static void inOrder(Node root,Node parent,StringBuffer str) {
		if(root!= null) {
			root.isVisited = true;//each visited node will be marked
			inOrder(root.leftChild,root,str.append("0"));//go left and append "0" to the path 
			
			//if root is the first node of huffman tree, we delete the default "append("0")"
			if(parent == null)
				str.deleteCharAt(str.length()-1);
			
			if(root.letter != '\u0000') //reach the left, print the path
				System.out.println(Character.toString(root.letter)+" : "+str.toString());
			else if(root.leftChild.isVisited == true) {
				str.deleteCharAt(str.length()-1);
				if(root.leftChild.letter == '\u0000')//we don't need to print link-node,so delete the path to them
				str.deleteCharAt(str.length()-1);
			}
			inOrder(root.RightChild,root,str.append("1"));//go right and append "1" to the path
		}
		else
			str.deleteCharAt(str.length()-1);
	}
	
}