
class SalesManager
{
	int id,target;
	String name;
	double salary,incentive;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
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
	public double getIncentive() {
		return incentive;
	}
	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}
	
	void display()
	{
		System.out.println("Name:"+this.name);
		System.out.println("Id:"+this.id);
		System.out.println("Salary:"+this.salary);
		System.out.println("Incentive:"+this.incentive);
		System.out.println("Target:"+this.target);
	}
	
	public SalesManager(int id, int target, String name, double salary, double incentive) {
		super();
		this.id = id;
		this.target = target;
		this.name = name;
		this.salary = salary;
		this.incentive = incentive;
	}
	
	public SalesManager() {
		super();
		this.id = 899;
		this.target = 5800000;
		this.name = "Siddhesh Bhujbal";
		this.salary = 62000;
		this.incentive = 8500;
	}
}//SalesManager ends here

public class TestSalesManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SalesManager sm1 = new SalesManager();
        sm1.display();
        
        System.out.println();
        
        SalesManager sm2 = new SalesManager(966,7800000,"Rohan Bhujbal",75000,4500);
        sm2.display();
	}//main ends here

}//testSalesmanager ends here
