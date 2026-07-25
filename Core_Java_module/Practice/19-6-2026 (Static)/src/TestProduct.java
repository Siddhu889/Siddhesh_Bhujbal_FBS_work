class Product
{
	int pid,quantity;
	String name;
	double costprice;
	static double discount;
	
	static {
		discount = 10;
	}
	
	public Product(int pid, int quantity, String name, double costprice, double discount) {
		this.pid = pid;
		this.quantity = quantity;
		this.name = name;
		this.costprice = costprice;
	}
	
	public Product() {
		this.pid = 855;
		this.quantity = 3;
		this.name = "Toy Car";
		this.costprice = 300;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCostprice() {
		return costprice;
	}

	public void setCostprice(double costprice) {
		this.costprice = costprice;
	}

	static double getDiscount() {
		return discount;
	}

	static void setDiscount(double count) {
		discount = count;
	}
	
	void display()
	{
		System.out.println("PID no:"+this.pid);
		System.out.println("Quantity:"+this.quantity);
		System.out.println("Name:"+this.name);
		System.out.println("CostPrice:"+this.costprice);
		System.out.println("Discount:"+discount);
	}
	
	void calctotalamount()
	{
		double amount = costprice - (costprice * discount / 100);
		System.out.println("Apply Discount:"+ amount);
	}
}
public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Product p1 = new Product(211,2,"Toy Train",8900,9);
         p1.display();
         p1.calctotalamount();
         
         System.out.println();
         
         Product p2 = new Product(455,5,"Jeans",19000,5);
         p2.display();
         p2.calctotalamount();
	}

}
