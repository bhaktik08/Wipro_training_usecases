package jdbc;
import java.sql.*;

public class CountEmployees {
	 public static void main(String[] args) {

	        try {

	            Class.forName("com.mysql.cj.jdbc.Driver");

	            Connection con = DriverManager.getConnection(
	                    "jdbc:mysql://localhost:3307/salary_audit",
	                    "root",
	                    "Bhakti$1683");

	            String query =
	                    "select count(*) from employees";

	            Statement st = con.createStatement();

	            ResultSet rs = st.executeQuery(query);

	            if(rs.next()) {

	                System.out.println(
	                        "Total Employees = " + rs.getInt(1));
	            }

	            con.close();

	        } catch(Exception e) {

	            System.out.println(e);
	        }
	    }
	

}
