Feature: Test all SwagLabs features

  Background: Login to SwagLabs
    Given I am on the SwagLabs login page
    When I enter valid username and password
    And I click the login button

  Scenario: Login to SwagLabs
    Then I should be logged in successfully

  Scenario: Add a product to cart
    Given I am on the SwagLabs home page
    When I add a product to the cart
    Then the product should be added to the cart

  Scenario: Logout from SwagLabs
    Then I should be logged out successfully

