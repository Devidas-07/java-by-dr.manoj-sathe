package cce3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Question1 {

	public static void main(String[] args) {
		Connection con= null;
		PreparedStatement ps = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/cce","root", "PFH#23kgrw9");
			System.out.println("connnection got successfully");
			
			String query = "CREATE TABLE employee (empId int primary key, empName varchar(100), empCity varchar(100), mobileNo varchar(10), aadharNo varchar(12),email varchar(50));";
			
			 ps = con.prepareStatement(query);
			 
			int result = ps.executeUpdate();
			System.out.println("result of querry is: "+result);

					
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
