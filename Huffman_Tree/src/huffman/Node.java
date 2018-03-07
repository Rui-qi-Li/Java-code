package huffman;
import java.util.*;

public class Node implements Comparable<Node>{
	public Node leftChild;
	public Node RightChild;
	public char letter;
	public int weight;
	public boolean isVisited;
	
	public Node(){
		leftChild = null;
		RightChild = null;
	}
	public int compareTo(Node obj) {
		if(weight-obj.weight>0)
			return 1;
		else if(weight-obj.weight<0)
			return -1;//最小的是最优先
		else
			return 0;
	}

}