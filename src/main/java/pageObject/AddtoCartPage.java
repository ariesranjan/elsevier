package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.ConfigFileReader;

public class AddtoCartPage {
	WebDriver driver;
    ConfigFileReader fileReader;
    
	public AddtoCartPage(WebDriver driver) {
		this.driver = driver;
	    PageFactory.initElements(driver, this);
	 }
	
	@FindBy(how=How.CSS, using="[title='Women']")
	private WebElement tab_Women;
	
	@FindBy(how=How.CSS, using=".subcategory-image a[title='Dresses']")
	private WebElement link_Dresses;
	
	@FindBy(how=How.CSS, using=".subcategory-image a[title='Summer Dresses']")
	private WebElement link_SummerDresses;
	
	@FindBy(how=How.CSS, using="[title='Printed Summer Dress']")
	private WebElement link_PrintedSummerDress;
	
	@FindBy(how=How.CSS, using=".box-cart-bottom [type='submit']")
	private WebElement btn_AddToCart;
	
	@FindBy(how=How.CSS, using="[title='Proceed to checkout']")
	private WebElement btn_ProceedToCheckout;
	
	@FindBy(how=How.CSS, using=".cart_navigation [title='Proceed to checkout']")
	private WebElement btn_ProceedToCheckoutCartNav;
	
	@FindBy(how=How.CSS, using="#login_form")
	private WebElement form_Login;
	
	public void openApplicationHomePage() {
        fileReader = new ConfigFileReader();
        driver.get(fileReader.getUrl());

    }
	
	public void clickOn_WomenTab() {
		tab_Women.click();
	}
	
	public void clickOn_DressesLink() {
		link_Dresses.click();
	}
	
	public void clickOnSummerDressesLink() {
		link_SummerDresses.click();
	}
	
	public void clickOnPrintedSummerDressesLink() {
		link_PrintedSummerDress.click();
	}
	
	public void clickOnAddToCartButton() {
		btn_AddToCart.click();
	}
	
	public void clickOnProceedToCheckoutButton() {
		btn_ProceedToCheckout.click();
	}
	
	public void clickOnProceedToCheckoutButtonInCartNav() {
		btn_ProceedToCheckoutCartNav.click();
	}
	
	public void verifyLoginFormDisplayed() {
		form_Login.isDisplayed();
	}

}
