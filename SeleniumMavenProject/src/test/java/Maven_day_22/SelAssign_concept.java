package Maven_day_22;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelAssign_concept  {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


		driver.get("https://demoqa.com/text-box");


		// 1. Text Field

		driver.findElement(By.id("userName")).sendKeys("Bhakti Kate");

		driver.findElement(By.id("userEmail")).sendKeys("bhakti@gmail.com");

		driver.findElement(By.id("currentAddress")).sendKeys("Mumbai");

		driver.findElement(By.id("permanentAddress")).sendKeys("Pune");


		// Scroll Page


		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,500)");

		Thread.sleep(2000);


		// 2. Button


		driver.findElement(By.id("submit")).click();

		Thread.sleep(2000);


		// 3. Radio Button


		driver.get("https://demoqa.com/radio-button");

		js.executeScript("window.scrollBy(0,300)");

		driver.findElement(By.xpath("//label[@for='yesRadio']")).click();

		Thread.sleep(2000);


		// 4. Check Box


		driver.get("https://demoqa.com/checkbox");

		driver.findElement(By.xpath("//button[@title='Expand all']")).click();

		driver.findElement(By.xpath("//span[text()='Desktop']")).click();

		Thread.sleep(2000);


		// 5. Dropdown / List Box


		driver.get("https://demoqa.com/select-menu");

		WebElement dropdown = driver.findElement(By.id("oldSelectMenu"));

		org.openqa.selenium.support.ui.Select select =
				new org.openqa.selenium.support.ui.Select(dropdown);

		select.selectByVisibleText("Purple");

		Thread.sleep(2000);


		// 6. Image Handling (Upload Image)


		driver.get("https://demoqa.com/upload-download");

		driver.findElement(By.id("uploadFile"))
				.sendKeys("C:\\Users\\HP\\Pictures\\test.png");

		Thread.sleep(2000);


		// 7. Screenshot


		TakesScreenshot ts = (TakesScreenshot) driver;

		File src = ts.getScreenshotAs(OutputType.FILE);

		File dest = new File("C:\\Users\\HP\\Desktop\\screenshot.png");

		FileUtils.copyFile(src, dest);

		System.out.println("Screenshot Taken");


		// 8. Actions Class


		driver.get("https://demoqa.com/buttons");

		Actions act = new Actions(driver);

		WebElement doubleClick =
				driver.findElement(By.id("doubleClickBtn"));

		act.doubleClick(doubleClick).perform();

		Thread.sleep(2000);

		WebElement rightClick =
				driver.findElement(By.id("rightClickBtn"));

		act.contextClick(rightClick).perform();

		Thread.sleep(2000);


		// Drag and Drop


		driver.get("https://demoqa.com/droppable");

		WebElement source = driver.findElement(By.id("draggable"));

		WebElement target = driver.findElement(By.id("droppable"));

		act.dragAndDrop(source, target).perform();

		Thread.sleep(2000);


		// Slider

		driver.get("https://demoqa.com/slider");

		WebElement slider =
				driver.findElement(By.xpath("//input[@type='range']"));

		act.dragAndDropBy(slider, 50, 0).perform();

		Thread.sleep(2000);


		// Mouse Hover


		driver.get("https://demoqa.com/menu");

		WebElement hover =
				driver.findElement(By.xpath("//a[text()='Main Item 2']"));

		act.moveToElement(hover).perform();

		Thread.sleep(2000);


		// 9. Alerts


		driver.get("https://demoqa.com/alerts");

		driver.findElement(By.id("alertButton")).click();

		Alert al = driver.switchTo().alert();

		System.out.println(al.getText());

		al.accept();

		Thread.sleep(2000);



		driver.findElement(By.id("confirmButton")).click();

		Alert al2 = driver.switchTo().alert();

		al2.dismiss();

		Thread.sleep(2000);
		

		driver.findElement(By.id("promtButton")).click();

		Alert al3 = driver.switchTo().alert();

		al3.sendKeys("Hello");

		al3.accept();

		Thread.sleep(2000);

		System.out.println("Automation Completed");

		driver.quit();

	}
}



