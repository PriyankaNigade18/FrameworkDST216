package com.SwagLab.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.SwagLab.Pages.*;
import com.SwagLab.Utility.BrowserProvider;
import com.SwagLab.Utility.ExcelUtil;
import com.SwagLab.Utility.Propertyfile;


public class BaseTestClass 
{
	public WebDriver driver;
	public LoginPage lp;
	public ProductPage pp;
	public AddToCartPage ap;
	public CheckOutPage cp;
	public OrderDescriptionPage op;
	public Propertyfile p1;
	public ExcelUtil excel;
	
	@BeforeTest
	public void setup()
	{
//		 driver=new ChromeDriver();
//		 driver.get("https://www.saucedemo.com/");
		p1=new Propertyfile();
		driver=BrowserProvider.browserSetup(Propertyfile.getProp("bname"));
		 lp=new LoginPage(driver);
		 pp=new ProductPage(driver);
		 ap=new AddToCartPage(driver);
		 cp=new CheckOutPage(driver);
		 op=new OrderDescriptionPage(driver);
		 excel=new ExcelUtil();
		 
	}
	
	
	
	//@AfterTest
	  public void tearDown()
	  {
		  driver.quit();
	  }
	  
	  public void addWait()
	  {
		  try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	  
	  @BeforeClass
		public void pageSetup()
		{
			lp.doLogin(ExcelUtil.getData(0, 0),ExcelUtil.getData(0, 1));
			addWait();
			pp.addProductToCart(Propertyfile.getProp("pname"));
			addWait();
			ap.openCartPage();
			ap.doCheckout();
			cp.doCheckoutContinue(Propertyfile.getProp("fname"), Propertyfile.getProp("lname"), Propertyfile.getProp("zcode"));
		}	  
	  
}

