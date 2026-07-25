package p1;

public interface PayFees {
	
      void payonline();
      
      default void payoffline()
      {
    	  System.out.println("Cant't do offline payment so doing online payment");
    	  payonline();
      }
}
