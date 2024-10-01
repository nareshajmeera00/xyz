package com.stepdefinition.RLL240Testing_FirstCry_Search;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import com.pages.RLL_240Testing_FirstCry_Search.Search;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinition {
	WebDriver driver;
	Search obj;
	
	@Before
	public void init()
	{
		driver = new ChromeDriver();
		obj = new Search(driver);
	}
	
	
	
	/*@Given("The user navigates to FirstCry Home Page")
	public void the_user_navigates_to_first_cry_home_page() {
	
	   
	}

	@When("The user clicks on login")
	public void the_user_clicks_on_login() {
	   
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
	
	
	
	 @Given("the user is on the FirstCry homepage")
	    public void the_user_is_on_the_FirstCry_homepage() {
	        obj.Launch();
	    }

	    @When("the user enters {string} in the search bar")
	    public void the_user_enters_in_the_search_bar(String searchItem) {
	        obj.SearchItem(searchItem);
	        obj.IconClick();
	    }

	    @When("the user clicks on the search button")
	    public void the_user_clicks_on_the_search_button() {
	        // Find the search button element and click it
	        WebElement searchButton = driver.findElement(By.id("search_button_id")); // Replace with actual search button ID
	        searchButton.click();
	    }

	    @Then("the user should see a list of products related to {string}")
	    public void the_user_should_see_a_list_of_products_related_to(String searchItem) {
	        // Verify that the search results are displayed
	        List<WebElement> products = driver.findElements(By.className("product_class_name")); // Replace with actual product class name
	        assertTrue("No products found!", products.size() > 0);
	        driver.quit();
	    }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	
//	//SearchValid 
//
//	@Given("the user is on the FirstCry homepage")
//	public void the_user_is_on_the_first_cry_homepage() throws InterruptedException {
//		obj.Launch();
//		Thread.sleep(1000);
//	   
//	}
//
//	@When("^the user enters Shirt (.*) in the search bar$")
//	public void the_user_enters_shirt_in_the_search_bar(String Search_Item) throws InterruptedException {
//		obj.SearchItem(Search_Item);
//		Thread.sleep(1000);
//	}
//
//	@And("the user clicks on the search button")
//	public void the_user_clicks_on_the_search_button() throws InterruptedException {
//		obj.IconClick();
//		Thread.sleep(1000);
//	}
//
//	@Then("the user should see a list of products related to Shirt")
//	public void the_user_should_see_a_list_of_products_related_to_shirt() throws InterruptedException {
//		WebElement exp = driver.findElement(By.xpath("//h1[contains(text(),'Best Shirts')]"));
//		Assert.assertEquals(exp.getText(), "Best Shirts");
//		Thread.sleep(1000);
//		
//	}
//	
//	
//	//InvalidSearch
//
//	@Given("User is on the FirstCry homepage")
//	public void user_is_on_the_first_cry_homepage() throws InterruptedException {
//		obj.Launch();
//		Thread.sleep(1000);
//	    
//	}
//
//	@When("^User enters nonexistent product (.*) in the search bar$")
//	public void user_enters_nonexistent_product_in_the_search_bar(String Search_Item_2) throws InterruptedException {
//		obj.InvalidSearchItem(Search_Item_2);
//		Thread.sleep(1000);
//	    
//	}
//
//	@And("User clicks on the search button")
//	public void user_clicks_on_the_search_button() throws InterruptedException {
//		obj.InvalidIconClick();
//		Thread.sleep(1000);
//	   
//	}
//
//	@Then("User should see a message indicating no results were found")
//	public void user_should_see_a_message_indicating_no_results_were_found() throws InterruptedException {
//		WebElement exp = driver.findElement(By.xpath("//p[contains(text(),'Please make sure the spelling is correct or try a different search term')]"));
//		Assert.assertEquals(exp.getText(), "Please make sure the spelling is correct or try a different search term");
//		Thread.sleep(1000);
//	    
//	}
//
//	//EmptySearch
//
//	@Given("user navigates the FirstCry homepage")
//	public void user_navigates_the_first_cry_homepage() throws InterruptedException {
//		obj.Launch();
//		Thread.sleep(1000);
//	    
//	}
//
//	@When("the user clicks on the search button without entering any keywords")
//	public void the_user_clicks_on_the_search_button_without_entering_any_keywords() throws InterruptedException {
//		obj.NullSearchItem();
//		obj.NullIconClick();
//		Thread.sleep(1000);
//	    
//	}
//
//	@Then("the user should see an error message stating Search for a category,Brand or product")
//	public void the_user_should_see_an_error_message_stating_search_for_a_category_brand_or_product() throws InterruptedException {
//		WebElement exp = driver.findElement(By.xpath("//span[contains(text(),'FirstCry Parenting')]"));
//		Assert.assertEquals(exp.getText(), "FirstCry Parenting");   
//		Thread.sleep(1000);
//	}
//	
//	
//	//SpecialCharSearch
//
//	@Given("User enters the FirstCry homepage")
//	public void user_enters_the_first_cry_homepage() throws InterruptedException {
//		obj.Launch();
//		Thread.sleep(1000);
//	    
//	}
//
//	@When("^the user enters baby@toys! (.*) in the search bar$")
//	public void the_user_enters_baby_toys_in_the_search_bar(String Search_Item_2) throws InterruptedException {
//		obj.SpecialCharSearch(Search_Item_2);
//		Thread.sleep(1000);
//	   
//	}
//	
//	@And("User clicks on search button")
//	public void user_clicks_on_search_button() throws InterruptedException {
//		obj.SpecialIconClick();
//		Thread.sleep(1000);
//	   
//	}
//	@Then("the user should see a list of products related to baby toys")
//	public void the_user_should_see_a_list_of_products_related_to_baby_toys() throws InterruptedException {
//		WebElement exp = driver.findElement(By.xpath("//h1[contains(text(),'baby')]"));
//		Assert.assertEquals(exp.getText(), "baby");
//		Thread.sleep(1000);
//      
//	}
//
//}
