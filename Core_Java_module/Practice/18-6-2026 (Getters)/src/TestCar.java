class Car
{
	String model,brand;
	int year;
	double price;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	void display()
	{
		System.out.println("Brand:"+this.brand);
		System.out.println("Model:"+this.model);
		System.out.println("Year:"+this.year);
		System.out.println("Price:"+this.price);
	}
}//Car ends here

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Car c1 = new Car();
         c1.setBrand("Mahindra");
         c1.setModel("BE 9e");
         c1.setYear(2025);
         c1.setPrice(50000.99);
         c1.display();
	}//main ends here

}//Test Car ends here
	