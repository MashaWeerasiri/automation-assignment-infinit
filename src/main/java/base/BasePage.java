package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class BasePage {
    protected static WebDriver driver;

    @BeforeSuite(alwaysRun = true)
    public void setUpDriver() {
        if (driver == null) {
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
            driver.get("https://automationteststore.com/"); // ✅ open homepage once
        }
    }

    @AfterSuite(alwaysRun = true)
    public void tearDownDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
