import java.util.Scanner;

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
	 Admin(){
		 this.id=101;
		 this.name="Siddhesh";
		 this.salary=90000;
		 this.allowance=9000;
	 }
	 Admin(int id, String name, double salary, double allowance) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.allowance = allowance;
	 }
}

public class TestAdmin {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Admin a1 = new Admin(102,"Rohan",89000,3000);
		a1.display();
		
		System.out.println();
		
		Admin a2 = new Admin();
		a2.display();
		
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter id of Admin :");
		int id = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter name of Admin :");
		String name = sc.nextLine();
		
		System.out.println("Enter salary of Admin :");
		double salary = sc.nextDouble();
		
		System.out.println("Enter allowance of Admin :");
		double allowance = sc.nextDouble();
		
		Admin a3 = new Admin(id,name,salary,allowance);
		a3.display();
		sc.close();
	}
}
