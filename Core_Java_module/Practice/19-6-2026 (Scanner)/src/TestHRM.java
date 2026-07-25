import java.util.Scanner;

class HRM
{
	int id;
	String name;
	double salary, commission;
	
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
	public double getCommission() {
		return commission;
	}
	public void setCommission(double commission) {
		this.commission = commission;
	}
	
	void display()
	{
		System.out.println("Name is:"+this.name);
		System.out.println("Id is:"+this.id);
		System.out.println("Salary is:"+this.salary);
		System.out.println("Commission is:"+this.commission);
	}
	
	public HRM(int id, String name, double salary, double commission) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.commission = commission;
	}

	public HRM() {
		super();
		this.id = 89;
		this.name = "Siddhesh Bhujbal";
		this.salary = 980000;
		this.commission = 8500;
	}
}

public class TestHRM {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HRM h1 = new HRM();
        h1.display();
        
	    System.out.println();
	    
	    HRM h2 = new HRM(91,"Rohan Bhujbal",78888,90000);
	    h2.display();
	    
	    System.out.println();
	    
	    Scanner sc=new Scanner(System.in);
	    
        System.out.println("Enter Name : ");
        String name=sc.nextLine();
        
        System.out.println("Enter ID : ");
        int id=sc.nextInt();
        
        System.out.println("Enter Salary : ");
        double salary=sc.nextDouble();
        
        System.out.println("Enter Allownance : ");
        double allowance=sc.nextDouble();
        
		HRM a3=new HRM(id,name,salary,allowance);
        a3.display();
        
        sc.close();
        }//main ends here

}//Test HRM ends here
