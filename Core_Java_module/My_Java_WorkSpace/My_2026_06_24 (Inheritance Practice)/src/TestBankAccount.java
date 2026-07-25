class BankAccount
{
	int account_number;
	String holder_name;
	double balance;
	
	public BankAccount() {
		super();
		this.account_number = 12288;
		this.holder_name = "Siddhesh Bhujbal";
		this.balance = 89000000;
	}
	
	public BankAccount(int account_number, String holder_name, double balance) {
		super();
		this.account_number = account_number;
		this.holder_name = holder_name;
		this.balance = balance;
	}

	public int getAccount_number() {
		return account_number;
	}

	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}

	public String getHolder_name() {
		return holder_name;
	}

	public void setHolder_name(String holder_name) {
		this.holder_name = holder_name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	void display() 
	{
		System.out.println("Account Number:"+this.account_number);
		System.out.println("Holder Name:"+this.holder_name);
		System.out.println("Balance:"+this.balance);
	}
	
	
}//bankAccount class ends here

class SavingsAccount extends BankAccount
{
	double interest_rate;
	double minimum_balance;
	
	public SavingsAccount() {
		super();
		this.interest_rate = 9;
		this.minimum_balance = 4000;
	}
	
	public SavingsAccount(int account_number, String holder_name, double balance,double interest_rate, double minimum_balance) {
		super(account_number,holder_name,balance);
		this.interest_rate = interest_rate;
		this.minimum_balance = minimum_balance;
	}

	public double getInterest_rate() {
		return interest_rate;
	}

	public void setInterest_rate(double interest_rate) {
		this.interest_rate = interest_rate;
	}

	public double getMinimum_balance() {
		return minimum_balance;
	}

	public void setMinimum_balance(double minimum_balance) {
		this.minimum_balance = minimum_balance;
	}
	
	void display()
	{
		super.display();
		System.out.println("Interest Rate:"+this.interest_rate);
		System.out.println("Minimum Balance:"+this.minimum_balance);
		System.out.println();
	}
}//SavingAccount class ends here

class CurrentAccount extends BankAccount
{
	int overdraft_limit;
	double transaction_limit;
	
	public CurrentAccount() {
		super();
		this.overdraft_limit = 1200000;
		this.transaction_limit = 30000;
	}
	
	public CurrentAccount(int account_number, String holder_name, double balance,int overdraft_limit, double transaction_limit) {
		super(account_number,holder_name,balance);
		this.overdraft_limit = overdraft_limit;
		this.transaction_limit = transaction_limit;
	}

	public int getOverdraft_limit() {
		return overdraft_limit;
	}

	public void setOverdraft_limit(int overdraft_limit) {
		this.overdraft_limit = overdraft_limit;
	}

	public double getTransaction_limit() {
		return transaction_limit;
	}

	public void setTransaction_limit(double transaction_limit) {
		this.transaction_limit = transaction_limit;
	}
	
	void display() {
		super.display();
		System.out.println("Over Draft Limit:"+this.overdraft_limit);
		System.out.println("Transaction Limit:"+this.transaction_limit);
		System.out.println();
	}
}//CurrentAccount class ends here

class FixedDepositAccount extends BankAccount
{
	double deposit_period;
	double maturity_amount;
	
	public FixedDepositAccount() {
		super();
		this.deposit_period = 5;
		this.maturity_amount = 85000;
	}
	
	public FixedDepositAccount(int account_number, String holder_name, double balance,double deposit_period, double maturity_amount) {
		super(account_number,holder_name,balance);
		this.deposit_period = deposit_period;
		this.maturity_amount = maturity_amount;
	}

	public double getDeposit_period() {
		return deposit_period;
	}

	public void setDeposit_period(double deposit_period) {
		this.deposit_period = deposit_period;
	}

	public double getMaturity_amount() {
		return maturity_amount;
	}

	public void setMaturity_amount(double maturity_amount) {
		this.maturity_amount = maturity_amount;
	}
	
	void display()
	{
		super.display();
		System.out.println("Deposit Period:"+this.deposit_period);
		System.out.println("Maturity Amount:"+this.maturity_amount);
		System.out.println();
	}
}
public class TestBankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BankAccount ba1 = new BankAccount();
        ba1.display();
        BankAccount ba2 = new BankAccount(4555,"hari om",85000);
        ba2.display();
        
        SavingsAccount sa1 = new SavingsAccount();
        sa1.display();
        SavingsAccount sa2 = new SavingsAccount(233,"Jai",7800,9,5000);
        sa2.display();
        
        CurrentAccount ca1 = new CurrentAccount();
        ca1.display();
        CurrentAccount ca2 = new CurrentAccount(4333,"Rohan",41000,5,30000);
        ca2.display();
        
        FixedDepositAccount fda1 = new FixedDepositAccount();
        fda1.display();
        FixedDepositAccount fda2 = new FixedDepositAccount(7800,"Siddhesh",5100000,9,12000);
        fda2.display();
	}

}
