import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class Demo {

	public static void main1(String[] args) {
		Set <String>s1 = new TreeSet<>();
		System.out.println("ye tree set wala hai");
		 s1.add("Siddhesh");
		 s1.add("XYZ");
		 s1.add("abcd");
		 
		 for(Object obj:s1)
		 {
			 String str = (String)obj;
		     System.out.println(str.length());
		 }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List <String>l1= new ArrayList<>();
    l1.add("Siddhesh");
    l1.add("XYZ");
    l1.add("abcd");
    
    //System.out.println(l1);
    for(int i = 0; i <l1.size(); i++)
    {
    	String str = (String)l1.get(i);
    	System.out.println(str.length());
    }
    System.out.println("ye ArrayList wala hai");
    for(String str:l1)
	 {
		// String str = (String)obj;
	     System.out.println(str.length());
	 }
	}
}
