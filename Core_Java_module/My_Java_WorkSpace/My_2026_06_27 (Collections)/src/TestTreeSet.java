import java.util.TreeSet;

import employee.*;

public class TestTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet <Employee>ts = new TreeSet<>();
		 ts.add(new HR(104,"Priya",45000,4200));
	     ts.add(new SalesManager(204,"Rahul",61000,4520,24));
	     ts.add(new Admin(305,"Kavita",69000,9700));
	     ts.add(new HR(105,"Vikas",45000,4800));
	     ts.add(new SalesManager(205,"Tina",54000,7800,13));
	     ts.add(new Admin(306,"Manoj",75000,11500));
	     ts.add(new Admin(306,"Manoj",65000,24000));
	     
	     System.out.println(ts);
	}

}
