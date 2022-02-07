package com.crm.objectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.crm.genericUtilities.WebDriverUtility;

public class HomePage {
	
	public WebDriver driver;
	
	WebDriverUtility webdriver  = new WebDriverUtility();
	
	public HomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//search text field
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement searchTextbox;
	
	//Method to enter text in searchtextbox 
	public void searTextbox() 
	   {
		searchTextbox.sendKeys("Iphone 12");
	   }
	
	//search button
	@FindBy(id= "nav-search-submit-text")
	private WebElement searchBtn;
	
		public void searchBtn() 
		{
		 searchBtn.click();
      	}
	
}
