class Vehicle
{
	String brand,model;
	int speed;
	
	public Vehicle() {
		super();
		this.brand = "car";
		this.model = "four-wheeler";
		this.speed = 52;
	}
	
	public Vehicle(String brand, String model, int speed) {
		super();
		this.brand = brand;
		this.model = model;
		this.speed = speed;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	//polymorphic behaviour
	void startengine()
	{
		System.out.println("Starting.engine");
	}
	
	void display()
	{
		System.out.println();
		System.out.println("Brand:"+this.brand);
		System.out.println("Model:"+this.model);
		System.out.println("Speed:"+this.speed);
	}
}//Vehicle class ends here

class Bike extends Vehicle
{
	int gear_count;

	public Bike() {
		super();
		this.gear_count = 6;
	}
	
	public Bike(String brand, String model, int speed,int gearcount) {
		super(brand,model,speed);
		this.gear_count = gearcount;
	}

	public int getGearcount() {
		return gear_count;
	}

	public void setGearcount(int gearcount) {
		this.gear_count = gearcount;
	}
	
	//polymorphic behaviour
	void startengine()
	{
		System.out.println("Starting engine with kick or cell start");
	}
	
	void display()
	{
		super.display();
		System.out.println("Gear Count:"+this.gear_count);
		System.out.println();
	}
}//Bike class ends here

class Truck extends Vehicle
{
	int load_capacity,wheel_count;

	public Truck() {
		super();
		this.load_capacity = 4000;
		this.wheel_count = 12;
	}
	
	public Truck(String brand, String model, int speed,int loadcapacity, int wheelcount) {
		super(brand,model,speed);
		this.load_capacity = loadcapacity;
		this.wheel_count = wheelcount;
	}

	public int getLoadcapacity() {
		return load_capacity;
	}

	public void setLoadcapacity(int loadcapacity) {
		this.load_capacity = loadcapacity;
	}

	public int getWheelcount() {
		return wheel_count;
	}

	public void setWheelcount(int wheelcount) {
		this.wheel_count = wheelcount;
	}
	
	void startengine()
	{
		System.out.println("Starting engine with heavy duty engine");
	}
	
	void display()
	{
		super.display();
		System.out.println("LoadCapacity:"+this.load_capacity);
		System.out.println("WheelCount:"+this.wheel_count);
		System.out.println();
	}
}//Truck class ends here

class Car extends Vehicle
{
	int bootspace,air_bag_count;

	public Car() {
		super();
		this.bootspace = 2400;
		this.air_bag_count = 4;
	}
	
	public Car(String brand, String model, int speed,int bootspace, int airbagcount) {
		super(brand,model,speed);
		this.bootspace = bootspace;
		this.air_bag_count = airbagcount;
	}

	public int getBootspace() {
		return bootspace;
	}

	public void setBootspace(int bootspace) {
		this.bootspace = bootspace;
	}

	public int getAirbagcount() {
		return air_bag_count;
	}

	public void setAirbagcount(int airbagcount) {
		this.air_bag_count = airbagcount;
	}
	
	//polymorphic behaviour
	void startengine()
	{
		System.out.println("Starting engine with electronic ignition");
	}
	
	void display()
	{
		super.display();
		System.out.println("Boot Space:"+this.bootspace);
		System.out.println("Air Bag Count:"+this.air_bag_count);
		System.out.println();
	}
}

public class TestVehicle {

	public static void main(String[] args) {
	     // TODO Auto-generated method stub
		 Vehicle v1;
		 
		 v1 = new Vehicle("Toyoto","Corolla",120);
		 v1.display();
		 v1.startengine();
		 
		 v1 = new Bike("Bullet","B1",150,9);
		 v1.display();
		 v1.startengine();
		 
		 v1 = new Truck("Volvo","FH2",90,8777,19);
		 v1.display();
		 v1.startengine();
		 
		 v1 = new Car("Tesla","Model s",900,450,3);
		 v1.display();
		 v1.startengine();
		 
	}//main ends here

}//test vehicle ends here