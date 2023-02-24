package com.SwagLab.Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OrderDescriptionPageTest extends BaseTestClass
 {
//	@BeforeClass
//	public void pageSetup()
//	{
//		lp.doLogin("standard_user","secret_sauce");
//		addWait();
//		pp.addProductToCart("Sauce Labs Bike Light");
//		addWait();
//		ap.openCartPage();
//		ap.doCheckout();
//		cp.doCheckoutContinue("Priyanka", "Nigade", "411047");
//	}
	
	
  @Test(priority=1)
  public void verifyProductDetails()
  {
	  op.getOrderDescription();
  }
  
  @Test(priority=2)
  public void orderComplete()
  {
	  op.doFinish();
  }
  
  
 
}
