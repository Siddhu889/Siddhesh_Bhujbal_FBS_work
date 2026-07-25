package p1;

class InvalidMarksException extends Exception
{
	private static final long serialVersionUID = 1L;
	
	public String toString()
	{
		return "Invalid marks entered enter correct numbers";
	}
}

class Grade
{
	int marks;

	Grade(int marks) {
		super();
		this.marks = marks;
	}

	int getMarks() {
		return marks;
	}

	void setMarks(int marks) {
		this.marks = marks;
	}
	
	void givegrade()
	{
		try
		{
			if(this.marks <= 34 && this.marks >= 0)
			{
				System.out.println("Grade is : Fail");
			}
			else if(this.marks <= 59 && this.marks >34)
			{
				System.out.println("Grade is : Pass");
			}
			else if(this.marks <= 74 && this.marks > 59)
			{
				System.out.println("Grade is : First Class");
			}
			else if(this.marks <= 100 && this.marks > 74)
			{
				System.out.println("Grade is : First Class with distinction");
			}
			else
			{
				throw new InvalidMarksException();
			}
		}
		    catch(InvalidMarksException imeecn)
		{
		    	System.out.println(imeecn);
		}
	}
}// Grade ends here

public class TestGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Grade g1 = new Grade(92);
        g1.givegrade();
	}

}
