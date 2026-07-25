
class Book
{
	int isbn;
	String title,author,publisher;
	double price;
	
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	void display() {
		System.out.println("ISBN NO:"+this.isbn);
		System.out.println("Title:"+this.title);
		System.out.println("Author:"+this.author);
		System.out.println("Publisher:"+this.publisher);
		System.out.println("Price:"+this.price);
	}
	
	public Book(int isbn, String title, String author, String publisher, double price) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}
	
	public Book() {
		this.isbn = 85200;
		this.title = "Water Story";
		this.author = "Henry rich";
		this.publisher = "Techneo";
		this.price = 89000;
	}
	
}

public class TestBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Book b1 = new Book();
    b1.display();
    
	System.out.println();
	
	Book b2 = new Book(87777,"Harry Potter","Richard","Unknown",9000);
	b2.display();
	
	}//main ends here

}//Test Book ends here


