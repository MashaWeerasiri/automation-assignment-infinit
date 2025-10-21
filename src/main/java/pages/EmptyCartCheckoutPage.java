package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmptyCartCheckoutPage {

	private WebDriver driver;
	private WebDriverWait wait;
	
	// Locators
    private By emptyCheckoutButton = By.xpath("//span[text()='Checkout']");
    private By emptyCheckoutMsg = By.linkText("Your shopping cart is empty!");
    
    public EmptyCartCheckoutPage(WebDriver driver) {
    	this.driver = driver;
    	this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
   
    public void clickEmptyCheckoutButton() {
    	wait.until(ExpectedConditions.elementToBeClickable(emptyCheckoutButton)).click();
    }
    
    public boolean isCartEmptyMsgDisplayed() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(emptyCheckoutMsg));
            return driver.findElement(emptyCheckoutMsg).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
	
}
