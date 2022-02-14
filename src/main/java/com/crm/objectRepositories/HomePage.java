package com.crm.objectRepositories;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericUtilities.ExcelUtility;
import com.crm.genericUtilities.WebDriverUtility;

public class HomePage {
	
	public WebDriver driver;
	
	WebDriverUtility webdriver  = new WebDriverUtility();
	ExcelUtility eu = new ExcelUtility();
	
	
	public HomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//search text field
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement searchTextbox;
	
	//Method to enter text in searchtextbox 
	public void searTextbox(String Option1) throws EncryptedDocumentException, IOException  
	   {
		searchTextbox.sendKeys(Option1);
	   }
	
	//search button
	@FindBy(id= "nav-search-submit-text")
	private WebElement searchBtn;
	
		public void searchBtn() 
		{
		 searchBtn.click();
      	}
	
}
