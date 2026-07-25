package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestStudent {

	 public static void main(String[] args) {
		
		 ArrayList<Student> a1 = new ArrayList<Student>();
		 a1.add(new Student(101,90,"Siddhesh"));
		 a1.add(new Student(107,80,"Om"));
		 a1.add(new Student(103,70,"Jai"));
		 a1.add(new Student(105,30,"Rohan"));
		 
		 Scanner sc = new Scanner(System.in);
		 while(true)
		 {
			 System.out.println("\n-------Menu-------");
			 System.out.println("1. Sort By Roll Number");
			 System.out.println("2. Sort By Name");
			 System.out.println("3. Sort By Marks");
			 System.out.println("0. Exit");
			 System.out.println("Enter Choice:");
			 int choice = sc.nextInt();
			 sc.nextLine();
			 
			 switch(choice)
			 {
			 case 1:
				 StudentRollComparator rc = new StudentRollComparator();
				 Collections.sort(a1,rc);
				 System.out.println(a1);
				 break;
				 
			 case 2:
				 StudentNameComparator nc = new StudentNameComparator();
				 Collections.sort(a1,nc);
				 System.out.println(a1);
				 break;
				 
			 case 3:
				 StudentMarkComparator mc = new StudentMarkComparator();
				 Collections.sort(a1,mc);
				 System.out.println(a1);
				 break;
				 
			 case 0:
				 System.out.println("Exit");
				 System.exit(0);
				 
				 sc.close();
			 }
		 }
	}
}
