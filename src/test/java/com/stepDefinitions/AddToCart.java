package com.stepDefinitions;

import cucumber.api.java.en.*;
import pageObject.AddtoCartPage;

import org.openqa.selenium.WebDriver;

public class AddToCart {

    public WebDriver driver;
    AddtoCartPage addToCart;


    public AddToCart() {
        this.driver = Hooks.driver;
        addToCart = new AddtoCartPage(driver);
    }

    @Given("^user is on application home page$")
    public void userIsOnTheDetailsPolicyExpertPage() {
        addToCart.openApplicationHomePage();
    }


    @When("^user clicks on women tab$")
    public void userClicksOnWomenTab() throws Throwable {
        addToCart.clickOn_WomenTab();
    }
    
    @When("^user clicks on dresses link$")
    public void userClicksOnDresses() throws Throwable {
        addToCart.clickOn_DressesLink();
    }
    
    @When("^user clicks on summer dresses link$")
    public void userClicksOnSummerDresses() throws Throwable {
        addToCart.clickOnSummerDressesLink();
    }
    
    @When("^user clicks on printed summer dresses link$")
    public void userClicksOnPrintedSummerDresses() throws Throwable {
        addToCart.clickOnPrintedSummerDressesLink();
    }
    
    @When("^user clicks on add to cart button$")
    public void userClicksOnAddToCartButton() throws Throwable {
        addToCart.clickOnAddToCartButton();
    }
    
    @When("^user clicks on proceed to checkout button$")
    public void userClicksOnProceedToCheckoutButton() throws Throwable {
        addToCart.clickOnProceedToCheckoutButton();
    }
    
    @When("^user clicks on proceed to checkout button in cart navigation$")
    public void userClicksOnProceedToCheckoutButtonInCartNav() throws Throwable {
        addToCart.clickOnProceedToCheckoutButtonInCartNav();
    }
    
    @Then("^user is verifying that sign in page is displayed$")
    public void verifyLoginFormDisplayed() throws Throwable {
        addToCart.verifyLoginFormDisplayed();
    }
    
//    @When("^user mouse hover on dresses tab$")
//    public void userMouseHoverOnDressesTab() throws Throwable {
//        addToCart.mouseHover_DressesTab();
//    }

}
