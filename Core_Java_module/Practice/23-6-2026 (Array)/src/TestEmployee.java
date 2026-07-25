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
		this.id = 55;
		this.name = "Hariom";
		this.salary = 85000;
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
	
	void display()
	{
		System.out.println("Name:"+this.name);
		System.out.println("Id:"+this.id);
		System.out.println("Salary:"+this.salary);
		
		System.out.println();
	}
}//Employee ends here

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Employee[] e1 = new Employee[5];
        e1[0] = new Employee(101,"Atharva",90000);
        e1[1] = new Employee(90,"Siddhesh",75000);
        e1[2] = new Employee(85,"om",56000);
        e1[3] = new Employee(65,"Siddhu",78800000);
        e1[4] = new Employee();
        System.out.println(e1[0]);
        for(int i = 0; i < 5;i++)
        {
        	e1[i].display();
        }
	}//main ends here
}//TestEmployee ends here
