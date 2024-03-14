package collectionslist;
import java.util.*;
class Student{
	private String name;
	private int age;
	private double mark;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getMark() {
		return mark;
	}
	public void setMark(double mark) {
		this.mark = mark;
	}
	public Student(String name, int age, double mark) {
		super();
		this.name = name;
		this.age = age;
		this.mark = mark;
	}
	@Override
	public boolean equals(Object obj) {
		Student that=(Student) obj;
		if((this.name.equals(that.name))&&(this.age==that.age) && (this.mark==that.mark)) {
			return true;			
		}
		else
			return false; 
			
		
	}
	
}

public class StudentLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Student> st=new LinkedList<Student>();
		st.add(new Student("Rama",19,78));
		st.add(new Student("Sama",18,88));
		st.add(new Student("Kama",17,74));
		st.add(new Student("Lama",16,70));
		st.add(new Student("Obama",21,71));
		System.out.println(st);
		for (Student s:st) {
			System.out.println(s.getAge()+" "+s.getMark()+" "+s.getName());
			
		}
		System.out.println("Size= "+st.size());
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student details:");
		System.out.println("Name: ");
		String name=sc.next();
		System.out.println("Mark: ");
		double mark=sc.nextDouble();
		System.out.println("Age: ");
		int age=sc.nextInt();
		Student obj=new Student(name,age,mark);
		System.out.println("Search "+st.contains(obj));
		st.remove(obj);
		st.remove(1);
		
		

	}

}
