
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
}

public class TestHRM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HRM h1 = new HRM();
         h1.setId(524);
         h1.setName("Ritesh");
         h1.setSalary(98000);
         h1.setCommission(45005);
         h1.display();
	}//main ends here

}//Test HRM ends here

