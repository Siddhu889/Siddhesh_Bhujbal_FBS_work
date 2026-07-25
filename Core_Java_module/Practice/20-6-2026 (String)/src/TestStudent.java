class Student
{
	int fbsid;
	String sname;
	double distancetravelled;
	static int studentcount;
	
	static {
		studentcount = 0;
	}
	
	public Student(int fbsid, String sname, double distancetravelled) {
		this.fbsid = fbsid;
		this.sname = sname;
		this.distancetravelled = distancetravelled;
		studentcount++;
	}
	
	public Student() {
		this.fbsid = 899;
		this.sname = "Siddhesh";
		this.distancetravelled = 95;
		studentcount++;
	}

	public int getFbsid() {
		return fbsid;
	}

	public void setFbsid(int fbsid) {
		this.fbsid = fbsid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public double getDistancetravelled() {
		return distancetravelled;
	}

	public void setDistancetravelled(double distancetravelled) {
		this.distancetravelled = distancetravelled;
	}

	static int getStudentcount() {
		return studentcount;
	}
//
//	static void setStudentcount(int count) {
//		return studentcount;
//	}
	void display()
	{
		System.out.println("Student FBS ID:"+fbsid);
		System.out.println("Student Name:"+sname);
		System.out.println("Studnet Distance Travelled:"+distancetravelled);
	}
	
	void calctotalstudent()
	{
		System.out.println("Total Count Of Student:");
	}

}
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Student s1 = new Student(2,"Om",33);
         s1.display();
         
         System.out.println();
         
         Student s2 = new Student(3,"Jai",8);
         s2.display();
         
         System.out.println();
         
         Student s3 = new Student(4,"Vir",9);
         s3.display();
         
         System.out.println("Total Students ="+Student.getStudentcount());
	}

}
