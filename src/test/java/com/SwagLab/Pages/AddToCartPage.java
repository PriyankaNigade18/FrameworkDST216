package com.SwagLab.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.SwagLab.Utility.ScreenshotUtil;

public class AddToCartPage
{
	private WebDriver driver;
	
	//initialize driver
	public AddToCartPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	//identification
	private By cartlink=By.xpath("//a[@class='shopping_cart_link']");
	private By removebtn=By.xpath("//button[text()='Remove']");
	private By cshopbtn=By.xpath("//button[text()='Continue Shopping']");
	private By checkoutbtn=By.xpath("//button[text()='Checkout']");
	
	
	//actions
	
	public void openCartPage()
	{
		driver.findElement(cartlink).click();
		ScreenshotUtil.capture(driver);
	}
	
	public void doRemove()
	{
		driver.findElement(removebtn).click();
	}
	
	
	public void doContinueShopping()
	{
		driver.findElement(cshopbtn).click();
	}
	
	
	public void doCheckout()
	{
		driver.findElement(checkoutbtn).click();
	}
	
	
}
