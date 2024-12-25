package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertQuery {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/dr_sathe_sir", "root","PFH#23kgrw9");
			String query = "INSERT INTO product (name, price, qty) values (?,?,?)";
			
			ps = con.prepareStatement(query);
			Scanner s = new Scanner(System.in);
			System.out.println("please enter product name: ");
			String name = s.nextLine();
			ps.setString(1, name);
			System.out.println("please enter price of product");
			double price = s.nextDouble();
			ps.setDouble(2, price);
			System.out.println("please enter quantity");
			int quantity = s.nextInt();
			ps.setInt(3, quantity);
			
			int result = ps.executeUpdate();
			if(result>=1) {
			System.out.println("record inserted successfully");
			
			}
			else {
				System.out.println("record not inserted");
			}
			
			
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
