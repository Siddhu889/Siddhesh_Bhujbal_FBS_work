
class Product
{
	int id,quantity;
	String name;
	double price;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	void display()
	{
		System.out.println("Id:"+this.id);
		System.out.println("Quantity:"+this.quantity);
		System.out.println("Name:"+this.name);
		System.out.println("Price:"+this.price);
	}
}//class product ends here

public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product();
        p1.setId(101);
        p1.setName("Siddhesh");
        p1.setQuantity(34);
        p1.setPrice(50000.89);
        p1.display();
	}

}

