class ElectronicDevice
{
	String brand,model;
	int battery;
	String processor;
	
	public ElectronicDevice() {
		super();
		this.brand = "Apple";
		this.model = "iphone";
		this.battery = 45;
		this.processor = "SSD";
	}
	
	public ElectronicDevice(String brand, String model, int battery, String processor) {
		super();
		this.brand = brand;
		this.model = model;
		this.battery = battery;
		this.processor = processor;
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

	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}
	
	void display()
	{
		
		System.out.println("Brand:"+this.brand);
		System.out.println("Model:"+this.model);
		System.out.println("Battery:"+this.battery);
		System.out.println("Processor:"+this.processor);
	}
}//ElectronicDevice class ends here

class Laptop extends ElectronicDevice
{
	int no_ofport;
	String os_type,graphicscard;
	
	public Laptop() {
		super();
		this.no_ofport = 2;
		this.os_type = "Linux";
		this.graphicscard = "NVDIA";
	}
	
	public Laptop(String brand, String model, int battery, String processor,int no_ofport, String os_type, String graphicscard) {
		super(brand,model,battery,processor);
		this.no_ofport = no_ofport;
		this.os_type = os_type;
		this.graphicscard = graphicscard;
	}

	public int getNo_ofport() {
		return no_ofport;
	}

	public void setNo_ofport(int no_ofport) {
		this.no_ofport = no_ofport;
	}

	public String getOs_type() {
		return os_type;
	}

	public void setOs_type(String os_type) {
		this.os_type = os_type;
	}

	public String getGraphicscard() {
		return graphicscard;
	}

	public void setGraphicscard(String graphicscard) {
		this.graphicscard = graphicscard;
	}
	
	void display()
	{
		super.display();
		System.out.println("No_Of Ports:"+this.no_ofport);
		System.out.println("OS Type:"+this.os_type);
		System.out.println("Graphics Card:"+this.graphicscard);
		System.out.println();
	}
}//Laptop class ends here

class Mobile extends ElectronicDevice
{
	int simslots,no_ofcamera;

	public Mobile() {
		super();
		this.simslots = 2;
		this.no_ofcamera = 3;
	}
	
	public Mobile(String brand, String model, int battery, String processor,int simslots, int no_ofcamera) {
		super(brand,model,battery,processor);
		this.simslots = simslots;
		this.no_ofcamera = no_ofcamera;
	}

	public int getSimslots() {
		return simslots;
	}

	public void setSimslots(int simslots) {
		this.simslots = simslots;
	}

	public int getNo_ofcamera() {
		return no_ofcamera;
	}

	public void setNo_ofcamera(int no_ofcamera) {
		this.no_ofcamera = no_ofcamera;
	}
	
	void display()
	{
		super.display();
		System.out.println("Sim Slots:"+this.simslots);
		System.out.println("No_of Camera:"+this.no_ofcamera);
		System.out.println();
	}
}//mobile ends here

public class TestElectronicDevice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ElectronicDevice ed1 = new ElectronicDevice();
        ed1.display();
        ElectronicDevice ed2 = new ElectronicDevice("Dell","XPS 15",6000,"Intel i7");
        ed2.display();
        
        Laptop l1 = new Laptop();
        l1.display();
        Laptop l2 = new Laptop("Apple","MacBook Pro",5800,"M2",4,"macos","Apple GPU");
        l2.display();
        
        Mobile m1 = new Mobile();
        m1.display();
        Mobile m2 = new Mobile("Samsung", "Galaxy S23",5000,"SnapDragon 8",2,4);
        m2.display();
       
	}//main ends here

}//TestElectronicDevice ends here
