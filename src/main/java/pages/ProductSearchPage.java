package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ProductSearchPage {

    private WebDriver driver;
    private WebDriverWait wait;

    // Locators
    private By searchBox = By.id("filter_keyword");
    private By searchButton = By.className("button-in-search");
    private By addToCartButton =  By.cssSelector(".fa.fa-cart-plus.fa-fw");

    // Constructor
    public ProductSearchPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Actions
    public void searchItem(String itemName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchBox)).clear();
        driver.findElement(searchBox).sendKeys(itemName);
    }

    public void clickSearch() {
    	driver.findElement(searchButton).click();
    }

    public void addTocart() {
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton)).click();
    }
}
