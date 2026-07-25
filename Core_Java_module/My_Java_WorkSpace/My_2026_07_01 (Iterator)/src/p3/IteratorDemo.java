package p3;

import java.util.ArrayList;
import java.util.Iterator;


public class IteratorDemo {

	public static void main(String[] args) {
		// TArrayList<E>generated method stub
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Mum");
        cities.add("Solapur");
        
//        for(String city : cities)
//        {
//        	if(city.equals("Mumbai"))
//        		cities.remove("Mumbai");
//        }
//        System.out.println(cities);
        
        System.out.println("Hello");
        Iterator <String>myit = cities.iterator();
        
        while(myit.hasNext())
        {
        	String city = (String) myit.next();
        	if(city.equals("Mumbai"))
        	myit.remove();
        }
        
        System.out.println(cities);
	}

}
