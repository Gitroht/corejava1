package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class Statementdemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
    Class.forName("com.mysql.cj.jdbc.Driver");
    //Connection ccn= DriverManager.getConnection("jdbc:mysql://localhost:3306/b3tns","root","rohit");
    String url="jdbc:mysql://localhost:3306/b3tns";
    Properties p= new Properties();
    p.put("user","root");
    p.put("password","rohit");
    Connection con= DriverManager.getConnection(url,p);
    Statement st= con.createStatement();
    String query1="create table employee (employeeId int primary key,employeeName varchar(20), employeeSalary double)";
    int i=st.executeUpdate(query1);
    System.out.println("No of rows affected:"+i);
    System.out.println("Table created successfully");
    st.close();
    con.close();
	}

}
