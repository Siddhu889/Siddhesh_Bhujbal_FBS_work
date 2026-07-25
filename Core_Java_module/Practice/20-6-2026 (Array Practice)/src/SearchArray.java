//2.	Search the given number in array.

import java.util.Scanner;

public class SearchArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Size of Array:");
        int size = sc.nextInt();
        
        int arr[] = new int[size];
        
        System.out.println("Enter Array Elements:");
        for(int i = 0;i < arr.length;i++)
        {
        	arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter Element to Search:");
        int search = sc.nextInt();
        
        boolean found  = false;
        
        for(int i = 0;i < arr.length;i++)
        {
        	if(arr[i] == search)
        	{
        		found = true;
        		break;
        	}
        }
        if(found) {
        System.out.println("Element is in List");
        }
        else {
        System.out.println("Element is Not in List");
        }
        sc.close();
	}

}
