package com.SwagLab.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage 
{
	private WebDriver driver;
	
	//initialize driver
	public ProductPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//identification
	private By allProduct=By.xpath("//div[@class='inventory_list']//div[@class='inventory_item_name']");
	
	private By addToCartbtn=By.xpath("//button[text()='Add to cart']");
	
	
	//Actions
	public int totalProductCount()
	{
		return driver.findElements(allProduct).size();
	}
	
	
	public void addProductToCart(String pname)
	{
		List<WebElement> list=driver.findElements(allProduct);
		
		for(WebElement i:list)
		{
			if(i.getText().contains(pname))
			{
				i.click();
				break;
			}
		}
		
		driver.findElement(addToCartbtn).click();
		System.out.println("Product has added into cart!");
	
	}

}
