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
}

public class TestBankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BankAccount b1 = new BankAccount();
	        b1.setAccNo(125599);
	        b1.setHoldername("Siddhesh");
	        b1.setBranch("Arvi");
	        b1.setBalance(50000);
    }//main ends here

}//class TestBank Account ends here