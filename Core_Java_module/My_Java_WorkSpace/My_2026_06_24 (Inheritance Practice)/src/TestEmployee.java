class Employee
{
	int id;
	String name;
	double salary;
	
	public Employee() {
		super();
		this.id = 501;
		this.name = "Siddhesh";
		this.salary = 52100000;
	}
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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
		System.out.println("Employee Id:"+this.id);
		System.out.println("Employee Name:"+this.name);
		System.out.println("Salary:"+this.salary);
	}
} 
class Developer extends Employee
{
	String programming_language;
	String project_name;
	
	public Developer() {
		super();
		this.programming_language = "Java";
		this.project_name = "Employee_management_system";
	}
	
	public Developer(int id, String name, double salary,String programming_language, String project_name) {
		super(id,name,salary);
		this.programming_language = programming_language;
		this.project_name = project_name;
	}

	public String getProgramming_language() {
		return programming_language;
	}

	public void setProgramming_language(String programming_language) {
		this.programming_language = programming_language;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}
	
	void display()
	{
		super.display();
		System.out.println("Programming Language:"+this.programming_language);
		System.out.println("Project Name:"+this.project_name);
		System.out.println();
	}
}
class  Manager extends Employee
{
	int team_size;
	String department;
	
	public Manager() {
		super();
		this.team_size = 10;
		this.department = "Developer";
	}
	
	public Manager(int id, String name, double salary,int team_size, String department) {
		super(id,name,salary);
		this.team_size = team_size;
		this.department = department;
	}

	public int getTeam_size() {
		return team_size;
	}

	public void setTeam_size(int team_size) {
		this.team_size = team_size;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	void display()
	{
		super.display();
		System.out.println("Team size:"+this.team_size);
		System.out.println("Department:"+this.department);
		System.out.println();
	}
}
class Tester extends Employee
{
	String testing_tool;
	String automation_type;
	
	public Tester() {
		super();
		this.testing_tool = "Selenium";
		this.automation_type = "Developer";
	}
	
	public Tester(int id, String name, double salary,String testing_tool, String automation_type) {
		super(id,name,salary);
		this.testing_tool = testing_tool;
		this.automation_type = automation_type;
	}

	public String getTesting_tool() {
		return testing_tool;
	}

	public void setTesting_tool(String testing_tool) {
		this.testing_tool = testing_tool;
	}

	public String getAutomation_type() {
		return automation_type;
	}

	public void setAutomation_type(String automation_type) {
		this.automation_type = automation_type;
	}
	
	void display()
	{
		super.display();
		System.out.println("Testing Tool:"+this.testing_tool);
		System.out.println("Automation Type:"+this.automation_type);
		System.out.println();
	}
}
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Employee e1 = new Employee();
        e1.display();
        Employee e2 = new Employee(501,"Om",89000);
        e2.display();
        
        Manager m1 = new Manager();
        m1.display();
        Manager m2 = new Manager(101,"Siddhesh",85000,10,"Metropolitian");
        m2.display();
        
        Developer d1 = new Developer();
        d1.display();
        Developer d2 = new Developer(544,"Jai",89770,"Python","Appointment_System");
        d2.display();
        		
        Tester  t1 = new Tester();
        t1.display();
        Tester t2 = new Tester(544,"Rohan",74000,"react","selenium");
        t2.display();
	}

}
