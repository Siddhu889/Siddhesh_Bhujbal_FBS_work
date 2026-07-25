
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
	
}//employee ends here

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
        e1.setId(204);
        e1.setName("Siddhesh Bhujbal");
        e1.setSalary(9000000);
        e1.display();
        
	}//main ends here

}//testEmployee ends here
