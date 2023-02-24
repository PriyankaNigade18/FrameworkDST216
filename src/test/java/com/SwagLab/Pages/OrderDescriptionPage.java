package com.SwagLab.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.SwagLab.Utility.ScreenshotUtil;

public class OrderDescriptionPage
{
	private WebDriver driver;
	
	public OrderDescriptionPage(WebDriver driver)
	{
	this.driver=driver;	
	}
	
	
	
	//Identification
	
	private By pinfo=By.xpath("//div[@id='checkout_summary_container']");
	private By cancelbtn=By.id("cancel");
	private By finishbtn=By.id("finish");
	private By orderfinidh=By.xpath("//div[@id='checkout_complete_container']");
	
	//Actions
	public void getOrderDescription()
	{
		String text=driver.findElement(pinfo).getText();
		ScreenshotUtil.capture(driver);
		System.out.println("*****Product description is******");
		System.out.println(text);
	}
	
	
	public void doFinish()
	{
		driver.findElement(finishbtn).click();
		System.out.println(driver.findElement(orderfinidh).getText());
	}
	
	
	
	
	
	
	
}
