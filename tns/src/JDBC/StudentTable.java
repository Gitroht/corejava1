package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StudentTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/b3tns","root","rohit");
	 Statement st=con.createStatement();
	 String s= " create  table student (studentId int primary key, studentName varchar(45),studentMarks int )";
	 int i= st.executeUpdate(s);
	 boolean t= st.execute(" create table student1 (studentId int primary key, studentName varchar(45),studentMarks int)");
	 System.out.println("No of rows affected:"+i);
	 System.out.println("Query executed"+t);
	 System.out.println("table created successfully");
	 st.close();
	 con.close();
	 
}
catch(Exception e){
	e.printStackTrace();
	
}
	}

}
