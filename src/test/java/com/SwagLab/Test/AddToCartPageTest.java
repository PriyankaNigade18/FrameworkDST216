package com.SwagLab.Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AddToCartPageTest extends BaseTestClass
{
	@BeforeClass
	public void pageSetup()
	{
		lp.doLogin("standard_user","secret_sauce");
		addWait();
		pp.addProductToCart("Sauce Labs Bike Light");
		addWait();
	}
	
	
	
  @Test
  public void getApplication()
  {
	  ap.openCartPage();
	  System.out.println("Cart page is open!");
	  addWait();
  }
  
  
  @Test(enabled=false)
  public void verifyRemoveFunction()
  {
	  ap.doRemove();
  }
  
  
  @Test
  public void verifyCheckout()
  {
	  ap.doCheckout();
	  
  }
  
  
  
  
}
