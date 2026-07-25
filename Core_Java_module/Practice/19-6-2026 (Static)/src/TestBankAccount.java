//import java.util.Scanner;

class BankAccount
{
	int accno;
	String holdername;
	double balance;
	static double intrest;
	
	public BankAccount(int accno, String holdername, double balance) {
		this.accno = accno;
		this.holdername = holdername;
		this.balance = balance;
	}
	
	public BankAccount() {
		this.accno = 8966;
		this.holdername = "Siddhesh Bhujbal";
		this.balance = 870000;
	}
	
	static
	{
		intrest = 9.8;
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getHoldername() {
		return holdername;
	}

	public void setHoldername(String holdername) {
		this.holdername = holdername;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	static void setIntrest(double i)
	{
		intrest = i;
	}
	
	static double getIntrest()
	{
		return intrest;
	}
	void display()
	{
		System.out.println("Account No:"+this.accno);
		System.out.println("Holder Name:"+this.holdername);
	    System.out.println("Balance:"+this.balance);
	    System.out.println("Intrest:"+intrest);
	}
}//class BankAccount ends here

public class TestBankAccount {
      public static void main(String[]args)
      {
    	  BankAccount ba1 = new BankAccount();
    	  ba1.display();
    	  
    	  System.out.println();
    	  
    	  BankAccount ba2 = new BankAccount(109,"Sidddhesh",87000);
    	  ba2.display();
    	  
    	  System.out.println();
    	  
    	  BankAccount ba3 = new BankAccount(701,"Rohan",20000);
    	  ba3.display();
    	  BankAccount.setIntrest(10);
    	  ba1.display();
    	  ba2.display();
    	  ba3.display();
      }
}
