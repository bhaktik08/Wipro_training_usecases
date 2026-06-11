package TestNg_day_23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Parabank_Register_Test {

    WebDriver driver;

    @BeforeMethod
    public void setup() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://parabank.parasoft.com/parabank/register.htm");
    }


    @Test(priority = 1)
    public void registrationTest() throws InterruptedException {

        driver.findElement(By.id("customer.firstName")).sendKeys("Bhakti");

        Thread.sleep(1000);

        driver.findElement(By.id("customer.lastName")).sendKeys("Kate");

        Thread.sleep(1000);

        driver.findElement(By.id("customer.address.street")).sendKeys("Parbhani");

        Thread.sleep(1000);

        driver.findElement(By.id("customer.address.city")).sendKeys("Parbhani");

        Thread.sleep(1000);

        driver.findElement(By.id("customer.address.state")).sendKeys("Maharashtra");

        Thread.sleep(1000);

        driver.findElement(By.id("customer.address.zipCode")).sendKeys("431401");

        Thread.sleep(1000);

        driver.findElement(By.id("customer.phoneNumber")).sendKeys("9834280959");

        Thread.sleep(1000);

        driver.findElement(By.id("customer.ssn")).sendKeys("123456789");

        Thread.sleep(1000);

        driver.findElement(By.id("customer.username")).sendKeys("Shraddha11");

        Thread.sleep(1000);

        driver.findElement(By.id("customer.password")).sendKeys("Pass123");

        Thread.sleep(1000);

        driver.findElement(By.id("repeatedPassword")).sendKeys("Pass123");

        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@value='Register']")).click();

        Thread.sleep(3000);

        System.out.println("Registration Successful");

        String title = driver.getTitle();

        Assert.assertTrue(title.contains("ParaBank"));
    }


    @Test(priority = 2)
    public void transferFundsTest() throws InterruptedException {


        driver.findElement(By.name("username")).sendKeys("Shraddha112");

        driver.findElement(By.name("password")).sendKeys("Pass123");

        driver.findElement(By.xpath("//input[@value='Log In']")).click();

        Thread.sleep(3000);


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

        String message = driver.findElement(By.xpath("//h1[contains(text(),'Transfer Complete!')]")).getText();

        System.out.println("Success Message : " + message);

        Assert.assertEquals(message, "Transfer Complete!");

        System.out.println("Fund Transfer Successfully");
    }


    @Test(priority = 3)
    public void verifyHomePageTitle() {

        String actualTitle = driver.getTitle();

        System.out.println("Page Title : " + actualTitle);

        Assert.assertTrue(actualTitle.contains("ParaBank"));

        System.out.println("Title Verified Successfully");
    }

    @AfterMethod
    public void closeBrowser() {

        driver.quit();
    }
}
