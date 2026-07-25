
class Worker implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
	    String numbers = "01234567859685741663210";
	    for(int i = 0; i < numbers.length();i++)
	    		{
	    		System.out.println(" "+numbers.charAt(i));
	    		try
	    		{
	    			Thread.sleep(500);
	    		}
	    		catch(InterruptedException e)
	    		{
	    			e.printStackTrace();
	    		}
	     }
	}
}//Worker class ends here

public class TestThread {
      public static void main(String[] args) {
		Worker w1 = new Worker();
		Thread t1 = new Thread(w1);
		t1.start();
		String alphabet = "abcdefghijklmnopqrstwvxyz";
		for(int i = 0;i < alphabet.length();i++)
		{
			System.out.println(" "+alphabet.charAt(i));
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}//TestThread class ends here
