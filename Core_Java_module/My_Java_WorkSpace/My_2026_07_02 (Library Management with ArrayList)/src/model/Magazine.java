package model;

//import model.Book;

public class Magazine extends Book{
        
	private int issue_no;

	public Magazine(int id, String title, double price, int issue_no) {
		super(id, title, price);
		this.issue_no = issue_no;
	}

	public int getIssue_no() {
		return issue_no;
	}

	public void setIssue_no(int issue_no) {
		this.issue_no = issue_no;
	}

	@Override
	public String toString() {
		return "Magazine [issue_no=" + issue_no + "]";
	}
	
}
