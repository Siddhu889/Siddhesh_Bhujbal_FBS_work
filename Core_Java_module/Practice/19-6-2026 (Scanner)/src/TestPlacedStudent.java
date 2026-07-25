import java.util.Scanner;

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
	
	public PlacedStudent(String company_name, String designation, String location, double distance) {
		Company_name = company_name;
		Designation = designation;
		this.location = location;
		this.distance = distance;
	}
	
	public PlacedStudent() {
		Company_name = "Infosys";
		Designation = "Cloud System Engineer";
		this.location = "Pune";
		this.distance = 85.5;
	}
}//class placed student ends here

public class TestPlacedStudent {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        PlacedStudent ps1 = new PlacedStudent("Wipro","Developer L3","Mumbai",78);
        ps1.display();
        
        System.out.println();
        
        PlacedStudent ps2 = new PlacedStudent();
        ps2.display();
        
        System.out.println();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Company Name : ");
        String company_name=sc.nextLine();
        
        System.out.println("Enter Designation : ");
        String designation=sc.nextLine();
        
        System.out.println("Enter distance : ");
        double distance=sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter location : ");
        String location=sc.nextLine();
        
		PlacedStudent ps3=new PlacedStudent(company_name,designation,location,distance);
        ps3.display();
        
        sc.close();
	}//main ends here

}//testplaced student ends here
