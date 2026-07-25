package p2;

import p1.*;

public class LibraryDAO {
         private static Book[] bookArr;
         private static int bookCount;
         
         static 
         {
        	 bookArr = new Book[20];
        	 bookCount = 0;
        	 
        	 bookArr[bookCount++] = new Magazine(101,"Water stroies",200,45222);
        	 bookArr[bookCount++] = new Magazine(102,"Harry Potter",200,654111);
        	 bookArr[bookCount++] = new Magazine(103,"Queen Victoriya",500,75244);
        	 
        	 bookArr[bookCount++] = new Novel(501,"True Stroies",6400,"Richard");
        	 bookArr[bookCount++] = new Novel(602,"Rail",6400,"Henry");
        	 bookArr[bookCount++] = new Novel(601,"Poor Employee",6400,"Om");
        	 
        	 bookArr[bookCount++] = new TextBook(901,"Science-fiction",450,"Science");
        	 bookArr[bookCount++] = new TextBook(906,"Calculations",650,"Math");
        	 bookArr[bookCount++] = new TextBook(902,"Political Science",750,"Social Science");
        	 bookArr[bookCount++] = new TextBook(907,"Information Technology",788,"Computer Science");
         }

		 public static Book[] getbookArr() {
			 return bookArr;
		 }

		 public static int getBookcount() {
			 return bookCount;
		 }
         
         public boolean addBook(Book b)
         {
        	 if(bookCount >= bookArr.length)
        	 {
        		 Book[] newArr = new Book[bookArr.length + 5];
        		 for(int i = 0;i < bookArr.length;i++)
        		 {
        			 newArr[i] = bookArr[i];
        		 }
        		 bookArr = newArr;
        	 }
        	 bookArr[bookCount++] = b;
        	 return true;
         }
         
         public void displayAllBook()
         {
        	 for(int i = 0;i < bookCount;i++)
        	 {
        		 System.out.println(bookArr[i]);
        	 }
         }
         
         public int searchBookById(int id)
         {
        	 for(int i = 0;i < bookCount;i++)
        	 {
        		 if(bookArr[i].getId() == id)
        		 {
        			 return i;
        		 }
        	 }
        	 return -1;
         }
         
         public boolean updateBookPrice(int id,double price)
         {
        	 int idx = searchBookById(id);
        	 bookArr[idx].setPrice(price);
        	 return true;
         }
         
         public boolean deletebook(int id)
         {
        	int idx = searchBookById(id);
        	if(idx != -1)
        	{
        		for(int i = 0;i < bookCount;i++)
        		{
        			bookArr[i] = bookArr[i+1];
        		}
        		bookArr[--bookCount] = null;
        		return true;
        	}
        	return false;
         }
         
         public Book getBookById(int id)
         {
        	 int idx = searchBookById(id);
        	 if(idx != -1)
        	 {
        		 return bookArr[idx];
        	 }
        	 else 
        		 return null;
         }
         
         public static int getBookCount()
         {
        	 int Count = 0;
        	 for(int i = 0;i < bookArr.length;i++)
        	 {
        		 if(bookArr[i] != null)
        		 {
        			 Count++;
        		 }
        	 }
        	 return Count;
         }
  
}
