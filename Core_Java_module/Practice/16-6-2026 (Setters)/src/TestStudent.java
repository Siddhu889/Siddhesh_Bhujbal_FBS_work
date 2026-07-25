class Student
{
	int rollNo;
	String name;
	double marks;
	
	void setRollNo(int r)
	{
		this.rollNo=r;
	}
	
	void setMarks(double m)
	{
		this.marks=m;
	}
	
	void setName(String n)
	{
		this.name=n;
	}
}//Class Student ends here

 class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Student s1;
         s1=new Student();
         System.out.println(s1);
         s1.setRollNo(10);
         s1.setMarks(85.9);
         s1.setName("Siddhesh");
         System.out.println("Roll No: "+s1.rollNo);
         System.out.println("Marks: "+s1.marks);
         System.out.println("Name: "+s1.name);
	}//main ends here

}//Class TestStudent ends here
