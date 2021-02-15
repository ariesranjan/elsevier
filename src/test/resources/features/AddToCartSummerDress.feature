Feature: To verify that summer dresses can be added to the cart

  Background:
    Given user is on application home page

  @AddToCart @positive
  Scenario: Verify the user is able to add summer dresses to the cart and able to navigate to Sign In page
    When user clicks on women tab
    When user clicks on dresses link
    When user clicks on summer dresses link
    When user clicks on printed summer dresses link
    When user clicks on add to cart button
    When user clicks on proceed to checkout button
    When user clicks on proceed to checkout button in cart navigation
    Then user is verifying that sign in page is displayed
    