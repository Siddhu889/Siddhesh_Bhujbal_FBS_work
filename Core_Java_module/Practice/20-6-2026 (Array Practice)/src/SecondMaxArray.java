import java.util.Scanner;

public class SecondMaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Array");
        int size = sc.nextInt();
        
        int arr[] = new int[size];
        
        System.out.println("Enter the Elements Of Array:");
        for(int i = 0; i < arr.length; i++)
        {
        	arr[i] = sc.nextInt();
        }
        

        int max = arr[0];
        int secondMax = arr[0];
        
     // Find Maximum
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        // Find Second Maximum
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > secondMax && arr[i] < max) {
                secondMax = arr[i];
            }
        }

        System.out.println("Second Maximum Element = " + secondMax);
        sc.close();

    }
}