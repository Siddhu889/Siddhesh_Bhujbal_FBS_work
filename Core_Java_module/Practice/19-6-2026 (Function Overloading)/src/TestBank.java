class Bank
{
	void approveLoan(Student s)
	{
		System.out.println("Student Name : "+s.name+" | Percentage : "+s.percentage);
		
		if(s.percentage>=80)
		{
			System.out.println("Loan Approved : 2 Lakh");
		}
		else if(s.percentage>=60 && s.percentage<80)
		{
			System.out.println("Loan Approved : 1 lakh");
		}
		else if(s.percentage>=40 && s.percentage<60)
		{
			System.out.println("Loan Not Approved");
		}
	}
	
    void approveLoan(Employee e)
    {
    	System.out.println("Employee Name : "+e.name+" | Salary : "+e.salary);
    	
    	if(e.salary>=12000)
    	{
    		System.out.println("Loan Approved : 7 Lakh");
    	}
    	else if(e.salary>=10000 && e.salary<12000)
    	{
    		System.out.println("Loan Approved : 6 Lakh");
    	}
    	else if(e.salary>=6000 && e.salary<10000)
    	{
    		System.out.println("Loan Approved : 5 Lakh");
    	}
    	else if(e.salary>=4000 && e.salary<6000)
    	{
    		System.out.println("Loan Approved : 4 Lakh");
    	}
    	else
    	{
    		System.out.println("Loan Not Approved");
    	}
    }
}//class bank ends here

class Student
{
	int rollno;
	String name;
	double percentage;
	
	public Student(int rollno, String name, double percentage) {
		this.rollno = rollno;
		this.name = name;
		this.percentage = percentage;
	}
	
	public Student() {
		this.rollno = 5;
		this.name = "Siddhesh Bhujbal";
		this.percentage = 98.7;
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

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
}//class Student ends here

class Employee
{
	int id;
	String name;
	double salary;
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public Employee() {
		this.id = 0;
		this.name = "No";
		this.salary = 0;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}//class Employee ends here

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Bank b = new Bank();
           Student s1 = new Student(1,"Rohan",85);
           Employee e1 = new Employee(104,"Siddhesh",9000);
           b.approveLoan(s1);
           b.approveLoan(e1);
	}
}
