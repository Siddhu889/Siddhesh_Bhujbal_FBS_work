package p1;

import java.util.ArrayList;
import java.util.TreeSet;

class Student implements Comparable <Student>
{
	int roll_no;
	double marks;
	String name;
	
	@Override
	public int compareTo(Student s2) {
		// TODO Auto-generated method stub
		return this.roll_no-s2.roll_no;
	}

//	@Override
//	public int compareTo(Object 0) {
//		// TODO Auto-generated method stub
//		Student s1 = (Student)o;
//		//return  this.roll_no-s1.roll_no;
//		//return (int) (this.marks-s1.marks);
//		return this.name.compareTo(s1.name);
//	}
//	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
		this.roll_no = 7;
		this.marks = 98;
		this.name = "Siddhesh";
	}
	
	public Student(int id, double marks, String name) {
		super();
		this.roll_no = id;
		this.marks = marks;
		this.name = name;
	}
	
	public int getId() {
		return roll_no;
	}
	public void setId(int id) {
		this.roll_no = id;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "\n Student roll_no=" + roll_no + ", marks=" + marks + ", name=" + name + "]";
	}
    
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Student s1 = (Student)obj;
		if(this.roll_no==s1.roll_no)
		{
			return true;
		}
		else
		{
			return false;
		}

	}
	
}//class student ends here
public class TestCollection {
	
	

	public static void main1(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student>a1 = new ArrayList<Student>();
		a1.add(new Student(57, 450, "Sachin"));
		a1.add(new Student(34, 590, "Rahul"));
		a1.add(new Student(88, 700, "Dhoni"));
		
		System.out.println(a1);
		
		if(a1.contains (new Student(34, 590, "Rahul")))
				{
			System.out.println("Found");
				}
		else
		{
			System.out.println("Not Found");
		}
	}
    public static void main(String[]args)
    {
    	TreeSet<Student>t1 = new TreeSet<Student>();
		t1.add(new Student(57, 450, "Sachin"));
		t1.add(new Student(34, 590, "Rahul"));
		t1.add(new Student(88, 700, "Dhoni"));
		
		System.out.println(t1);
		
System.out.println(t1);
		
		if(t1.contains (new Student(34, 590, "Rahul")))
				{
			System.out.println("Found");
				}
		else
		{
			System.out.println("Not Found");
		}
    }
}
