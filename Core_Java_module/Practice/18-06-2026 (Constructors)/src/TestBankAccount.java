class BankAccount
{
	int accNo;
	String holdername,branch;
	double balance;
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getHoldername() {
		return holdername;
	}
	public void setHoldername(String holdername) {
		this.holdername = holdername;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	void display()
	{
		System.out.println("Account No:"+this.accNo);
		System.out.println("Accoount Holder Name:"+this.holdername);
		System.out.println("Branch:"+this.branch);
		System.out.println("Balance:"+this.balance);
	}
	
	public BankAccount(int accNo, String holdername, String branch, double balance) {
		super();
		this.accNo = accNo;
		this.holdername = holdername;
		this.branch = branch;
		this.balance = balance;
	}
	
	public BankAccount() {
		super();
		this.accNo = 855;
		this.holdername = "Siddhesh Bhujbal";
		this.branch = "Pune";
		this.balance = 89000;
	}
	
}

public class TestBankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    BankAccount ba1 = new BankAccount();
    ba1.display();
    
    System.out.println();
    
    BankAccount ba2 = new BankAccount(996,"Rohan","Mumbai",90000);
    ba2.display();
	}//main ends here

}//class ends here
