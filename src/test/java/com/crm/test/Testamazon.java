package com.crm.test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.amazon.genericUtility.BaseClass;
import com.crm.genericUtilities.DataProviderUtility;
import com.crm.objectRepositories.HomePage;
import com.crm.objectRepositories.SearchResultPage;

public class Testamazon extends BaseClass
{

	@DataProvider(name="SearchData")
	public String [][] getData() throws IOException
	{
		//get the data from excel
		String path="C:\\Users\\Asus\\eclipse-workspace\\AmazonAssesment\\testData\\TestData.xlsx";
		DataProviderUtility dp=new DataProviderUtility(path);
		
		int totalrows=dp.getRowCount("Sheet1");
		int totalcols=dp.getCellCount("Sheet1",1);	
				
		String loginData[][]=new String[totalrows][totalcols];
			
		
		for(int i=1;i<=totalrows;i++) //1
		{
			for(int j=0;j<totalcols;j++) //0
			{
				loginData[i-1][j]=dp.getCellData("Sheet1", i, j);
			}
				
		}
		
		return loginData;
	}
	
	@Test(dataProvider="SearchData",dataProviderClass=Testamazon.class)
	public void test(String Option1) throws Throwable 
	{
	
		HomePage hp = new HomePage(driver);
		SearchResultPage pp = new SearchResultPage(driver);
		
		
		
		hp.searTextbox(Option1);
		hp.searchBtn();
	}
	
}


