
class Employee
{
	int id;
	String name;
	double salary;
	
	
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
	
	void display()
	{
		System.out.println("Name is:"+this.name);
		System.out.println("Id is:"+this.id);
		System.out.println("Salary is:"+this.salary);
	}
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public Employee() {
		this.id = 566;
		this.name = "Siddhesh";
		this.salary = 980000;
	}
	
	
}//employee ends here

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Employee e1 = new Employee();
    e1.display();
    
    System.out.println();
    
    Employee e2 = new Employee(89,"Rohan",566000);
    e2.display();
    
	}//main ends here

}//testEmployee ends here

