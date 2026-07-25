package map;

import java.util.TreeMap;

public class TestStudent {
       public static void main(String[] args) {
		TreeMap <MyKey, Student> tm = new TreeMap<MyKey, Student>();
		tm.put(new MyKey(101), new Student(101,90,"Atharva"));
		tm.put(new MyKey(103), new Student(103,60,"Siddhesh"));
		tm.put(new MyKey(102), new Student(102,80,"Om"));
		tm.put(new MyKey(105), new Student(105,30,"Jai"));
		tm.put(new MyKey(109), new Student(109,50,"Rohan"));
		
		System.out.println(tm);
	}
}
