import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Enter Size Of Array:");
         int size = sc.nextInt();
         
         int arr[] = new int[size];
         
         System.out.println("Enter the Elements Of Array:");
         for(int i = 0; i < arr.length; i++)
         {
        	 arr[i] = sc.nextInt();
         }
         
         for(int i = 0;i < arr.length;i++)
         {
        	 for(int j = 0;j < arr.length; j++)
        	 {
        		 if(arr[i] > arr[j])
        		 {
        			 int temp = arr[i];
        			 arr[i] = arr[j];
        			 arr[j] = temp;
        		 }
        	 }
         }
	      
         System.out.println("Sorted Array:");
         
         for(int i = 0; i <arr.length; i++)
         {
        	 System.out.println(arr[i] + " ");
         }
         
         sc.close();
	}
}
