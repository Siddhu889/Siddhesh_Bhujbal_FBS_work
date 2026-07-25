public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str1 = "Hello";
         String str2 = new String("Hello");
         String str3 = "Hello";
         System.out.println(str1 == str3);  //true
         System.out.println(str1 == str2);  //false
         System.out.println(str1.equals(str2));//true    
	}

}
