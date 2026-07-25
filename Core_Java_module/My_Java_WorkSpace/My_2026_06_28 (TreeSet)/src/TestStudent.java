import java.util.ArrayList;
import java.util.TreeSet;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList <Student> al = new ArrayList <Student> ();
        al.add(new Student(101,90,"Atharva"));
        al.add(new Student(103,60,"Soham"));
        al.add(new Student(104,40,"Aditya"));
        al.add(new Student(102,50,"Pranav"));
        
        System.out.println(al);
        
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

	public static void main1(String[] args) {
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
