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
	
	public Car(String model, String brand, int year, double price) {
		this.model = model;
		this.brand = brand;
		this.year = year;
		this.price = price;
	}
	
	public Car() {
		this.model = "buggatti";
		this.brand = "lamborgini";
		this.year = 2024;
		this.price = 9800000;
	}
}//Car ends here

public class TestCar {
	public static void main(String[] args)
	{
		Car c1 = new Car();
		c1.display();
		
        System.out.println();	
        
        Car c2 = new Car("Maruti Suzuxi","Swift",2005,500000);
        c2.display();

	}//main ends here

}//Test Car ends here

