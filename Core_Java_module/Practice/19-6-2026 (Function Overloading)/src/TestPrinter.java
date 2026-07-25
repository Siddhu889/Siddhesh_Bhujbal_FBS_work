class Printer{
	void print(char c){
		System.out.println(c);
		System.out.println("void print(char c)");
	}
	
	void print(int i){
		System.out.println(i);
		System.out.println("void print(int i)");
	}

	void print(String s){
		System.out.println(s);
		System.out.println("void print(String s)");
	}
} //class Printer ends here


public class TestPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Printer p1 = new Printer();
           p1.print("a");
           p1.print(101);
           p1.print("Firstbit");
           p1.print("Word");
	}//main ends here

}//class TestPrinter ends here
