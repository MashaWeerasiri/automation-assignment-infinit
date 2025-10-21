package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SingleProductCheckoutPage {

	private WebDriver driver;
	private WebDriverWait wait;
	
	// Locators
    private By addtoCartButton = By.linkText("Add to Cart");
    private By checkOut = By.id("cart_checkout1");
    private By checkoutConfirmMsg = By.linkText("Checkout Confirmation");
    
    
    public SingleProductCheckoutPage(WebDriver driver) {
    	this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
    
   
    public void clickAddtoCart() {
    	 wait.until(ExpectedConditions.elementToBeClickable(addtoCartButton)).click();
    }
    
    public void checkOutCart() {
    	wait.until(ExpectedConditions.elementToBeClickable(checkOut)).click();
    }
    
    public boolean isOrderConfirmationDisplayed() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(checkoutConfirmMsg));
            return driver.findElement(checkoutConfirmMsg).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
