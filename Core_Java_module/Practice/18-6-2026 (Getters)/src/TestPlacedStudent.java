
class PlacedStudent
{
	String Company_name,Designation,location;
	double distance;
	
	
	public String getCompany_name() {
		return Company_name;
	}
	public void setCompany_name(String company_name) {
		Company_name = company_name;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	
	void display()
	{
		System.out.println("Company Name:"+this.Company_name);
		System.out.println("Desgination:"+this.Designation);
		System.out.println("Location:"+this.location);
		System.out.println("Distance:"+this.distance);
	}
	
}//class placed student ends here
 
public class TestPlacedStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 PlacedStudent ps1 = new PlacedStudent();
         ps1.setCompany_name("Walmart");
         ps1.setDesignation("Software Developer");
         ps1.setLocation("Pune");
         ps1.setDistance(58);
	}//main ends here

}//testplaced student ends here
