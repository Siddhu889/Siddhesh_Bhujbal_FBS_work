import java.util.Scanner;

public class OddEvenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc = new Scanner(System.in);
          
          System.out.println("Enter Size Of Array:");
          int size = sc.nextInt();
          
          int arr[] = new int[size];
          
          System.out.println("Enter the Elements Of Array:");
          for(int i = 0;i < arr.length;i++)
          {
        	  arr[i] = sc.nextInt();
          }
          
          int odd = 0;
          int even = 0;
          
          for(int i = 0;i < arr.length;i++)
          {
        	  if(arr[i] % 2 == 0)
        	  {
        		  even++;
        	  }
        	  
        	  if(arr[i] % 2 != 0)
        	  {
        		  odd++;
        	  }
          }
          System.out.println("Even Numbers:"+even);
          System.out.println("Odd Numbers:"+odd);
          
          sc.close();
	}

}
