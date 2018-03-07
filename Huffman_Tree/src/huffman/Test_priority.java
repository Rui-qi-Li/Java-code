package huffman;
import java.util.*;

public class Test_priority{
	public static void main(String[]arg) {
		Student s1 = new Student("B");
		Student s2 = new Student("A");
		Student s3 = new Student("C");
		Student s4 = new Student("E");
		Student s5 = new Student("D");
		PriorityQueue<Student> PQ = new PriorityQueue<Student>();
		PQ.add(s1);
		PQ.add(s2);
		PQ.add(s3);
		PQ.add(s4);
		PQ.add(s5);
		
		System.out.println(PQ.poll().getGrade());
		System.out.println(PQ.poll().getGrade());
		System.out.println((char)98);
	}
	
}
class Student implements Comparable<Student>{
	String grade;
	String name;
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(String grade) {
		this.grade = grade;
	}
	public int compareTo(Student other) {
		if(this.grade.compareTo(other.grade)<0)
			return -1;//进来的小，交换，往head推
		else if(this.grade.compareTo(other.grade)>0)
			return 1;//与-1相反
		else
			return 0;
	}
}
