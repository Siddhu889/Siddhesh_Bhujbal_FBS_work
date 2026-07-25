
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
	
}

public class TestBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book b1 = new Book();
        b1.setIsbn(188);
        b1.setTitle("Harry Potter");
        b1.setAuthor("Henry Richard");
        b1.setPublisher("Unknown");
        b1.setPrice(5600);
        b1.display();
	}//main ends here

}//Test Book ends here