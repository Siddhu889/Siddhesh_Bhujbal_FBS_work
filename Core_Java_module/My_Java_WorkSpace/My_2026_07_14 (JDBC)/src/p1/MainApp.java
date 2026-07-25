package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Step1: Load the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//protocol:subprotocol:DB-specific information
			//jdbc:oracle:
			
			int employee_id;
			String first_name,salary;
			Scanner sc = new Scanner(System.in);
			employee_id=sc.nextInt();
			sc.nextLine();
			first_name=sc.nextLine();
			salary=sc.nextLine();
			sc.close();
			
			
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment1","root","Pass@123");
				String query="insert into employees(employee_id,first_name,salary) values (?,?,?)";
				PreparedStatement pstmt = con.prepareStatement(query);
				pstmt.setInt(1, employee_id);
				pstmt.setString(2,  first_name);
				pstmt.setString(3,  salary);
				
				int rowCount=pstmt.executeUpdate();
				System.out.println(rowCount+" Rows Updated");
				con.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
