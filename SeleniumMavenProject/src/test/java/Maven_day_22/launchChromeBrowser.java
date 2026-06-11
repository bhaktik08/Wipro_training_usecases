package Maven_day_22;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		driver.quit();
		
		

	}

}
