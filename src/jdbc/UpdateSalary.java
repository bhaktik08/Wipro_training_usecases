package jdbc;
import java.sql.*;

public class UpdateSalary {
	  public static void main(String[] args) {

	        try {

	            Class.forName("com.mysql.cj.jdbc.Driver");

	            Connection con = DriverManager.getConnection(
	                    "jdbc:mysql://localhost:3307/salary_audit",
	                    "root",
	                    "Bhakti$1683");

	            String query =
	                    "update employees set salary = ? where emp_id = ?";

	            PreparedStatement ps = con.prepareStatement(query);

	            ps.setDouble(1, 80000);
	            ps.setInt(2, 103);

	            int rows = ps.executeUpdate();

	            System.out.println(rows + " row updated");

	            con.close();

	        } catch(Exception e) {

	            System.out.println(e);
	        }
	    }

}
