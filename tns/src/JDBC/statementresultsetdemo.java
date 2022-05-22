package JDBC;

import java.sql.DriverManager;

public class statementresultsetdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				//DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver);
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
