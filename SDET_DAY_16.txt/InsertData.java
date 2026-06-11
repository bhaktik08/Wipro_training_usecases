package jdbc;
import java.sql.*;
import java.sql.DriverManager;

public class InsertData_Ex {
public static void main(String[] args)
{
 
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3307/salary_audit";
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/salary_audit", "root", "Bhakti$****");
 
		
		Statement st=con.createStatement();
		 String query = "UPDATE Employees SET salary = 75000 WHERE emp_id = 103";
		
		 int rows = st.executeUpdate(query);
		
		System.out.println(rows + " row updated");
		
		con.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
}
 
}


