package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Step1: Load the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//protocol:subprotocol:DB-specific information
			//jdbc:oracle:
			try {
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment1","root","Pass@123");
				String query="select * from jobs";
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery(query);
				while(rs.next())
				{
					System.out.println(rs.getString(1) + " "+rs.getString(2));
				}
				//System.out.println(rs.getString(1));
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
