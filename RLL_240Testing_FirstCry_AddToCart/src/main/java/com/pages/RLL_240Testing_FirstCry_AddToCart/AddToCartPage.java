package com.pages.RLL_240Testing_FirstCry_AddToCart;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPage {
	WebDriver driver;
	
	public AddToCartPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By product_Size = By.xpath("//div[@id=\"euroavail-18137796\"]");
	By Enter_Pincode = By.xpath("//input[@class=\"J14M_42 ip_box changepincode \"]");
	By Pin_Change = By.xpath(" //span[@class=\"chngeBtn link_bold checkpin\"]");
	By addToCartButton = By.xpath("//div[@class='addgotoText btn_fill add_to_cart']//span[text()='ADD TO CART']");
	

	public void Launch()
	{
		driver.get("https://www.firstcry.com/");
		driver.manage().window().maximize();
	}
	

	public void Item_Size() {
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		driver.findElement(product_Size).click();
	}
	public void Enter_Pincode(String pincode) {
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		driver.findElement(Enter_Pincode).click();
		driver.findElement(Enter_Pincode).sendKeys(pincode);

	}
	public void Pin_Change() {
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		driver.findElement(Pin_Change).click();
	}
	
	public void addToCart() throws InterruptedException
	{
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		driver.findElement(addToCartButton).click();
	}
}
