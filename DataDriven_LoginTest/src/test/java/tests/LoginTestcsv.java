package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utilities.CsvUtil;

public class LoginTestcsv extends BaseTest {

	@Test(dataProvider="csvData",
		      dataProviderClass=CsvUtil.class)

    public void loginTest(String username,
                          String password)
            throws Exception {

        Thread.sleep(3000);

        LoginPage loginPage =
                new LoginPage(driver);

        loginPage.login(username,password);

        Thread.sleep(3000);

        String url = driver.getCurrentUrl();

        if(username.equals("Admin")
                && password.equals("admin123")) {

            Assert.assertTrue(
                    url.contains("dashboard"));
        }
        else {

            Assert.assertTrue(
                    url.contains("auth/login"));
        }
    }
}