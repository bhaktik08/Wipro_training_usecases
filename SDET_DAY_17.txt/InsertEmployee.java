package jdbc;
import java.sql.*;

public class InsertEmployees {
	  public static void main(String[] args) {

	        try {

	            Class.forName("com.mysql.cj.jdbc.Driver");

	            Connection con = DriverManager.getConnection(
	                    "jdbc:mysql://localhost:3307/salary_audit",
	                    "root",
	                    "Bhakti$****");

	            String query = "insert into employees values(?, ?, ?, ?)";

	            PreparedStatement ps = con.prepareStatement(query);
	            
	            ps.setInt(1, 114);
	            ps.setString(2, "Minal");
	            ps.setString(3, "HR");
	            ps.setDouble(4, 45000);
	            ps.executeUpdate();
	            
	            ps.setInt(1, 115);
	            ps.setString(2, "Revti");
	            ps.setString(3, "Finance");
	            ps.setDouble(4, 55000);
	            ps.executeUpdate();
         
	            ps.setInt(1, 116);
	            ps.setString(2, "Aman");
	            ps.setString(3, "IT");
	            ps.setDouble(4, 75000);
	            ps.executeUpdate();
	        
	            ps.setInt(1, 117);
	            ps.setString(2, "Neha");
	            ps.setString(3, "HR");
	            ps.setDouble(4, 65000);
	            ps.executeUpdate();

	            ps.setInt(1, 118);
	            ps.setString(2, "Rohit");
	            ps.setString(3, "Sales");
	            ps.setDouble(4, 50000);
	            ps.executeUpdate();

	            System.out.println("5 rows inserted");

	            con.close();

	        } catch(Exception e) {

	            System.out.println(e);
	        }
	    }
}
