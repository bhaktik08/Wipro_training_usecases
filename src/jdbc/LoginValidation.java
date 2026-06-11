package jdbc;

import java.sql.*;
import java.util.Scanner;

public class LoginValidation {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        try {

	            Class.forName("com.mysql.cj.jdbc.Driver");

	            Connection con = DriverManager.getConnection(
	                    "jdbc:mysql://localhost:3307/salary_audit",
	                    "root",
	                    "Bhakti$1683");

	            System.out.println("Enter Username:");
	            String username = sc.next();

	            System.out.println("Enter Password:");
	            String password = sc.next();

	            String query =
	                    "select * from login where username=? and password=?";

	            PreparedStatement ps = con.prepareStatement(query);

	            ps.setString(1, username);
	            ps.setString(2, password);

	            ResultSet rs = ps.executeQuery();

	            if(rs.next()) {

	                System.out.println("Login Successful");

	            } else {

	                System.out.println("Invalid Username or Password");
	            }

	            con.close();

	        } catch(Exception e) {

	            System.out.println(e);
	        }
	    }

}
