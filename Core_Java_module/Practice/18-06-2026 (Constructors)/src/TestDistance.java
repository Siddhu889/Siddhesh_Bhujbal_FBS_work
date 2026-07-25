
class Distance
{
	int feet,inch;

	public int getFeet() {
		return feet;
	}

	public void setFeet(int feet) {
		this.feet = feet;
	}

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}
	
	void display()
	{
		System.out.println("Distance is:"+this.feet+" feet and "+this.inch+" inch");
	}

	public Distance(int feet, int inch) {
		this.feet = feet;
		this.inch = inch;
	}
	
	public Distance() {
		this.feet = 5;
		this.inch = 9;
	}
	
}

public class TestDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Distance d1 = new Distance();
    d1.display();
    
    System.out.println();
    
    Distance d2 = new Distance(3,5);
    d2.display();
	}//main ends here

}//class TestDistance ends here

