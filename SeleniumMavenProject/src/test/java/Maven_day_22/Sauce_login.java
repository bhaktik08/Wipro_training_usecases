package Maven_day_22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sauce_login {
	public static void main(String[] args) throws InterruptedException
	{
		
	WebDriver driver = new ChromeDriver();
	 
	driver.get("https://www.saucedemo.com");
	 
	driver.manage().window().maximize();
	Thread.sleep(1000);
	 
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	Thread.sleep(1000);
	 
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	Thread.sleep(1000);
	 
	driver.findElement(By.id("login-button")).click();
	 
	System.out.println(driver.getTitle());
	Thread.sleep(1000);
	driver.quit();
	}

}
