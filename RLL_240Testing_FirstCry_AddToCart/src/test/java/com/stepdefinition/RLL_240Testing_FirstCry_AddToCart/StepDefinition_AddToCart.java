package com.stepdefinition.RLL_240Testing_FirstCry_AddToCart;



import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
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
public class StepDefinition_AddToCart {

	WebDriver driver;
	HomePage acp;
	AddToCartPage acp1;
	Logger log;



	@Before
	public void init()
	{

		driver = new ChromeDriver();
		acp = new HomePage(driver);
		acp1 = new AddToCartPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		log = Logger.getLogger(StepDefinition_AddToCart.class);

	}

	//Search


	@Given("the user is on the FirstCry homepage")
	public void the_user_is_on_the_first_cry_homepage() throws InterruptedException {
		acp.Launch();
		Thread.sleep(1000);
		log.info("user successfully is on the homepage");


	}

	@When("the user enters Shirt in the search bar")
	public void the_user_enters_shirt_in_the_search_bar() throws InterruptedException {
		acp.SearchItem1();
		log.info("user enters shirt in the search bar");
		Thread.sleep(1000);


	}

	@When("the user clicks on the search button")
	public void the_user_clicks_on_the_search_button() throws InterruptedException {
		acp.searchIconClick1();
		log.info("user clicks on the search button");
		Thread.sleep(1000);

	}

	@Then("the user should see a list of products related to Shirt")
	public void the_user_should_see_a_list_of_products_related_to_shirt() throws InterruptedException {
		WebElement exp = driver.findElement(By.xpath("//h1[contains(text(),'Best Shirts')]"));
		String act = exp.getText();
		String expected  = "Best Shirts";
		Assert.assertEquals(act, expected,"the text should match");
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

		Thread.sleep(3000);

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
		Thread.sleep(3000);	   

	}

	@Then("the user should see a confirmation message Product added to cart")
	public void the_user_should_see_a_confirmation_message_product_added_to_cart() throws InterruptedException {

		WebElement Cart = driver.findElement(By.xpath("//span[contains(text(),'Item has been added to your cart')]"));
		String actText = Cart.getText();
		String ExpText = "Item has been added to your cart";
		Assert.assertEquals(actText,ExpText, "text should match the expected value");	
		Thread.sleep(3000);

	}
}
