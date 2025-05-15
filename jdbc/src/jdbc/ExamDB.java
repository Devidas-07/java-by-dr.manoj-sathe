package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExamDB {

	public static void main(String[] args) {
		Connection con;
		PreparedStatement ps;
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Exam","root","PFH#23kgrw9");
			System.out.println("connection successfully");
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
