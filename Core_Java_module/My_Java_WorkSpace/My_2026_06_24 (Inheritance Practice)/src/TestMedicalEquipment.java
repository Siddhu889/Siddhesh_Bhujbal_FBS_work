class MedicalEquipment
{
	String name;
	double price;
	int powerUsage;
	
	public MedicalEquipment() {
		super();
		this.name = "Siddhesh";
		this.price = 5200;
		this.powerUsage = 10000;
	}
	
	public MedicalEquipment(String name, double price, int powerUsage) {
		super();
		this.name = name;
		this.price = price;
		this.powerUsage = powerUsage;
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

	public int getPowerUsage() {
		return powerUsage;
	}

	public void setPowerUsage(int powerUsage) {
		this.powerUsage = powerUsage;
	}
	
	void display()
	{
		System.out.println();
		System.out.println("Name:"+this.name);
		System.out.println("Price:"+this.price);
		System.out.println("Power Usage:"+this.powerUsage);
	}
}//MedicalEquipment ends here

class XRay extends MedicalEquipment
{
	double radition_level;

	public XRay(String name, double price, int powerUsage,double raditionlevel) {
		super(name,price,powerUsage);
		this.radition_level = raditionlevel;
	}
	
	public XRay() {
		super();
		this.radition_level = 3;
	}

	public double getRaditionlevel() {
		return radition_level;
	}

	public void setRaditionlevel(double raditionlevel) {
		this.radition_level = raditionlevel;
	}
	
	void display()
	{
		super.display();
		System.out.println("Radation level:"+this.radition_level);
	}
}//XRay ends here

class MRI extends MedicalEquipment
{
	double magnetic_strength;
	int scantime;
	
	public MRI(String name, double price, int powerUsage,double magneticstrength, int scantime) {
		super(name,price,powerUsage);
		this.magnetic_strength = magneticstrength;
		this.scantime = scantime;
	}
	
	public MRI() {
		super();
		this.magnetic_strength = 5;
		this.scantime = 50;
	}

	public double getMagneticstrength() {
		return magnetic_strength;
	}

	public void setMagneticstrength(double magneticstrength) {
		this.magnetic_strength = magneticstrength;
	}

	public int getScantime() {
		return scantime;
	}

	public void setScantime(int scantime) {
		this.scantime = scantime;
	}
	
	void display()
	{
		super.display();
		System.out.println("Magnetic Strength:"+this.magnetic_strength);
		System.out.println("Scan Time:"+this.scantime);
	}
}//MRI ends here

public class TestMedicalEquipment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    MedicalEquipment me1 = new MedicalEquipment();
    me1.display();
    MedicalEquipment me2 = new MedicalEquipment("Ventilator",250000,1500);
    me2.display();
    
    XRay x1 = new XRay();
    x1.display();
    XRay x2 = new XRay("XRay Model X",500000,2000,8.5);
    x2.display();
    
    MRI m1 = new MRI();
    m1.display();
    MRI m2 = new MRI("MRI Scanner Pro",200000,5000,7.5,45);
    m2.display();
    
	}//main ends here

}//TestMedicalEquipment ends here
