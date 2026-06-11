package jdbc;
import java.sql.*;

public class DeleteEmployee {
	public static void main(String[] args) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3307/salary_audit",
                    "root",
                    "Bhakti$1683");

            String query =
                    "delete from employees where emp_id = ?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, 110);

            int rows = ps.executeUpdate();

            System.out.println(rows + " row deleted");

            con.close();

        } catch(Exception e) {

            System.out.println(e);
        }
    }

}
