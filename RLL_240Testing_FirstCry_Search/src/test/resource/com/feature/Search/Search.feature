Feature: User search for a product

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
  Scenario Outline: User searches for a product successfully
    Given the user is on the FirstCry homepage
    When the user enters <Search_Item> in the search bar
    And the user clicks on the search button
    Then the user should see a list of products related to Search item

    Examples: 
      | Input      | Expected Input                                      |
      | Shirt      | Shirt                                               |
      | 354632e    | Your search "354632e" did not match any products    |
      |            | please enter a category, Brand or product to search |
      | baby@toys! | baby(16444 Items)                                   |
      
      
  #@InvalidSearch
  #Scenario Outline: User searches for a product that does not exist
    #Given User is on the FirstCry homepage
    #When User enters nonexistent product <Search_Item_1> in the search bar
    #And User clicks on the search button
    #Then User should see a message indicating no results were found
#
    #Examples: 
      #| Search_Item_1 |
      #| 354632e       |
#
  #@EmptySearch
  #Scenario: User performs a search without entering any keywords
    #Given user navigates the FirstCry homepage
    #When the user clicks on the search button without entering any keywords
    #Then the user should see an error message stating Search for a category,Brand or product
#
  #@SpecialCharSearch
  #Scenario Outline: User searches for a product with special characters
    #Given User enters the FirstCry homepage
    #When the user enters baby@toys! <Search_Item_2> in the search bar
    #And User clicks on  search button
    #Then the user should see a list of products related to baby toys
#
    #Examples: 
      #| Search_Item_2 |
      #| baby@toys!    |
