class Student
{
	int fbsid;
	String sname;
	double distancetravelled;
	static int studentcount;
	
	public Student(int fbsid, String sname, double distancetravelled) {
		this.fbsid = fbsid;
		this.sname = sname;
		this.distancetravelled = distancetravelled;
	}
	
	public Student() {
		this.fbsid = 255;
		this.sname = "Siddhu";
		this.distancetravelled = 5;
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

	public int getStudentcount() {
		return studentcount;
	}

	static int setStudentcount(int studentcount) {
		return studentcount;
	}
	
	void display()
	{
		System.out.println("Student Id:"+this.fbsid);
		System.out.println("Student Name:"+this.sname);
		System.out.println("Distance Travelled:"+this.distancetravelled);
		System.out.println("StudentCount:"+studentcount);
		
		System.out.println();
	}
	
}
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Student[] s1 = new Student[5];
         s1[0] = new Student(102,"Siddhesh",9);
         s1[1] = new Student(201,"Om",10);
         s1[2] = new Student(301,"Harsh",8);
         s1[3] = new Student(201,"Gajya",9);
         s1[4] = new Student();
         
         System.out.println(s1[1]);
         for(int i = 0;i < 5;i++)
         {
        	 s1[i].display();
         }
	}//main ends here
}//class teststudent ends here