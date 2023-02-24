package com.SwagLab.Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProductPageTest extends BaseTestClass
{
	@BeforeClass
	public void testSetUp()
	{
		lp.doLogin("standard_user","secret_sauce");
	}
	
	
  @Test
  public void verifyProductCount()
  {
	  int totalProducts=pp.totalProductCount();
	  System.out.println("Total Products are: "+totalProducts);
  }
  
  
  
  @Test
  public void verifyProductSelection()
  {
	  pp.addProductToCart("Sauce Labs Bike Light");
  }
}
