package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectQuery {

	public static void main(String[] args) {
		Connection con= null;
		PreparedStatement ps= null;
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/dr_sathe_sir", "root", "PFH#23kgrw9");
			String selectQuery = "SELECT *  FROM  product";
			ps =con.prepareStatement(selectQuery);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println("column id "+rs.getInt(1));
				System.out.println("product name: "+rs.getString(2));
				System.out.println("product price is: "+rs.getDouble(3));
				System.out.println("product quantity is: "+rs.getInt(4));
				System.out.println("====================================");
			}
			
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
