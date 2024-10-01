package com.stepdefinition.RLL_240Testing_FirstCry_AddToCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import com.pages.RLL_240Testing_FirstCry_AddToCart.AddToCartPage;
import com.pages.RLL_240Testing_FirstCry_AddToCart.HomePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinition {
	
	
	WebDriver driver;
	HomePage acp;
	AddToCartPage acp1;
	
	@Before
	public void init()
	{
		
		driver = new ChromeDriver();
		acp = new HomePage(driver);
		acp1 = new AddToCartPage(driver);
	}
	
	/*@Given("The user navigates to FirstCry Home Page")
	public void the_user_navigates_to_first_cry_home_page() {
		acp.Launch();
	   
	}

	@When("The user clicks on login")
	public void the_user_clicks_on_login() throws InterruptedException {
		Thread.sleep(2000);
	    
	}

	@And("The user enters the email id or mobile no.")
	public void the_user_enters_the_email_id_or_mobile_no() {
	    
	}

	@Then("The user clicks on Continue")
	public void the_user_clicks_on_continue() {
	    
	}

	@And("The user enters the OTP sent to his registered email ID or mobile no.")
	public void the_user_enters_the_otp_sent_to_his_registered_email_id_or_mobile_no() {
	   
	}

	@Then("Click on Submit")
	public void click_on_submit() {
	   
	}

	@Then("The user should be redirected to the Home Page")
	public void the_user_should_be_redirected_to_the_home_page() {
	   
	}*/

	
	
	//Search
	
	
	@Given("the user is on the FirstCry homepage")
	public void the_user_is_on_the_first_cry_homepage() throws InterruptedException {
		acp.Launch();
		Thread.sleep(1000);
		
	   
	}

	@When("the user enters Shirt in the search bar")
	public void the_user_enters_shirt_in_the_search_bar() throws InterruptedException {
		acp.SearchItem1();
		Thread.sleep(1000);
		
	   
	}

	@When("the user clicks on the search button")
	public void the_user_clicks_on_the_search_button() throws InterruptedException {
		acp.searchIconClick1();
		Thread.sleep(1000);
	   
	}

	@Then("the user should see a list of products related to Shirt")
	public void the_user_should_see_a_list_of_products_related_to_shirt() throws InterruptedException {
		WebElement exp = driver.findElement(By.xpath("//h1[contains(text(),'Best Shirts')]"));
		Assert.assertEquals(exp.getText(), "Best Shirts");
		Thread.sleep(1000);
			    
	}
	
	

	//Add to cart
	
	@Given("the user navigate on the FirstCry homepage")
	public void the_user_navigate_on_the_first_cry_homepage() throws InterruptedException {
		acp1.Launch();
		Thread.sleep(3000);
	    
	}
	
	
	@When("the user enters a product in the search box")
	public void the_user_enters_a_product_in_the_search_box() throws InterruptedException {
		acp.SearchItem1();
		Thread.sleep(3000);
	   
	}
	@When("user clicks on search button")
	public void user_clicks_on_search_button() throws InterruptedException {
		acp.searchIconClick1();
		Thread.sleep(3000);
	   
	}
	
	@When("User click on the first product in the search results")
	public void user_click_on_the_first_product_in_the_search_results() throws InterruptedException {
		acp.SelectFirst_Item();
		Thread.sleep(3000);
			    
	}

	@When("User should be taken to the product detail page")
	public void user_should_be_taken_to_the_product_detail_page() throws InterruptedException {		
//		WebElement exp = driver.findElement(By.xpath("//span[@class=\"J14R_42\"]"));
//		Assert.assertEquals(exp.getText(), "Babyhug Disney Single Jersey Knit Full Sleeves Shirt With Winnie & Friends Print & Pocket Detailing - White");
//		Thread.sleep(3000);
	   
	}
	
	@When("the user select the item size")
	public void the_user_select_the_item_size() throws InterruptedException {
		acp1.Item_Size();
		Thread.sleep(3000);
	}
	
	@When("^The user enters the delivery pincode (.*) details$")
	public void The_user_enters_the_delivery_pincode_details (String pincode) throws InterruptedException {
		acp1.Enter_Pincode(pincode);
		Thread.sleep(3000);
	}
	
	@When("The user wants to check the pincode")
	public void The_user_wants_to_check_the_pincode () throws InterruptedException {
		acp1.Pin_Change();
		Thread.sleep(3000);
	}
	
	
	
	@When("the user clicks on the Add to Cart button")
	public void the_user_clicks_on_the_add_to_cart_button() throws InterruptedException {
	   acp1.addToCart();
//	   WebElement exp1 = driver.findElement(By.xpath("//span[@class=\"prodQuant cart-icon B18_orange paddinglft\"]"));
//		Assert.assertEquals(exp1, "1");	
//		Thread.sleep(3000);
//	   
	   
	}

	@Then("the user should see a confirmation message Product added to cart")
	public void the_user_should_see_a_confirmation_message_product_added_to_cart() throws InterruptedException {
	WebElement exp1 = driver.findElement(By.xpath("//span[contains(text(),'Item has been added to your cart')]"));
	Assert.assertEquals(exp1, "Item has been added to your cart");	
		Thread.sleep(3000);
	   
	}
}
