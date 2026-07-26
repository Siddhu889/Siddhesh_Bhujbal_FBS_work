package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VerifyUser {

	public boolean isValid(String v1, String v2) 
		// TODO Auto-generated method stub
		//JDBC code
		{
			Connectivity ref=new FileConnectivity();
			return ref.checkUser(v1, v2);
//			boolean validity= ref.checkUser(v1, v2);
//			if(validity==true)
//			{
//				You are a valid user;
//			}
		}
	}


