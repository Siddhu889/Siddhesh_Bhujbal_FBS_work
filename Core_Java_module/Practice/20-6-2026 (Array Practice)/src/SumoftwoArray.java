import java.util.Scanner;

public class SumoftwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Array:");
        int size = sc.nextInt();
        
        int arr[] = new int[size];
        
        System.out.println("Enter Elements of First Array:");
        for(int i = 0;i < arr.length;i++)
        {
        	arr[i] = sc.nextInt();
        }
        
        int brr[] = new int[size];
        
        System.out.println("Enter Elements Of Second Array:");
        
        for(int i = 0; i < brr.length;i++)
        {
        	brr[i] = sc.nextInt();
        }
        
        int crr[] = new int[size];
        
        for(int i = 0; i < size; i++)
        {
        	crr[i] = arr[i] + brr[i];
        }
        
        System.out.println("Sum of Arrays:");
        
        for(int i = 0; i < crr.length; i++)
        {
        	System.out.println(crr[i] +" ");
        }
        	
        sc.close();
	}

}
