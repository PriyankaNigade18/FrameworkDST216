package com.SwagLab.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.SwagLab.Utility.ScreenshotUtil;

public class CheckOutPage
{
	private WebDriver driver;
	
	//initialize driver
	public CheckOutPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	//Identification
	
	private By fname=By.id("first-name");
	private By lname=By.id("last-name");
	private By zcode=By.id("postal-code");
	private By conbtn=By.id("continue");
	private By cancelbtn=By.id("cancel");
	
	
	
	
	//Actions
	public void doCancel()
	{
		driver.findElement(cancelbtn).click();
	}
			
	
	public void doCheckoutContinue(String firstn,String lastn,String zipcode)
	{
		driver.findElement(fname).sendKeys(firstn);
		driver.findElement(lname).sendKeys(lastn);
		driver.findElement(zcode).sendKeys(zipcode);
		ScreenshotUtil.capture(driver);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(conbtn).click();
		
	}
	
	
	
	
	
	
	
	
	

}
