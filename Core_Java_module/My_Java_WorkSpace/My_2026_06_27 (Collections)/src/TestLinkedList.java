import java.util.LinkedList;

import employee.*;

public class TestLinkedList {
       
	public static void main(String[]args)
	{
		LinkedList <Employee>ll = new LinkedList<>();
		
		 ll.add(new HR(104,"Priya",45000,4200));
	     ll.add(new SalesManager(204,"Rahul",61000,4520,24));
	     ll.add(new Admin(305,"Kavita",69000,9700));
	     ll.add(new HR(105,"Vikas",45000,4800));
	     ll.add(new SalesManager(205,"Tina",54000,7800,13));
	     ll.add(new Admin(306,"Manoj",75000,11500));
	     ll.add(new Admin(306,"Manoj",65000,24000));
        
        System.out.println(ll);
        
        for(int i = 0;i <ll.size();i++)
        {
        	Employee e = (Employee) ll.get(i);
        	System.out.println(e.calculatesalary());
        }
	}
}
