
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
}//Course ends here

public class TestCourse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Course c1 = new Course();
         c1.setCourseid(109);
         c1.setDuration(9);
         c1.setCname("Java FullStack");
         c1.setFees(40000);
         c1.display();
	}//main ends here

}//class TestCourse ends here
	