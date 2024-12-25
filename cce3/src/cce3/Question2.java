package cce3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/cce","root","PFH#23kgrw9");
			String insertQuery = "INSERT INTO employee VALUES (?,?,?,?,?,?);";
			PreparedStatement ps = con.prepareStatement(insertQuery);
			while(true) {
				
				System.out.println("enter id");
				int id =sc.nextInt();
				sc.nextLine();
				System.out.println("enter name");
				String name = sc.nextLine();
				
				System.out.println("enter city");
				String city = sc.nextLine();
				
				System.out.println("enter mobile no");
				String mobile = sc.nextLine();
				
				System.out.println("enter aadhar no");
				String aadhar= sc.nextLine();
				
				System.out.println("enter email");
				String email = sc.nextLine();
				
				ps.setInt(1, id);
				ps.setString(2, name);
				ps.setString(3, city);
				ps.setString(4, mobile);
				ps.setString(5, aadhar);
				ps.setString(6, email);
				
				int result =ps.executeUpdate();
				System.out.println(" result is: "+result);
				
				System.out.println("you want to add more data? y/n");
				
				String choice = sc.nextLine();
				
				if(choice.equals("n")) {
					System.out.println("Thank you");
					return;
				}
				
			}
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		finally {
			sc.close();
		}
	}

}
