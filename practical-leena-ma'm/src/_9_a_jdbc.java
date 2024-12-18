import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class _9_a_jdbc {

	public static void main(String[] args) throws SQLException{
		
		
		Connection con;
		PreparedStatement pstmt;
		String url="jdbc:mysql://localhost/practical";
		String root = "root";
		String pass = "PFH#23kgrw9";
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter customer id");
		int cid=s.nextInt();
		
		System.out.println("enter customer name");
		String name=s.nextLine();
		
		System.out.println("enter address");
		String address = s.nextLine();
		
		System.out.println("enter phone no");
		String phone= s.nextLine();
	
		
		String query= "INSERT INTO customer VALUES (?,?,?,?)";
		
		try {
			con=DriverManager.getConnection(url,root,pass);
			System.out.println("connection successfully");
			
			pstmt = con.prepareStatement(query);
			
			pstmt.setInt(1, cid);
			pstmt.setString(2, name);
			pstmt.setString(3, address);
			pstmt.setString(4, phone);
			
			int result =pstmt.executeUpdate();
			System.out.println(result);
			if(result>0) {
				System.out.println("record stored successfully");
			}
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
