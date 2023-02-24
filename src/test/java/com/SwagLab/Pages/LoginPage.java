package com.SwagLab.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.SwagLab.Utility.ScreenshotUtil;

public class LoginPage
{
	private WebDriver driver;//this driver is null
	
	//Initialize driver
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Encapsulation
	
	//Identification(By locator)
	private By username=By.id("user-name");
	private By password=By.id("password");
	private By loginbtn=By.id("login-button");
	
	
	//Actions
	public void doLogin(String uname,String psw)
	{
		driver.findElement(username).sendKeys(uname);
		driver.findElement(password).sendKeys(psw);
		ScreenshotUtil.capture(driver);
		driver.findElement(loginbtn).click();
		ScreenshotUtil.capture(driver);
	}
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	
	
	public String getAppCurrentUrl()
	{
		return driver.getCurrentUrl();
	}
	

}
