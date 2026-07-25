import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class TestStudent {

	public static void main1(String[] args)
	{
		HashSet <Student> al = new HashSet <Student> ();
        al.add(new Student(101,90,"Atharva"));
        al.add(new Student(103,60,"Soham"));
        al.add(new Student(104,40,"Aditya"));
        al.add(new Student(102,50,"Pranav"));
        al.add(new Student(102,50,"Pranav"));
        
        System.out.println(al);
        
        if(al.contains(new Student(103,60,"Soham")))
        {
        	System.out.println("Found");
        }
        else
        {
        	System.out.println("Not Found");
        }
        
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList <Student> arrlist = new ArrayList <Student> ();
        arrlist.add(new Student(101,90,"Atharva"));
        arrlist.add(new Student(103,60,"Soham"));
        arrlist.add(new Student(104,40,"Aditya"));
        arrlist.add(new Student(102,50,"Pranav"));
        
        System.out.println("Before Sorting \n"+arrlist);
        Collections.sort(arrlist);
        System.out.println("After sort \n"+arrlist);  
        
        for(Student s1:arrlist)
        {
        	System.out.println(s1.getName());
        }
      
//        if(al.contains(new Student(103,60,"Soham")))
//        {
//        	System.out.println("Found");
//        }
//        else
//        {
//        	System.out.println("Not Found");
//        }
	}

	public static void main2(String[] args) {
		// TODO Auto-generated method stub
        TreeSet <Student> ts = new TreeSet <Student> ();
        ts.add(new Student(101,90,"Atharva"));
        ts.add(new Student(103,60,"Soham"));
        ts.add(new Student(104,40,"Aditya"));
        ts.add(new Student(102,50,"Pranav"));
        
        System.out.println(ts);
        
        if(ts.contains(new Student(103,60,"Soham")))
        {
        	System.out.println("Found");
        }
        else
        {
        	System.out.println("Not Found");
        }
	}
}
