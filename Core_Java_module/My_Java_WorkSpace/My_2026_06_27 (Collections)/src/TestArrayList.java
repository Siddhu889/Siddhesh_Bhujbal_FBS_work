import java.util.ArrayList;

import employee.*;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList <Employee>al = new ArrayList<>();
        
        al.add(new HR(104,"Priya",45000,4200));
        al.add(new SalesManager(204,"Rahul",61000,4520,24));
        al.add(new Admin(305,"Kavita",69000,9700));
        al.add(new HR(105,"Vikas",45000,4800));
        al.add(new SalesManager(205,"Tina",54000,7800,13));
        al.add(new Admin(306,"Manoj",75000,11500));
        al.add(new Admin(306,"Manoj",65000,24000));
        
        System.out.println(al);
        
        for(int i = 0;i < al.size();i++)
        {
        	Employee e = (Employee) al.get(i);
        	System.out.println(e.calculatesalary());
        }
	}

}
