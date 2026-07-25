package model;

//import model.Book;

public class TextBook extends Book {
	
       private String subject;

	   public TextBook(int id, String title, double price, String subject) {
		super(id, title, price);
		this.subject = subject;
	   }

	   public String getSubject() {
		   return subject;
	   }

	   public void setSubject(String subject) {
		   this.subject = subject;
	   }

	   @Override
	   public String toString() {
		return "TextBook [subject=" + subject + "]";
	   }
       
       
}
