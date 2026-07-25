package p1;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MyLinkedList myLL = new MyLinkedList();
        
        Scanner  sc = new Scanner(System.in);
        //Node n1 = new Node(10);
        //insertion
//        myll.add(10);
//        myll.add(20);
//        myll.add(30);
//        myll.add(40);
//        myll.add(50);
//        
//        //display all elements
//        myll.display();
        
        int choice,data;
        
        do {
        	System.out.println("\t1.Add");
        	System.out.println("\t2.Display");
        	System.out.println("\t3.Delete");
        	System.out.println("\t3.Exit");
        	System.out.println("Enter your choice:");
        	choice = sc.nextInt();
        	
        	switch(choice)
        	{
        	case 1:
        	{
        		int subChoice,loopChoice;
        		do {
        			System.out.println("Enter data: ");
        			data = sc.nextInt();
        			System.out.println("\t1. Add First");
        			System.out.println("\t2. Add Position");
        			System.out.println("\t3. Add Last");
        			System.out.println("Enter Your Choice:");
        			subChoice=sc.nextInt();
        			boolean countinueAddition=true;
        			
        			switch(subChoice)
        			{
        			case 1:
        			{
        				myLL.addFirst(data);
        				break;
        			}
        			case 2:
        			{
        				int position;
        				System.out.println("\n Enter position:");
        				position = sc.nextInt();
        				myLL.addPosition(data, position);
        				break;
        			}
        			case 3:
        			{
        				myLL.addLast(data);
        				break;
        			}
        			default:
        			{
        				System.out.println("Invalid. Enter a valid choice.");
        				countinueAddition=false;
        				break;
        			}
        				
        		}
        			if(countinueAddition)
        			{
        				System.out.println("\n\t1. To countinue Adding Elements.");
        				System.out.println("\t2. GO to Main Menu");
        				System.out.println("\tEnter Your Choice:");
        				loopChoice=sc.nextInt();
        				
        				while(loopChoice != 1 && loopChoice != 2)
        				{
        					System.out.println("Invalid. Enter a Valid Choice.");
        					loopChoice=sc.nextInt();
        				}
        			}
        			
        			else loopChoice=1;
        			
        	}while(loopChoice == 1);
        	
        		System.out.println("Returning to main menu.");
        		break;
        	}
        	
        	case 2:
        	{
        		myLL.display();
        		break;
        	}
        	
        	case 3:
        	{
        		int subChoice,loopChoice=1;
        		do {
        			System.out.println("\t1. Delete First");
        			System.out.println("\t2. Delete Position");
        			System.out.println("\t3. Delete Last");
        			System.out.println("\t4. Back to Main Menu");
        			System.out.println("Enter Your Choice:");
        			subChoice=sc.nextInt();
        			
        			switch(subChoice)
        			{
        			case 1:
        			{
        				myLL.deleteFirst();
        				break;
        			}
        			
        			case 2:
        			{
        				System.out.println("\nEnter Position to delete:");
        				int position=sc.nextInt();
        				myLL.deletedAtPosition(position);
        				break;
        			}
        			case 3:
        			{
        				myLL.deleteLast();
        				break;
        			}
        			case 4:
        			{
        				System.out.println("Returning to main menu.");
        				loopChoice = 2;
        				break;
        			}
        			default:
        			{
        				System.out.println("Invalid. Enter a Valid Choice.");
        				break;
        			}
        			}
        			
        			if(subChoice >= 1 && subChoice <= 3)
        			{
        				System.out.println("\n\t1. To Countinue Deleting Elements");
        				System.out.println("\t2. GO to Main Menu.");
        				System.out.println("\tEnter Your Choice:");
        				loopChoice=sc.nextInt();
        				
        				while(loopChoice != 1 && loopChoice != 2)
        				{
        					System.out.println("Invalid. Enter a Valid Choice.");
        					loopChoice=sc.nextInt();
        				}
        			}
        		}while(loopChoice == 1);
        		break;
        	}
        	
        	case 4:
        	{
        		System.out.println("Exiting.....");
        		break;
        	}
        	
        	default:
        	{
        		System.out.println("Invalid. Enter a Valid Choice");
        	}
        	
       }
        	
        	
    }while(choice != 4);
        sc.close();
        
  }
	
	
}
