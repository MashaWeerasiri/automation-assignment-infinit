package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BasePage;
import pages.EmptyCartCheckoutPage;

public class EmptyCartCheckoutTest extends BasePage{
	
	EmptyCartCheckoutPage emptyCartCheckoutPage;
	
	@Test(groups = "emptyCart", dependsOnGroups = "login")
	public void emptyCartCheckout() {
		emptyCartCheckoutPage = new EmptyCartCheckoutPage(driver);
		emptyCartCheckoutPage.clickEmptyCheckoutButton();
		
		 boolean isConfirmed = emptyCartCheckoutPage.isCartEmptyMsgDisplayed();
	        Assert.assertTrue(isConfirmed, "Your shopping cart is empty!\r\n"
	        		+ "");
	}

}
