
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
}//SalesManager ends here

public class TestSalesManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SalesManager sm1 = new SalesManager();
	        sm1.setId(501);
	        sm1.setName("Siddhesh");
	        sm1.setSalary(67000);
	        sm1.setIncentive(5400);
	        sm1.setTarget(100000);
	        sm1.display();
		}//main ends here

	}//testSalesmanager ends here
