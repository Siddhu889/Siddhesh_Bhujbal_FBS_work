class Employee
{
	String name;
	double basicsalary;
	static double companybonusrate;
	
	static
	{
		companybonusrate = 10;
	}
	public Employee(String name, double basicsalaru, double companybonusrate) {
		this.name = name;
		this.basicsalary = basicsalaru;
	}
	
	public Employee() {
		this.name = "Siddhesh";
		this.basicsalary = 75000;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBasicsalaru() {
		return basicsalary;
	}

	public void setBasicsalaru(double basicsalaru) {
		this.basicsalary = basicsalaru;
	}

	static double getCompanybonusrate() {
		return companybonusrate;
	}

	static void setCompanybonusrate(double bonusrate) {
		companybonusrate = bonusrate;
	}
	
	void display()
	{
		System.out.println("Employee Name:"+this.name);
		System.out.println("Basic Salary:"+this.basicsalary);
		System.out.println("TotalSalary:"+companybonusrate);
	}
	
	void calctotalsalary()
	{
		System.out.println("Total Salary:"+(this.basicsalary + (this.basicsalary * companybonusrate / 100)));
	}
}
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Employee e1  = new Employee("Siddhesh",85000,5.5);
         e1.display();
         e1.calctotalsalary();
         
         System.out.println();
         
         Employee e2  = new Employee("Om",95000,9);
         e2.display();
         e2.calctotalsalary();
	}

}
