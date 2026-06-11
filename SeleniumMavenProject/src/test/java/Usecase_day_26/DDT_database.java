package Usecase_day_26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDT_database {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(
				 "jdbc:mysql://localhost:3307/selenium_db","root","root");
		
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery("select * from login_data");

		  while(rs.next()) {

	            String Username = rs.getString("username");

	            String Password = rs.getString("password");


	            System.out.println(Username);
	            System.out.println(Password);
	            
	            WebDriver driver = new ChromeDriver();

	            driver.manage().window().maximize();

	            driver.get("https://www.saucedemo.com");


	            driver.findElement(By.id("user-name")).sendKeys(Username);

	            driver.findElement(By.id("password")).sendKeys(Password);

	            driver.findElement(By.id("login-button")).click();

	            System.out.println("Login Attempted");

	            driver.quit();
	        }

	        con.close();
	}

}
