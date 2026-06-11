package Maven_day_22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parabank_Register {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=724F2AFF75D011923770189C0B0F7E54");
		driver.manage().window().maximize();
		
//		Registration or Login to banking application
		
		driver.findElement(By.id("customer.firstName")).sendKeys("Bhakti");
		Thread.sleep(2000);

		driver.findElement(By.id("customer.lastName")).sendKeys("Kate");
		Thread.sleep(2000);

		driver.findElement(By.id("customer.address.street")).sendKeys("Parbhani");
		Thread.sleep(2000);

		driver.findElement(By.id("customer.address.city")).sendKeys("Parbhani");
		Thread.sleep(2000);

		driver.findElement(By.id("customer.address.state")).sendKeys ("Maharashtra");
		Thread.sleep(2000);

		driver.findElement(By.id("customer.address.zipCode")).sendKeys("431401");
		Thread.sleep(2000);

		driver.findElement(By.id("customer.phoneNumber")).sendKeys("9834280959");
		Thread.sleep(2000);

		driver.findElement(By.id("customer.ssn")).sendKeys("123456789");
		Thread.sleep(2000);


		driver.findElement(By.id("customer.username")).sendKeys("Shraddha11");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.password")).sendKeys("Pass123");
		Thread.sleep(2000);
		driver.findElement(By.id("repeatedPassword")).sendKeys("Pass123");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@value = 'Register']")).click();
		
		Thread.sleep(3000);
		System.out.println("Registeration Successful");
				
		
		
//		Navigate to Fund Transfer
		
		driver.findElement(By.linkText("Transfer Funds")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.id("amount")).sendKeys("50000");
		 Thread.sleep(2000);
		 
		 WebElement fromAccount = driver.findElement(By.id("fromAccountId"));
		 fromAccount.click();
		 
		 Thread.sleep(2000);


		WebElement toAccount = driver.findElement(By.id("toAccountId"));
		toAccount.click();

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='Transfer']")).click();
		Thread.sleep(3000);
		
		 System.out.println("Fund Transfer Successfully");	
		 
		 
		 
		 String message = driver.findElement(By.xpath("//h1[contains(text(),'Transfer Complete!')]")).getText();

		 System.out.println("Success Message : " + message);
			
		driver.findElement(By.linkText("Log Out")).click();

		Thread.sleep(2000);

		System.out.println("Logout Successful");

		 driver.quit();
		
	}	

}
