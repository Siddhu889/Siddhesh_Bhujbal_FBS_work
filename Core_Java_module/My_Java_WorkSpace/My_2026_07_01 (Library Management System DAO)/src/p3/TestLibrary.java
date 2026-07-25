package p3;

import java.util.Scanner;
import p1.*;
import p2.LibraryDAO;

public class TestLibrary {
     public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LibraryDAO dao = new LibraryDAO();
		
		int choice;
		do {
			System.out.println("\n----------------------Library Management Menu-----------------------");
			System.out.println("1. Add Book");
			System.out.println("2. Search Book");
			System.out.println("3. Update Book");
			System.out.println("4. Delete Book");
			System.out.println("5. Display All Books");
			System.out.println("6. Total Count Of Books");
			System.out.println("0. Exit");
			System.out.println("Enter you choice: ");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter Book Details (1.Magazine, 2.Novel, 3.TextBook):");
				int booktype = sc.nextInt();
				
				System.out.println("Enter ID:");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Title:");
				String title = sc.nextLine();
				System.out.println("Enter Price");
				double price = sc.nextDouble();
				
				switch(booktype)
				{
				case 1:
					System.out.println("Enter the Issue No:");
					int issue_no = sc.nextInt();
					dao.addBook(new Magazine(id,title,price,issue_no));
					System.out.println("Magazine added successfully");
					break;
					
				case 2:
					System.out.println("Enter the Author Name:");
					String author = sc.nextLine();
					dao.addBook(new Novel(id,title,price,author));
					System.out.println("Novel added successfully");
					break;
					
				case 3:
					sc.nextLine();
					System.out.println("Enter the Subject Name:");
					String subject = sc.nextLine();
					dao.addBook(new TextBook(id,title,price,subject));
					System.out.println("TextBook added successfully");
					break;
					
					default:
						System.out.println("Invalid choice!");
				}
				break;
				
			case 2:
				System.out.println("Enter ID to Search:");
				id = sc.nextInt();
				Book book = dao.getBookById(id);
				if(book != null)
				{
					System.out.println("Book Found\n"+book);
				}
				else
					System.out.println("Book Not Found");
				break;
				
			case 3:
				System.out.println("Enter ID to update:");
				id = sc.nextInt();
				int idx = dao.searchBookById(id);
				if(idx != -1)
				{
					System.out.println("Enter new price:");
					price = sc.nextDouble();
					dao.updateBookPrice(id, price);
					System.out.println("Price Updates Successfully");
				}
				else
				{
					System.out.println("Book Not Found");
				}
				break;
				
			case 4:
				System.out.println("Enter ID to Delete");
				id = sc.nextInt();
				if(dao.deletebook(id))
					System.out.println("Book Deleted");
				else 
					System.out.println("Book Not Found");
				break;
				
			case 5:
				dao.displayAllBook();
				break;
				
			case 6:
				for(int i = 0;i < LibraryDAO.getBookcount();i++)
				{
					System.out.println(LibraryDAO.getbookArr()[i].getId()+" :: Total Price:"+LibraryDAO.getbookArr());
				}
				break;
				
			default:
				System.out.println("Invalid Choice!");
			}
		}while(choice != 0);
		sc.close();
     }
}
		
	

