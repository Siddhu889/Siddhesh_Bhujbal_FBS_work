class Student
{
	int rollno;
	String name;
	double distance;
	static int count;
	
	static
	{
		count = 0;
	}
	
	public Student() {
		super();
		this.rollno = 5;
		this.name = "Siddhesh";
		this.distance = 54;
		count++;
		System.out.println("Inside Default Constructor");
	}
	
	public Student(int rollno, String name, double distance) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.distance = distance;
		count++;
		System.out.println("Inside Parameterized Constructor");
	}

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

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public int getCount() {
		return count;
	}

	static int setCount(int count) {
		return count;
	}
	
	void display()
	{
		System.out.println("RollNo:"+this.rollno);
		System.out.println("Name:"+this.name);
		System.out.println("Distance:"+this.distance);
		System.out.println("Student Count:"+count);
	}
}//Student class ends here

class PlacedStudent extends Student
{
	String company_name,designation;

	public PlacedStudent() {
		super();
		this.company_name = "Wipro";
		this.designation = "Developer L3";
	}
	
	public PlacedStudent(int rollno, String name, double distance,String company_name, String designation) {
		super(rollno,name,distance);
		this.company_name = company_name;
		this.designation = designation;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	void display()
	{
		super.display();
		System.out.println("Company_Name:"+this.company_name);
		System.out.println("Designation:"+this.designation);
		System.out.println();
	}
}//Placed Student Class Ends here

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.display();
		
		System.out.println();
		
		Student s2=new Student(111,"Atharv",91.33);
		s2.display();
		
		System.out.println();
		
		//System.out.println("Count is : "+Student.getCount());
		
		PlacedStudent ps1=new PlacedStudent(101,"Pranav",150,"TCS","SDE");
		ps1.display();
		
		//System.out.println("Count is : "+Student.getCount());
	}

}
