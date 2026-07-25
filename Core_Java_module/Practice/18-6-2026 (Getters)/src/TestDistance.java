
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
}

public class TestDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Distance d1 = new Distance();
        d1.setFeet(5);
        d1.setInch(9);
        d1.display();
	}//main ends here

}//class TestDistance ends here
	