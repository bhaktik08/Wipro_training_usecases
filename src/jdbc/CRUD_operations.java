package jdbc;

import java.sql.*;
import java.util.Scanner;

public class CRUD_operations {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3307/salary_audit",
                    "root",
                    "Bhakti$1683");

            System.out.println("1.Insert");
            System.out.println("2.Display");
            System.out.println("3.Update");
            System.out.println("4.Delete");

            System.out.println("Enter Choice:");
            int choice = sc.nextInt();

            if(choice == 1) {

                String query =
                        "insert into employees values(?,?,?,?)";

                PreparedStatement ps =
                        con.prepareStatement(query);

                System.out.println("Enter Id:");
                int id = sc.nextInt();

                System.out.println("Enter Name:");
                String name = sc.next();

                System.out.println("Enter Department:");
                String dept = sc.next();

                System.out.println("Enter Salary:");
                double salary = sc.nextDouble();

                ps.setInt(1, id);
                ps.setString(2, name);
                ps.setString(3, dept);
                ps.setDouble(4, salary);

                ps.executeUpdate();

                System.out.println("Inserted");

            }

            else if(choice == 2) {

                Statement st = con.createStatement();

                ResultSet rs =
                        st.executeQuery("select * from employees");

                while(rs.next()) {

                    System.out.println(
                            rs.getInt(1) + " " +
                            rs.getString(2) + " " +
                            rs.getString(3) + " " +
                            rs.getDouble(4));
                }
            }

            else if(choice == 3) {

                String query =
                        "update employees set salary=? where emp_id=?";

                PreparedStatement ps =
                        con.prepareStatement(query);

                System.out.println("Enter Employee Id:");
                int id = sc.nextInt();

                System.out.println("Enter New Salary:");
                double salary = sc.nextDouble();

                ps.setDouble(1, salary);
                ps.setInt(2, id);

                ps.executeUpdate();

                System.out.println("Updated");
            }

            else if(choice == 4) {

                String query =
                        "delete from employees where emp_id=?";

                PreparedStatement ps =
                        con.prepareStatement(query);

                System.out.println("Enter Employee Id:");
                int id = sc.nextInt();

                ps.setInt(1, id);

                ps.executeUpdate();

                System.out.println("Deleted");
            }

            con.close();

        } catch(Exception e) {

            System.out.println(e);
        }
    }

}
