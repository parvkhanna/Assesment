package com.crm.objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
	
	WebDriver driver;
	public ShoppingCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver , this);
	}
	
	@FindBy(id="a-autoid-0")
	private WebElement qty;
	//to click on the quantity button 
	public void qtybtn()
	{
		qty.click();
		
	}
	
	
	@FindBy(xpath ="//li[@tabindex='0'][11]")
	private WebElement qtyValue;
	
	public void qtyValue() throws InterruptedException
	{
		Thread.sleep(2000);
		qtyValue.click();
	}
	
	
	@FindBy(id="a-autoid-1-announce")
	private WebElement updatebtn;
	
	public void updatebtn()
	{
		updatebtn.click();
	}
	
	@FindBy(xpath = "//input[@value='Delete']")
	private WebElement deletebtn;
	
	public void deletebtn()
	{
		deletebtn.click();
	}

}
