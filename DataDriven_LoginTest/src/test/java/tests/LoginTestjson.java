package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utilities.JsonUtil;

public class LoginTestjson extends BaseTest {

	@Test(dataProvider="jsonData",
		      dataProviderClass=JsonUtil.class)

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
