package p1;

class Worker implements Runnable
{
	public void run() {
	String numbers = "6565574522659959745151621656595";
    
    for(int i = 0;i < numbers.length();i++)
    {
    	System.out.print(" "+numbers.charAt(i));
    	try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}
}
public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Ajj ka code hai");
		Worker w1 = new Worker();
		Thread t1 = new Thread(w1);
		t1.start();
        String alphabates = "aassjdsjdknfndfjnjnfhujirjeodmkencjdnf";
        
        for(int i = 0;i < alphabates.length();i++)
        {
        	System.out.print(" "+alphabates.charAt(i));
        	
        	try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }

	}

	}


