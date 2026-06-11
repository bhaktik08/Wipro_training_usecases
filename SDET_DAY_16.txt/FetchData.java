package jdbc;
import java.sql.*;

public class FetchData_Ex {
   public static void main(String[] args)
 {
	try
 {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/salary_audit", "root", "Bhakti$****");
 
 String query="insert into employees values(?, ?, ?, ?)";
	
 PreparedStatement ps=con.prepareStatement(query);
 
 ps.setInt(1, 106);
 ps.setString(2, "Billu");
 ps.setInt(3,0);
 ps.setDouble(4, 45000);
 int rows=ps.executeUpdate();
 
 System.out.println(rows + " row inserted ");
 con.close();
 }
	catch(Exception e)
	{
		System.out.println(e);
}
}
}
 
