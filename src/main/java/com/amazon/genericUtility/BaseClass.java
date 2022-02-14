package com.amazon.genericUtility;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import com.crm.genericUtilities.DataProviderUtility;
import com.crm.genericUtilities.FileUtility;
import com.crm.genericUtilities.WebDriverUtility;

public class BaseClass {
	
	public WebDriver driver;
	//DataProviderUtility dp = new DataProviderUtility();
	WebDriverUtility wd  = new WebDriverUtility();
	FileUtility fis = new FileUtility();
	
	@BeforeClass
	public void openBrowser() throws IOException 
	{
		String browsername = fis.getProppertyKeyValue("browser");
		String url = fis.getProppertyKeyValue("url");
		
		driver = wd.openBrowser(browsername);
		wd.implcitlyWait(driver, 10);
		driver.get(url);
		String Title = driver.getTitle();
		System.out.println(Title);

	}

	/*
	 * @DataProvider public Object[][] getTestData() throws Throwable { Object data
	 * [][] = DataProviderUtility.getExcelData(); return data; }
	 * 
	 */	/**
	 * Description: this method to close the application
	 */
	@AfterClass
	public void closeApp() {
		driver.quit();
		System.out.println("close the application");
	}
}
