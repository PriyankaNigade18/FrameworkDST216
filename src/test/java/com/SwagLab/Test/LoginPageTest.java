package com.SwagLab.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.SwagLab.Pages.LoginPage;

public class LoginPageTest extends BaseTestClass
{
	//WebDriver driver;
	
	@Test(priority=2)
	public void verifyTitle()
	{
		String acttitle=lp.getAppTitle();
		Assert.assertTrue(acttitle.contains("Swag Labs"));
		System.out.println("Title verification completed Successfully");
		
	}
	
	
  @Test(priority=3)
  public void loginTest()
  {	  
	 // LoginPage lp=new LoginPage(driver);
	  lp.doLogin("standard_user","secret_sauce");
	   	  
  }
  
  @Test(priority=1)
  public void verifyCurrentUrl()
  {
	  String acturl=lp.getAppCurrentUrl();
	  Assert.assertTrue(acturl.contains("saucedemo"));
	  System.out.println("Current url verified!");
  }
}