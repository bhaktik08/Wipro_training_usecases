package usecase_day_27;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GridDemo {

    WebDriver driver;

    @Parameters("browser")

    @BeforeMethod

    public void setup(String browser)
            throws MalformedURLException {

        DesiredCapabilities cap =
                new DesiredCapabilities();

        if(browser.equalsIgnoreCase("chrome")) {

            cap.setBrowserName("chrome");
        }

        else if(browser.equalsIgnoreCase("edge")) {

            cap.setBrowserName("MicrosoftEdge");
        }


        URL url =
                new URL("http://localhost:4444/wd/hub");


        driver =
                new RemoteWebDriver(url, cap);


        driver.get("https://www.saucedemo.com");

        driver.manage().window().maximize();
    }



    @Test
    public void loginTest() {

        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        driver.findElement(By.id("login-button")).click();

        System.out.println("Login Successful");
    }



    @AfterMethod
    public void closeBrowser() throws InterruptedException {
    	
    	Thread.sleep(2000);

        driver.quit();
    }
}