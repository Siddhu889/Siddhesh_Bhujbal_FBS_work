class Calculator{
	void add(int a, int b){
		System.out.println("Result is : "+(a+b));
		System.out.println("void add(int a, int b)");
	}

	void add(int a, double b){
		System.out.println("Result is : "+(a+b));
		System.out.println("void add(int a, double b)");
	}

	void add(double a, int b){
		System.out.println("Result is : "+(a+b));
		System.out.println("void add(double a, int b)");
	}

	void add(double a, double b){
		System.out.println("Result is : "+(a+b));
		System.out.println("void add(double a, double b)");
	}
	void subtract(int a, int b){
		System.out.println("Result is : "+(a-b));
		System.out.println("void subtract(int a, int b)");
	}

	void subtract(int a, double b){
		System.out.println("Result is : "+(a-b));
		System.out.println("void subtract(int a, double b)");
	}

	void subtract(double a, int b){
		System.out.println("Result is : "+(a-b));
		System.out.println("void subtract(double a, int b)");
	}

	void subtract(double a, double b){
		System.out.println("Result is : "+(a-b));
		System.out.println("void subtract(double a, double b)");
	}
	void multiply(int a, int b){
		System.out.println("Result is : "+(a*b));
		System.out.println("void multiply(int a, int b)");
	}

	void multiply(int a, double b){
		System.out.println("Result is : "+(a*b));
		System.out.println("void multiply(int a, double b)");
	}

	void multiply(double a, int b){
		System.out.println("Result is : "+(a*b));
		System.out.println("void multiply(double a, int b)");
	}

	void multiply(double a, double b){
		System.out.println("Result is : "+(a*b));
		System.out.println("void multiply(double a, double b)");
	}
	void divide(int a, int b){
		System.out.println("Result is : "+(a/b));
		System.out.println("void divide(int a, int b)");
	}

	void divide(int a, double b){
		System.out.println("Result is : "+(a/b));
		System.out.println("void divide(int a, double b)");
	}

	void divide(double a, int b){
		System.out.println("Result is : "+(a/b));
		System.out.println("void divide(double a, int b)");
	}

	void divide(double a, double b){
		System.out.println("Result is : "+(a/b));
		System.out.println("void divide(double a, double b)");
	}
} //class Calculator ends here


public class TestCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Calculator c1  = new Calculator();
         c1.add(10.12,58);
         c1.subtract(78.1,98);
         c1.multiply(5, 2);
         c1.divide(10,20.2);
	}//main ends here

}//TestCalculator ends here
