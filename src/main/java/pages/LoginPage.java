package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginPage {

    private WebDriver driver;
    private WebDriverWait wait;

    // Locators
    private By loginOrRegisterLink = By.linkText("Login or register");
    private By usernameField = By.id("loginFrm_loginname");
    private By passwordField = By.id("loginFrm_password");
    private By loginButton = By.xpath("//button[@title='Login']");
    private By errorMessage = By.xpath("//div[@class='alert alert-error alert-danger']");

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Actions
    public void loadingLoginPage() {
        wait.until(ExpectedConditions.elementToBeClickable(loginOrRegisterLink)).click();
    }

    public void enterUserName(String username) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField)).sendKeys(username);
    }

    public void enterPassword(String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField)).sendKeys(password);
    }

    public void clickLoginButton() {
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
    }

    public String getLoginErrorMessage() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessage)).getText();
    }
}
