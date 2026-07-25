package p1;

import java.util.ArrayList;
import java.util.Collections;

public class Classroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<Integer> list = new  ArrayList<>();
       list.add(2);
       list.add(5);
       list.add(9);
       list.add(3);
       list.add(6);
       
       System.out.println(list);
       Collections.sort(list);//ascending
       System.out.println(list);
       
       //descending
       Collections.sort(list, Collections.reverseOrder());
       System.out.println(list);
       //Comparator - fnx logic(use for sorting logic)
	}

}
