import java.util.Scanner;

public class MinMaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Size of Array");
        int size = sc.nextInt();
        
        int arr[] = new int[size];
        
        System.out.println("Enter Array Elements:");
        
        for(int i = 0; i < arr.length;i++)
        {
        	arr[i] = sc.nextInt();
        }
        
        int min = arr[0];
        int max = arr[0];
        
        for(int i = 1; i < arr.length; i++)
        {
        	if(arr[i] < min)
        	{
        		min = arr[i];
        	}
        	
        	if(arr[i] > max)
        	{
        		max = arr[i];
        	}
        }
        System.out.println("Minimum Number ="+min);
        System.out.println("Maximum Number ="+max);
        
        sc.close();
	}
}
