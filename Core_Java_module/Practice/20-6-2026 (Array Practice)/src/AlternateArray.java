import java.util.Scanner;

public class AlternateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Enter Size of Array:");
         int size = sc.nextInt();
         
         int arr[] = new int[size];
         
         System.out.println("Enter the Elements of Array:");
         for(int i = 0;i < arr.length;i++)
         {
        	 arr[i] = sc.nextInt();
         }
         
         System.out.println("Alternate Elements:");
         
         for(int i = 0; i < arr.length; i = i + 2)
         {
        	 System.out.println(arr[i]);
         }
         sc.close();
	}

}
