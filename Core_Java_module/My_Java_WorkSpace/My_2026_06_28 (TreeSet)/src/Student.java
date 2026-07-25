
class Student implements Comparable <Student>{

	int rollno;
	double marks;
	String name;
	
	public Student() {
		this.rollno = 5;
		this.marks = 89.8;
		this.name = "NA";
	}
	
	public Student(int rollno, double marks, String name) {
		this.rollno = rollno;
		this.marks = marks;
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", marks=" + marks + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		//return (int) (this.marks-s.marks);
		return this.rollno - s.rollno;
        //return this.name.compareTo(s.name);
	}
		
	public boolean equals(Object obj)
	{
		System.out.println("inside equals");
		Student s1 = (Student)obj;
		if(this.rollno == s1.rollno)
		{
			return true;
		}
		else
		{
			return false;
		}
	
	}
	
}//class Student ends her
