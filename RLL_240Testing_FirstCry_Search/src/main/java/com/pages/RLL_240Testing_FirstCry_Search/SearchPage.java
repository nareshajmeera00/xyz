package com.pages.RLL_240Testing_FirstCry_Search;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchPage {
	private static final CharSequence Search_Item = null;

	WebDriver driver;

	By SearchItem = By.xpath("//input[@id=\"search_box\"]");
	By IconClick = By.xpath("//span[@class=\"search-button\"]");
//	By Click = By.xpath("//span[contains(@class,'search-button')]");
	public SearchPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void Launch()
	{
		driver.get("https://www.firstcry.com/");
		driver.manage().window().maximize();
	}
   
	public void SearchItem(String Search_Item) 
	{
		driver.findElement(SearchItem).click();
		driver.findElement(SearchItem).sendKeys(Search_Item);
	}
	
	public void  IconClick() 
	{
		driver.findElement(IconClick).click();
	}
	
	public void InvalidSearchItem(String Search_Item_1) 
	{
		driver.findElement(SearchItem).click();
		driver.findElement(SearchItem).sendKeys(Search_Item_1);	
	}
	
	public void  InvalidIconClick() 
	{
		driver.findElement(IconClick).click();
	}
	
	public void NullSearchItem() 
	{
		driver.findElement(SearchItem).click();
		driver.findElement(SearchItem).sendKeys(Search_Item);
	}
	
	public void NullIconClick() 
	{
		driver.findElement(IconClick).click();
	}
	
	
	public void SpecialCharSearch(String Search_Item_2) {
		driver.findElement(SearchItem).click();
		driver.findElement(SearchItem).sendKeys(Search_Item_2);		
	}
//	public void SpecialIconClick() 
//	{
//		driver.findElement(Click).sendKeys(Keys.ENTER);
//	}
}
