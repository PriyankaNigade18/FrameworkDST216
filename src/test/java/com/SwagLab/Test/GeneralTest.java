package com.SwagLab.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GeneralTest {
  @Test
  public void swaglabTest()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.saucedemo.com/");
	  
	  driver.findElement(By.id("user-name")).sendKeys("standard_user");
	  driver.findElement(By.id("password")).sendKeys("secret_sauce");
	  driver.findElement(By.id("login-button")).click();
	  driver.quit();
	  
	  
  }
}
