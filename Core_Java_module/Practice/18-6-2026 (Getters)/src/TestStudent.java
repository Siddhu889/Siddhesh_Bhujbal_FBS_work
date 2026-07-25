
class Student
{
	int rollno;
	String name;
	double marks;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	void display()
	{
		System.out.println("Rollno:"+this.rollno);
		System.out.println("Name:"+this.name);
		System.out.println("Marks:"+this.marks);
	}
}//class student ends here

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
        s1.setRollno(5);
        s1.setName("Siddhesh Bhujbal");
        s1.setMarks(98.9);
        s1.display();
	}

}