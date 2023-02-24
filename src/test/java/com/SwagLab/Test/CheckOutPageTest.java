package com.SwagLab.Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckOutPageTest extends BaseTestClass
{
	@BeforeClass
	public void pageSetup()
	{
		lp.doLogin("standard_user","secret_sauce");
		addWait();
		pp.addProductToCart("Sauce Labs Bike Light");
		addWait();
		ap.openCartPage();
		ap.doCheckout();
	}
	
	
  @Test
  public void verifyCheckout() 
  {
	  cp.doCheckoutContinue("Priyanka", "Nigade","411047");
  }
}
