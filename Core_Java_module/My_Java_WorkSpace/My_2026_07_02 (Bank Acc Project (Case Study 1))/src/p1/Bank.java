package p1;

public class Bank {
	String accHolder;
    int accNo;
    String ifsc;
    String address;
    double currentBalance;
    String branch;
    double income;
    int cibilScore;
    
	public Bank(String accHolder, int accNo, String ifsc, String address, double currentBalance, String branch,
			double income, int cibilScore) {
		super();
		this.accHolder = accHolder;
		this.accNo = accNo;
		this.ifsc = ifsc;
		this.address = address;
		this.currentBalance = currentBalance;
		this.branch = branch;
		this.income = income;
		this.cibilScore = cibilScore;
	}

	public String getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public int getCibilScore() {
		return cibilScore;
	}

	public void setCibilScore(int cibilScore) {
		this.cibilScore = cibilScore;
	}

	@Override
	public String toString() {
		return "Bank [accHolder=" + accHolder + ", accNo=" + accNo + ", ifsc=" + ifsc + ", address=" + address
				+ ", currentBalance=" + currentBalance + ", branch=" + branch + ", income=" + income + ", cibilScore="
				+ cibilScore + "]";
	}
    
    
}
