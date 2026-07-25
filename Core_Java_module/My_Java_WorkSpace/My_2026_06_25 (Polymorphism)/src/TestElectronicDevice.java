class ElectronicDevice
{
	String brand,model;
	int battery;
	String processor;
	
	public ElectronicDevice() {
		super();
		this.brand = "Apple";
		this.model = "A12";
		this.battery = 54;
		this.processor = "RAM";
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
	
	//polmorphic device
	void connect_to_network()
	{
		System.out.println("Connecting to Network");
	}
	
	void display()
	{
		System.out.println("Brand:"+this.brand);
		System.out.println("Battery:"+this.battery);
		System.out.println("Model:"+this.model);
		System.out.println("Processor:"+this.processor);
	}
	
}
class Laptop extends ElectronicDevice
{
	int no_of_port;
	String os_type,graphics_card;
	
	public Laptop() {
		super();
		this.no_of_port = 3;
		this.os_type = "iphone";
		this.graphics_card = "NVDIA";
	}
	
	public Laptop(String brand, String model, int battery, String processor,int no_of_port, String os_type, String graphics_card) {
		super(brand,model,battery,processor);
		this.no_of_port = no_of_port;
		this.os_type = os_type;
		this.graphics_card = graphics_card;
	}

	public int getNo_of_port() {
		return no_of_port;
	}

	public void setNo_of_port(int no_of_port) {
		this.no_of_port = no_of_port;
	}

	public String getOs_type() {
		return os_type;
	}

	public void setOs_type(String os_type) {
		this.os_type = os_type;
	}

	public String getGraphics_card() {
		return graphics_card;
	}

	public void setGraphics_card(String graphics_card) {
		this.graphics_card = graphics_card;
	}
	
	//polmorphic device
	void connect_to_network()
	{
		System.out.println("Connected to wifi");
	}
	void display()
	{
		super.display();
		System.out.println("No of Ports:"+this.no_of_port);
		System.out.println("Graphics Card:"+this.graphics_card);
		System.out.println("OS Type:"+this.os_type);
		System.out.println();
	}
}
class Mobile extends ElectronicDevice
{
	int sim_slots,no_of_camera;

	public Mobile() {
		super();
		this.sim_slots = 2;
		this.no_of_camera = 3;
	}
	
	public Mobile(String brand, String model, int battery, String processor,int sim_slots, int no_of_camera) {
		super(brand,model,battery,processor);
		this.sim_slots = sim_slots;
		this.no_of_camera = no_of_camera;
	}

	public int getSim_slots() {
		return sim_slots;
	}

	public void setSim_slots(int sim_slots) {
		this.sim_slots = sim_slots;
	}

	public int getNo_of_camera() {
		return no_of_camera;
	}

	public void setNo_of_camera(int no_of_camera) {
		this.no_of_camera = no_of_camera;
	}
	
	//polmorphic device
	void connect_to_network()
	{
		System.out.println("Connecting to network using 4G/5G");
	}	
	
	void display()
	{
		super.display();
		System.out.println("Sim Slots:"+this.sim_slots);
		System.out.println("No Of Camera:"+this.no_of_camera);
		System.out.println();
	}
}

public class TestElectronicDevice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ElectronicDevice ed1;
        
        ed1=new ElectronicDevice("Dell", "XPS 15", 6000, "Intel i7");
        ed1.display();
        ed1.connect_to_network();

        ed1=new Laptop("Apple", "MacBook Pro", 5800, "M2", 4, "macOS", "Apple GPU");
        ed1.display();
        ed1.connect_to_network();
        
        ed1= new Mobile("Samsung", "Galaxy S23", 5000, "Snapdragon 8", 2, 4);
        ed1.display();
        ed1.connect_to_network();
        } //main ends here

} //TestElectronicDevice ends here


