package p;

public class TestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n = 58755, rev=0, temp=n;
    
    while(temp>0) {
    	int digit=temp%10;
    	rev=rev*10 + digit;
    	temp=temp/10;
    }
    
    if(n==rev) System.out.println(n+"is a PALINDROME Number");
    else System.out.println(n+"is NOT a PALINDROME Number");
	}//main ends here

}//Class TestPalindrome ends here
