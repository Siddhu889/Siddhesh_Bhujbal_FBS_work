class User
{
	int user_id;
	String name;
	String email;
	
	public User() {
		super();
		this.user_id = 541;
		this.name = "Siddhesh";
		this.email = "siddheshbhujbal987@gmail.com";
	}
	
	public User(int user_id, String name, String email) {
		super();
		this.user_id = user_id;
		this.name = name;
		this.email = email;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	void display()
	{
		System.out.println("User Id:"+this.user_id);
		System.out.println("Name:"+this.name);
		System.out.println("Email:"+this.email);
	}
}
class Student extends User
{
	String course_name;
	double marks;
	
	public Student() {
		super();
		this.course_name = "Java Full Stack Development";
		this.marks = 85;
	}
	
	public Student(int user_id, String name, String email,String course_name, double marks) {
		super();
		this.course_name = course_name;
		this.marks = marks;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	void display()
	{
		super.display();
		System.out.println("Course Name:"+this.course_name);
		System.out.println("Marks:"+this.marks);
		System.out.println();
	}
}
class Admin  extends User
{
	String role;
	int access_level;
	
	public Admin() {
		super();
		this.role = "Teacher";
		this.access_level = 5;
	}
	
	public Admin(int user_id, String name, String email,String role, int access_level) {
		super();
		this.role = role;
		this.access_level = access_level;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getAccess_level() {
		return access_level;
	}

	public void setAccess_level(int access_level) {
		this.access_level = access_level;
	}
	
	void display()
	{
		super.display();
		System.out.println("Role:"+this.role);
		System.out.println("Access Level:"+this.access_level);
		System.out.println();
	}
}
class Instructor  extends User
{
	String subject;
	int experience;
	
	public Instructor() {
		super();
		this.subject = "Math";
		this.experience = 5;
	}
	
	public Instructor(int user_id, String name, String email,String subject, int experience) {
		super();
		this.subject = subject;
		this.experience = experience;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	void display()
	{
		super.display();
		System.out.println("Subject Name:"+this.subject);
		System.out.println("Experience:"+this.experience);
		System.out.println();
	}
}
public class Test_Online_Learning_Platform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         User u1 = new User();
         u1.display();
         User u2 = new User(102,"Siddhesh","sbhuj@gmail.com");
         u2.display();
         
         Student s1 = new Student();
         s1.display();
         Student s2 = new Student(477,"Jai","jai454@gmail.com","Python",58);
         s2.display();
         
         Admin a1 = new Admin();
         a1.display();
         Admin a2 = new Admin(888,"Om","om45@gmial.com","Developer",8);
         a2.display();
         
         Instructor i1 = new Instructor();
         i1.display();
	}

}
