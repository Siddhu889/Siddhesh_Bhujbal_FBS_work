
class Admin {
     int id;
     String name;
     double salary,allowance;
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
	 public double getAllowance() {
		 return allowance;
	 }
	 public void setAllowance(double allowance) {
		 this.allowance = allowance;
	 }
	 
	 void display()
	 {
		 System.out.println("Name is :"+this.name);
		 System.out.println("Id is :"+this.id);
		 System.out.println("Salary is :"+this.salary);
		 System.out.println("Allowance is :"+this.allowance);
	  }
}


public class TestAdmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Admin a1 = new Admin();
		a1.setId(101);
		a1.setName("Siddhesh");
		a1.setSalary(450000);
		a1.setAllowance(5000);
		a1.display();
	}

}
