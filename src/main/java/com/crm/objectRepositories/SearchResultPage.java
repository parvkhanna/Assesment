package com.crm.objectRepositories;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage {
	
	public  SearchResultPage(WebDriver driver)
	{
		PageFactory.initElements(driver , this);
	}
	//to select 1 item from result
	@FindBy(partialLinkText="Apple iPhone 12")
	private WebElement iphone12;
	
	public void iphone() 
	{
		iphone12.click();
	}
	
	@FindBy(xpath= "//span[@class='a-size-medium a-color-base a-text-normal']")
	private List<WebElement> result;
	
	public void PrintList() 
	{
		 
		for (WebElement mt : result) 
		{
			String s= mt.getText();
			System.out.println(s);
		}	
	}

}
