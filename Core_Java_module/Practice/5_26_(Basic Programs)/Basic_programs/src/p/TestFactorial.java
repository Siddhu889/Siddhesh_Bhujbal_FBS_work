package p;

class TestFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n = 4,fact = 1;
        while(n>0) {
        	 fact = fact*n;
        	 n--;
        }
        System.out.println("Factorial is:"+fact);
	}//main ends here

}//class TestFactorial ends here
