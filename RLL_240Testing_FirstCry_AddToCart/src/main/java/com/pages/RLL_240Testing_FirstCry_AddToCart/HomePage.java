package com.pages.RLL_240Testing_FirstCry_AddToCart;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;

	By SearchItem1 = By.xpath("//input[@id=\"search_box\"]");
	By IconClick1 = By.xpath("//span[@class=\"search-button\"]");
	By SelectFirst_Item = By.xpath("//img[@title=\"Babyhug Disney  Single Jersey Knit Full Sleeves Shirt With Winnie & Friends Print & Pocket Detailing - White\"]");

	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}

	public void Launch()
	{
		driver.get("https://www.firstcry.com/");
		driver.manage().window().maximize();
	}
	

	public void SearchItem1() 
	{
		driver.findElement(SearchItem1).click();
		driver.findElement(SearchItem1).sendKeys("Shirt");
	}

	public void  searchIconClick1()   
	{
		driver.findElement(IconClick1).click();	
	}

	public void SelectFirst_Item() 
	{
		driver.findElement(SelectFirst_Item).click();
	}
}
