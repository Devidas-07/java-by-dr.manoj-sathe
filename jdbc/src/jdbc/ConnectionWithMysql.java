package jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionWithMysql {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement stm=null;
		String query = "DELETE FROM tmc WHERE name=?";
		
		try {
			 con = DriverManager.getConnection("jdbc:mysql://localhost/mibs","root","PFH#23kgrw9");
			 System.out.println("Connection successfully");
			 
			stm=  con.prepareStatement(query);
			stm.setString(1, "ravi");
			int result = stm.executeUpdate();
			if(result>0) {
				System.out.println("record deleted successfully");
			}
			else {
				System.out.println("record not deleted");
			}
			System.out.println("result is: "+result);
			
		}
		catch (SQLException e){
			System.out.println(e.getMessage());
		}
		finally {
			try {
				con.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}

}
