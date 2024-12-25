package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateTable {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/pes","root","PFH#23kgrw9");
			System.out.println("connection established");
			String query = "CREATE TABLE faculty (fid int primary key, name varchar(100), experience double);";
			PreparedStatement st =  con.prepareStatement(query);
			int result = st.executeUpdate();
			System.out.println("result is: "+result);
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
