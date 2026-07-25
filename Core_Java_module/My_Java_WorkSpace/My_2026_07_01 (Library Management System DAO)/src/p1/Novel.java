package p1;

public class Novel extends Book {

	private String author;

	public Novel(int id, String title, double price, String author) {
		super(id, title, price);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Novel [author=" + author + "]";
	}
	
}
