package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BasePage;
import pages.SingleProductCheckoutPage;

public class SingleProductCheckoutTest extends BasePage{
	
	SingleProductCheckoutPage singleProductCheckoutPage;
	
	@Test(groups = "checkout", dependsOnGroups = "cart")
	public void addSingleProduct() {
		singleProductCheckoutPage = new SingleProductCheckoutPage(driver);
		singleProductCheckoutPage.clickAddtoCart();
	}
	
	@Test(groups = "checkoutSingle", dependsOnGroups = "checkout")
	public void checkoutSingleProduct() {
		singleProductCheckoutPage = new SingleProductCheckoutPage(driver);
		singleProductCheckoutPage.checkOutCart();
		
		 boolean isConfirmed = singleProductCheckoutPage.isOrderConfirmationDisplayed();
	        Assert.assertTrue(isConfirmed, "Order confirmation page was not displayed after checkout!");
		
		
	}

	
}
