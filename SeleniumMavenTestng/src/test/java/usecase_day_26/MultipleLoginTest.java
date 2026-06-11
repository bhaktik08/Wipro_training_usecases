package usecase_day_26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultipleLoginTest {

	WebDriver driver;

	@DataProvider(name = "loginData")
	public Object[][] getData() {

		return new Object[][] {

			{"admin", "admin123"},
			{"user", "user123"},
			{"test", "test123"},
			{"student", "Password123"}

		};
	}


	@Test(dataProvider = "loginData")
	public void loginTest(String username, String password) throws InterruptedException {

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://practicetestautomation.com/practice-test-login/");

		Thread.sleep(2000);

	
		driver.findElement(By.id("username")).sendKeys(username);
		Thread.sleep(2000);

		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(2000);

		driver.findElement(By.id("submit")).click();
		Thread.sleep(3000);

		
		String currentUrl = driver.getCurrentUrl();

		if (currentUrl.contains("logged-in-successfully")) {

			System.out.println(username + " Login Successful");

		} else {

			System.out.println(username + " Login Failed");
		}
	}

	@AfterMethod
	public void closeBrowser() throws InterruptedException {

		Thread.sleep(2000);

		driver.quit();
	}
}
