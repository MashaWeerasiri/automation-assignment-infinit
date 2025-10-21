package test;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BasePage {

    LoginPage loginPage;

    @Test(groups = "login")
    public void validateLogin() {
        loginPage = new LoginPage(driver);
        loginPage.loadingLoginPage();
        loginPage.enterUserName("masha");
        loginPage.enterPassword("masha@1234");
        loginPage.clickLoginButton();

        Assert.assertEquals(driver.getTitle(), "My Account", "Login failed!");
    }
}
