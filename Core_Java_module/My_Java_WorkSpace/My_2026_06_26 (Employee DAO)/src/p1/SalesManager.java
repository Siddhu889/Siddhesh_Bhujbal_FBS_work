package p1;

public class SalesManager extends Employee{
     private double incentive;
     private int target;
     
	 public SalesManager(int id, String name, double salary, double incentive, int target) {
		super(id, name, salary);
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

	 @Override
	 public String toString() {
		return "SalesManager [incentive=" + incentive + ", target=" + target + "]";
	 }

	 @Override
	 public double calculatesalary() {
		// TODO Auto-generated method stub
		return this.getSalary()+this.getIncentive();
	 }
    
}
