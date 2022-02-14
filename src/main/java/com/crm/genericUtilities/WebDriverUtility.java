package com.crm.genericUtilities;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 
 * @author Asus
 *
 */
public class WebDriverUtility 
{
	
	
	/**
	 * this generic method is used to open a empty browser.
	 * pass chrome/firefox as argument
	 */
	public WebDriver openBrowser(String browser)
	{		
		WebDriver driver=null;
		if(browser.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else
		{
			driver = new InternetExplorerDriver();
		}
		return driver;
	}
	
	/**
	 * This is the implicitly wait generic method.
	 * @param driver
	 * @param time is used here in seconds
	 */
	public void implcitlyWait(WebDriver driver, int time)
	{
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	
	/**
	 * this generic method is used for explicitly wait.
	 * @param driver
	 * @param locator should be entered as per given syntax like By.Locator_Type("Tag_Identifier").example:- By.className("dvHeaderText")
	 * @param time is used here in seconds
	 */
	public void explicitlyWait(WebDriver driver, int time, WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	/**
	 * This is a generic method is used to switch windows
	 * @param driver
	 * @param textSearch
	 */
	public void windowSwitch(WebDriver driver, String textSearch)
	{
		Set<String> wh = driver.getWindowHandles();
		Iterator<String> it = wh.iterator();
		while(it.hasNext())
		{
			String winId = it.next();
			String title = driver.switchTo().window(winId).getTitle();
			if(title.contains(textSearch))
			{
				break;
			}
		}
	}
	
	/**
	 * this is a generic method and this method is used for mouse hover on specific element
	 * @param driver
	 * @param locator
	 */
	public void mouseHover(WebDriver driver, WebElement element)
	{
		Actions a = new Actions(driver);
		WebElement button = element;
		a.moveToElement(button).click().perform();
	}
	
	/**
	 * this is a generic method and this method will give text of any web element from page
	 * @param driver
	 * @param locator should be entered as per given syntax like By.Locator_Type("Tag_Identifier").example:- By.className("dvHeaderText")
	 * @return
	 */
	public String getTextElement(WebDriver driver, WebElement element)
	{
		String actualOrgName = element.getText();
		return actualOrgName;
	}
	
	/**
	 * this generic method is used to get title of any current webpage.
	 * @param driver
	 * @return it will return web page title as string.
	 */
	public String getPageTitle(WebDriver driver)
	{
		String pageTitle = driver.getTitle();
		return pageTitle;
	}

}
