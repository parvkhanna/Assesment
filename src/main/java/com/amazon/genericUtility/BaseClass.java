package com.amazon.genericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.crm.genericUtilities.WebDriverUtility;

public class BaseClass {
	
	public WebDriver driver;
	WebDriverUtility webdriver  = new WebDriverUtility();
	String url = "https://www.amazon.in";
	
	@BeforeClass
	public void openApp() throws Throwable {
	
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			webdriver.implcitlyWait(driver, 10);
			
		}
	
	
	/**
	 * Description: this method to close the application
	 */
	@AfterClass
	public void closeApp() {
		driver.quit();
		System.out.println("close the application");
	}
}
