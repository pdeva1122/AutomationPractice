package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.testng.annotations.Test;

public class Connect {


		@Test
		
		public void testDB() throws ClassNotFoundException, SQLException
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Pras","root","Auto@123");
			System.out.println("Connected DB");
			
		}
		

	}