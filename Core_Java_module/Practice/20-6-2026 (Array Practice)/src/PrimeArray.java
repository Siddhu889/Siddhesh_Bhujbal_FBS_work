import java.util.Scanner;

public class PrimeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Enter Size of Array:");
         int size = sc.nextInt();
         
         int arr[] = new int[size];
         
         System.out.println("Enter Elements of Array:");
         for(int i = 0; i < arr.length; i++)
         {
        	 arr[i] = sc.nextInt();
         }
         
         int prime  = 0;
         
         for(int i = 0; i < arr.length; i++)
         {
        	 int count = 0;
        	 
        	 for(int j = 1; j <= arr[i]; j++)
        	 {
        		 if(arr[i] % j == 0)
        		 {
        			 count++;
        		 }
        	 }
        	 if(count == 2)
        	 {
        		 prime++;
        	 }
         }
         System.out.println("Prime Numbers:"+prime);
         sc.close();
	}

}
