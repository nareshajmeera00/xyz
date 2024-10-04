package com.stepdefinition.RLL240Testing_FirstCry_Search;

import static org.junit.Assert.assertTrue;
import java.util.List;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.pages.RLL_240Testing_FirstCry_Search.SearchPage;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition_Search {
	WebDriver driver;
	SearchPage obj;
	Logger log;

	@Before
	public void init() {
		driver = new ChromeDriver();
		obj = new SearchPage(driver);
		Logger.getLogger(StepDefinition_Search.class);
	}

	/*
	 * @Given("The user navigates to FirstCry Home Page") public void
	 * the_user_navigates_to_first_cry_home_page() {
	 * 
	 * 
	 * }
	 * 
	 * @When("The user clicks on login") public void the_user_clicks_on_login() {
	 * 
	 * }
	 * 
	 * @And("The user enters the email id or mobile no.") public void
	 * the_user_enters_the_email_id_or_mobile_no() {
	 * 
	 * }
	 * 
	 * @Then("The user clicks on Continue") public void
	 * the_user_clicks_on_continue() {
	 * 
	 * }
	 * 
	 * @And("The user enters the OTP sent to his registered email ID or mobile no.")
	 * public void
	 * the_user_enters_the_otp_sent_to_his_registered_email_id_or_mobile_no() {
	 * 
	 * }
	 * 
	 * @Then("Click on Submit") public void click_on_submit() {
	 * 
	 * }
	 * 
	 * @Then("The user should be redirected to the Home Page") public void
	 * the_user_should_be_redirected_to_the_home_page() {
	 * 
	 * }
	 */

	@Given("the user is on the FirstCry homepage")

	public void the_user_is_on_the_FirstCry_homepage() {
		obj.Launch();
		log.info("");
	}

	@When("^the user enters (.*) in the search bar$")

	public void the_user_enters_in_the_search_bar(String searchItem) throws InterruptedException {
		obj.SearchItem(searchItem);
		obj.IconClick();
		log.info("user enters in the search bar");
		String actualText = driver.findElement(By.xpath("//span[@class='bd_hl']")).getText();
		System.out.println(actualText);
		Thread.sleep(2000);

		Assert.assertEquals(actualText, "Shirts", "The text of the element does not match the expected value!");

	}

	@When("the user clicks on the search button")
	public void the_user_clicks_on_the_search_button() {

	}

	@Then("the user should see a list of products related to Search item")

	public void the_user_should_see_a_list_of_products_related_to_Searech_item() throws InterruptedException {
		log.info("user getting product realated details");
		String actualText = driver.findElement(By.xpath("//span[@class='bd_hl']")).getText();
		System.out.println(actualText);
		Thread.sleep(2000);

		Assert.assertEquals(actualText, "Shirts", "The text of the element does not match the expected value!");

	}     
}


