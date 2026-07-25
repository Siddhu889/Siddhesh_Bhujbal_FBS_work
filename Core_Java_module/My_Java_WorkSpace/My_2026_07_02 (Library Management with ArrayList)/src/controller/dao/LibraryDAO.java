package controller.dao;

import java.util.ArrayList;

import model.*;

public class LibraryDAO {
        private static ArrayList<Book> bookArr = new ArrayList<Book>();
        
        static
        {
        	bookArr.add(new Magazine(101,"Water stroies",200,45222));
        	bookArr.add(new Magazine(102,"Harry Potter",200,654111));
        	bookArr.add(new Magazine(103,"Queen Victoriya",500,75244));
        	
        	bookArr.add(new Novel(501,"True Stroies",6400,"Richard"));
        	bookArr.add(new Novel(602,"Rail",6400,"Henry"));
        	bookArr.add(new Novel(601,"Poor Employee",6400,"Om"));
        	
        	bookArr.add(new TextBook(901,"Science-fiction",450,"Science"));
        	bookArr.add(new TextBook(906,"Calculations",650,"Math"));
        	bookArr.add(new TextBook(902,"Political Science",750,"Social Science"));
        	bookArr.add(new TextBook(907,"Information Technology",788,"Computer Science"));
        }

		public static ArrayList<Book> getBookArr() {
			return bookArr;
		}
        
		public int getBookCount()
		{
			return bookArr.size();
		}
		
        public boolean addbook(Book b)
        {
        	bookArr.add(b);
        	return true;
        }
        
        public void displayAllBooks()
        {
        	System.out.println(bookArr);
        }
        
        public Book searchBookById(int id)
        {
        	for(Book book:bookArr)
        	{
        		if(book.getId() == id)
        			return book;
        	}
        	return null;
        }
        
        public boolean updateBookById(int id,double price)
        {
        	Book book = searchBookById(id);
        	if(book != null)
        	{
        		book.setPrice(price);
                return true;
        	}
        	return false;
        }
        
        public boolean deleteBookById(int id)
        {
        	Book book = searchBookById(id);
        	if(book != null)
        	{
        		bookArr.remove(book);
        		return true;
        	}
        	return false;
        }
      }


