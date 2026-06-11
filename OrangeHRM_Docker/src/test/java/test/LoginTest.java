package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;

public class LoginTest extends BaseTest {
	
	@Test
	public void loginTest() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.urlContains("dashboard"));

		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
	}

}
