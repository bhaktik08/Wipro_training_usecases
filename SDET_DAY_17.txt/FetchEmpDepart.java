package jdbc;
import java.sql.*;

public class FetchEmpDepart {
	 public static void main(String[] args) {

	        try {

	            Class.forName("com.mysql.cj.jdbc.Driver");

	            Connection con = DriverManager.getConnection(
	                    "jdbc:mysql://localhost:3307/salary_audit",
	                    "root",
	                    "Bhakti$****");

	            String query =
	                    "select * from employees where department='IT'";

	            Statement st = con.createStatement();

	            ResultSet rs = st.executeQuery(query);

	            while(rs.next()) {

	                System.out.println(
	                        rs.getInt(1) + " " +
	                        rs.getString(2) + " " +
	                        rs.getString(3) + " " +
	                        rs.getDouble(4));
	            }

	            con.close();

	        } catch(Exception e) {

	            System.out.println(e);
	        }
	    }

}
