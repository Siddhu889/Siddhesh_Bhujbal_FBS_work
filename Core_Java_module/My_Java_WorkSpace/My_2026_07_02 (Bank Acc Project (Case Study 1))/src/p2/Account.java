package p2;

public abstract class Account {
       private int accountNumber;
       private String customerName;
       protected double balance;
       
	   public Account(int accountNumber, String customerName, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.balance = balance;
	   }

	   public int getAccountNumber() {
		   return accountNumber;
	   }

	   public void setAccountNumber(int accountNumber) {
		   this.accountNumber = accountNumber;
	   }

	   public String getCustomerName() {
		   return customerName;
	   }

	   public void setCustomerName(String customerName) {
		   this.customerName = customerName;
	   }

	   public double getBalance() {
		   return balance;
	   }

	   public void setBalance(double balance) {
		   this.balance = balance;
	   }

	   @Override
	   public String toString() {
		return "Account [accountNumber=" + accountNumber + ", customerName=" + customerName + ", balance=" + balance
				+ "]";
	   }
       
	   public void deposit(double amount)
	   {
		   if(amount <= 0)
		   {
			   System.out.println("Invalid deposit amount.");
			   return;
		   }
		   balance += amount;
		   
		   System.out.println("Rs."+amount+"Deposited Successfully.");
		   System.out.println("Current Balance: Rs."+balance);
	   }
	   
	   public abstract void withdraw(double amount);
	   
	   public abstract void calculateInterest();
	   
	   public void displayAccountdetails()
	   {
		   System.out.println("\n Account Number:"+accountNumber);
		   System.out.println("Customer Name:"+customerName);
		   System.out.println("Balance:"+balance);
	   }
       
}
