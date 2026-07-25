class Employee
{
	int id;
	String name;
	double salary;
	
	public Employee() {
		super();
		this.id = 501;
		this.name = "Siddhesh";
		this.salary = 85000;
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
		System.out.println("Id:"+this.id);
		System.out.println("Name:"+this.name);
		System.out.println("Salary:"+this.salary);
	}
}//Employee class ends here

class HR extends Employee
{
	double commission;

	public HR() {
		super();
		this.commission = 5000;
	}
	
	public HR(int id, String name, double salary,double commission) {
		super(id,name,salary);
		this.commission = commission;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}
	
	void display()
	{
		super.display();
		System.out.println("Commission:"+this.commission);
		System.out.println();
	}
}//HR class ends here

class SalesManager extends Employee
{
	double incentive;
	int target;
	
	public SalesManager() {
		super();
		this.incentive = 5000;
		this.target = 5400000;
	}
	
	public SalesManager(int id, String name, double salary,double incentive, int target) {
		super(id,name,salary);
		this.incentive = incentive;
		this.target = target;
	}

	public double getIncentive() {
		return incentive;
	}

	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}

	public int getTarget() {
		return target;
	}

	public void setTarget(int target) {
		this.target = target;
	}
	
	void display()
	{
		super.display();
		System.out.println("Incentive:"+this.incentive);
		System.out.println("Target:"+this.target);
		System.out.println();
	}
}//SalesManager class ends here

class Admin extends Employee
{
	double allowance;

	public Admin() {
		super();
		this.allowance = 5400;
	}
	
	public Admin(int id, String name, double salary,double allowance) {
		super(id,name,salary);
		this.allowance = allowance;
	}

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	
	void display()
	{
		super.display();
		System.out.println("Allowance:"+this.allowance);
		System.out.println();
	}
}//Admin class ends here

class AreaSalesManager extends SalesManager
{
	String areaname;

	public AreaSalesManager() {
		super();
		this.areaname = "SalesArea";
	}
	
	public AreaSalesManager(int id, String name, double salary,double incentive, int target,String areaname) {
		super(id,name,salary,incentive,target);
		this.areaname = areaname;
	}

	public String getAreaname() {
		return areaname;
	}

	public void setAreaname(String areaname) {
		this.areaname = areaname;
	}
	
	void display()
	{
		super.display();
		System.out.println("AreaName:"+this.areaname);
		System.out.println();
	}
}//AreaSalesManager class ends here

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Employee e1 = new Employee();
        e1.display();
        Employee e2 = new Employee(45,"Siddhesh",54000);
        e2.display();
        
        HR h1 = new HR();
        h1.display();
        HR h2 = new HR(75,"Om",78000,5500);
        h2.display();
        
        Admin a1 = new Admin();
        a1.display();
        Admin a2 = new Admin(788,"Jai",75000,20000);
        a2.display();
        
        SalesManager sm1 = new SalesManager(90,"Veer",12000,9800,852000);
        sm1.display();
        SalesManager sm2 = new SalesManager();
        sm2.display();
        
        AreaSalesManager asm1 = new AreaSalesManager();
        asm1.display();
        AreaSalesManager asm2 = new AreaSalesManager(741,"Rohan",75000,45000,75000,"Pune");
        asm2.display();
	}

}
