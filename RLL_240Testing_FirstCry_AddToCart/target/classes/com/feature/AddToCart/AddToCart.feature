Feature: User Login and Add to Cart

  #@Login
  #Scenario: Successful login with valid credentials
  #Given The user navigates to FirstCry Home Page
  #When The user clicks on login
  #And The user enters the email id or mobile no.
  #Then The user clicks on Continue
  #And The user enters the OTP sent to his registered email ID or mobile no.
  #Then Click on Submit
  #Then The user should be redirected to the Home Page
  @Search
  Scenario: User searches for a product successfully
    Given the user is on the FirstCry homepage
    When the user enters Shirt in the search bar
    When the user clicks on the search button
    Then the user should see a list of products related to Shirt

  @AddToCart
  Scenario Outline: User adds a product to the cart successfully
    Given the user navigate on the FirstCry homepage
    When the user enters a product in the search box
    When user clicks on search button
    When User click on the first product in the search results
    When User should be taken to the product detail page
    When the user select the item size
    When The user enters the delivery pincode <pincode> details
    When The user wants to check the pincode
    When the user clicks on the Add to Cart button
    Then the user should see a confirmation message Product added to cart

    Examples: 
      | pincode |
      |  506122 |
      |  111111 |
      |     111 |
      |         |
