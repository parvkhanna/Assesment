package com.crm.objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CartPage {
	
	public CartPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	/*Quantity button */
	@FindBy(xpath= "//span[@class='a-dropdown-label']")
	private WebElement btnQuality;
	
	public void clickQty() {
		try {
			btnQuality.click();
			System.out.println("able to Quantity ");
		} catch (Exception e) {
			System.out.println("unable to Quantity");
			Assert.fail("unable to Quantity");
		}
	}
	
	/*Quantity no button */
	@FindBy(id= "quantity_3")
	private WebElement btnQualitynumber;
	
	
	public void clickqtyNumber() {
		try {
			btnQualitynumber.click();
			System.out.println("able to Quantity no");
		} catch (Exception e) {
			System.out.println("unable to Quantity no");
			Assert.fail("unable to Quantity no");
		}
	}
}


