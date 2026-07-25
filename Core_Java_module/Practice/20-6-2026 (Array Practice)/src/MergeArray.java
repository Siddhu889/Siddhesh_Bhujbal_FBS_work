import java.util.Scanner;

public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Enter Size Of Array:");
         int size = sc.nextInt();
         
         int arr[] = new int[size];
         
         System.out.println("Enter the Elements Of First Array:");
         for(int i = 0;i < arr.length;i++)
         {
        	 arr[i] = sc.nextInt();
         }
         
         int brr[] = new int[size];
         
         System.out.println("Enter the Elements Of Second Array:");
         for(int i = 0;i < brr.length;i++)
         {
        	 brr[i] = sc.nextInt();
         }
         
         System.out.println("Merged Arrya:");
         
         for(int i = 0;i < size; i++)
         {
        	 System.out.println(" "+ arr[i]);
         }
         
         for(int i  = 0; i < size; i++)
         {
        	 System.out.println(" "+brr[i]);
         }
         
         sc.close();
	}

}
