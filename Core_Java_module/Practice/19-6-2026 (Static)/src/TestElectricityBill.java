class ElectricityBill
{
	int id,unit;
	String name;
	static double rateperunit;
	
	static
	{
		rateperunit = 20;
	}
	public ElectricityBill(int id, int unit, String name, double rateperunit) {
		this.id = id;
		this.unit = unit;
		this.name = name;
	}
	
	public ElectricityBill() {
		this.id = 502;
		this.unit = 102;
		this.name = "Siddhesh";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUnit() {
		return unit;
	}

	public void setUnit(int unit) {
		this.unit = unit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	static double getRateperunit() {
		return rateperunit;
	}

	static void setRateperunit(double rate) {
		rateperunit = rate;
	}
	
	void calcBill()
	{
		System.out.println("Total Bill Amount:"+(this.unit)* rateperunit);
	}
	
	void display()
	{
		System.out.println("Id:"+this.id);
		System.out.println("Name:"+this.name);
		System.out.println("Unit:"+this.unit);
		System.out.println("Rate Per Unit"+rateperunit);
	}
}//class electricity bill ends here
public class TestElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          ElectricityBill e1 = new ElectricityBill(103,200,"Siddhesh",20);
          e1.display();
          e1.calcBill();
          
          System.out.println();
          
	}

}//class TestElectricity bill ends here
