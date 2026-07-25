
class Course
{
	int courseid,duration;
	String cname;
	double fees;
	
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	
	void display()
	{
		System.out.println("Course Id:"+this.courseid);
		System.out.println("Course Name:"+this.cname);
		System.out.println("Duration:"+this.duration+"months");
		System.out.println("Fees:"+this.fees);
	}
	
	public Course(int courseid, int duration, String cname, double fees) {
		super();
		this.courseid = courseid;
		this.duration = duration;
		this.cname = cname;
		this.fees = fees;
	}
	
	public Course() {
		super();
		this.courseid = 544;
		this.duration = 6;
		this.cname = "Java Developer";
		this.fees = 850000;
	}
}//Course ends here

public class TestCourse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Course c1 = new Course(877,7,"Data Analytics",900000);
    c1.display();
    
    System.out.println();
    
    Course c2 = new Course();
    c2.display();
	}//main ends here

}//class TestCourse ends here


