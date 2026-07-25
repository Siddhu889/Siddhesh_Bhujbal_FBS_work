package p1;

public class HR extends Employee{
     private double commission;

	 public HR(int id, String name, double salary, double commission) {
		super(id, name, salary);
		this.commission = commission;
	 }

	 public double getCommission() {
		 return commission;
	 }

	 public void setCommission(double commission) {
		 this.commission = commission;
	 }

	 @Override
	 public String toString() {
		return "HR [commission=" + commission + "]";
	 }

	 @Override
	 public double calculatesalary() {
		// TODO Auto-generated method stub
		return this.getSalary() + this.getCommission();
	 }
	 
	 
     
     
}
