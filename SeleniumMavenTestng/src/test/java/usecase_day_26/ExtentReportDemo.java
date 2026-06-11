package usecase_day_26;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
 
public class ExtentReportDemo {
 
	public static void main(String[] args) throws IOException
	{
 
		ExtentSparkReporter reporter= new ExtentSparkReporter("reports/ExtentReport.html");
		
		ExtentReports extent= new ExtentReports();
		extent.attachReporter(reporter);
		
		ExtentTest test=extent.createTest("SauceDemo Login Test");
		
		WebDriver driver=new ChromeDriver();
		test.info("Browser Launched");
 
		driver.get("https://www.saucedemo.com");
		test.info("Opened SauceDemo Website");
 
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
        test.pass("Username Entered");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
        test.pass("Password Entered");
 
        driver.findElement(By.id("login-button")).click();
        test.pass("Login Button Clicked");
        
        String title=driver.getTitle();
        if(title.contains("Swag Labs"))
        {
        	test.pass("Login Successful");
        	
//        	take screenshot
        	TakesScreenshot ts = (TakesScreenshot) driver;

            File src = ts.getScreenshotAs(OutputType.FILE);

            File dest = new File("screenshots/login.png");
            
            FileUtils.copyFile(src, dest);
          
            
//            add Screenshot to report
            test.addScreenCaptureFromPath("screenshots/login.png");


        }
        else
        {
        	test.fail("Login Failed");
        	
        }
        
		driver.quit();
		test.info("Browser Closed");
		extent.flush();
		
		System.out.println("Extent Report Generated");
	}
 
}

