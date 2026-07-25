package p1;

public class TestStudent {
     
	public static void main(String[] args) {
		
//		PayFees stud1 = new OnlineStudent();
//		stud1.payonline();
//		PayFees stud2 = new DemoStudent();
//		stud2.payoffline();
		
		PayFees[] students = { new OnlineStudent(), new DemoStudent(), new OfflineStudent()};
		for(PayFees student:students)
		{
			student.payoffline();
		}
    }
}