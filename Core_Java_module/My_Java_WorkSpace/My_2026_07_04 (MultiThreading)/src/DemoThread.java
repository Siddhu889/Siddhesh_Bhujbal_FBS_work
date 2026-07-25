//import java.util.Iterator;

class Worker extends Thread
{
	@Override
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
public class DemoThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Worker w1 = new Worker();
		
		w1.start();
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
