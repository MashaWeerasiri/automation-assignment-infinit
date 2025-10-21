package test;

import base.BasePage;
import org.testng.annotations.Test;
import pages.ProductSearchPage;

public class ProductSearchTest extends BasePage {

    ProductSearchPage productSearchPage;

    @Test(groups = "search", dependsOnGroups = "login")
    public void searchProduct() {
        productSearchPage = new ProductSearchPage(driver);
        productSearchPage.searchItem("seaweed conditioner");
        productSearchPage.clickSearch();
    }

    @Test(groups = "cart", dependsOnGroups = "search")
    public void addToCart() {
        productSearchPage.addTocart();
    }
}
