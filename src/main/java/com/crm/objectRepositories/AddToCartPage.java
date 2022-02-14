package com.crm.objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crm.genericUtilities.WebDriverUtility;

public class AddToCartPage {
	WebDriver driver ;
	WebDriverUtility wb = new WebDriverUtility();
	//add to cart button
	
	public AddToCartPage(WebDriver driver) 
	{
		PageFactory.initElements(driver , this);
	}

	@FindBy(id="add-to-cart-button")
	private WebElement addcartbtn;
	
	public void addtocart()
	{
		addcartbtn.click();
	}
	
	//To verify the product is added to cart
	@FindBy(xpath = "//div[@id='attachAddBaseItemSuccessAlert']")
	private WebElement addCartVerificationMsg;
	
	public void verification()
	{
		String verify = addCartVerificationMsg.getText();
		System.out.println(verify);
	}
	
	@FindBy(id ="attach-view-cart-button-form")
	private WebElement cartoptn;
	
	public void clickOnCart()
	
	{
		//wb.mouseHover(driver, cartoptn);
		cartoptn.click();
	}
	
	
			
}


