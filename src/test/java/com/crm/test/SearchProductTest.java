package com.crm.test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.amazon.genericUtility.BaseClass;
import com.crm.objectRepositories.AddToCartPage;
import com.crm.objectRepositories.HomePage;
import com.crm.objectRepositories.SearchResultPage;
import com.crm.objectRepositories.ShoppingCartPage;


/**
 * 1. Search for a product. Verify the list.
2. Add a product to the cart. Verify that the added product is in the cart.
3. Increase the number of items in the cart to 10. Verify that the total price changed.
4. Remove a product from the cart. Verify the change.
 * @author Asus
 *
 */
public class SearchProductTest extends BaseClass {
	
	@Test (priority = 1)
	public void search(String Option1) throws Throwable, IOException  
	{

		
		HomePage hp=new HomePage(driver);
		SearchResultPage pp = new SearchResultPage(driver);
		
		
		//To select the searchField and type the text
		hp.searTextbox(Option1);
		
		//To click on the search button after entering the text value
		hp.searchBtn();
		
		//method to print list of result
		pp.PrintList();
	}
		
		@Test (priority = 2)
		public void AddProduct()
		{
			SearchResultPage pp = new SearchResultPage(driver);
		
		//to select and click on 1 option from the result list
		pp.iphone();
		}
		
		
		@Test (priority = 3)
		public void addtoCart() throws InterruptedException
		{
			
		AddToCartPage acp = new AddToCartPage(driver);
		
		//click on add to cart button on result page 
		acp.addtocart();
		
		//To verify the product is added to cart 
		acp.verification();
		
		//click on cart option 
		acp.clickOnCart();
		
		ShoppingCartPage sp = new ShoppingCartPage(driver);
		//to select quantity button 
		sp.qtybtn();
		
		sp.qtyValue();
		
	    sp.updatebtn();
		
	    //To delete the added product from cart
	    Thread.sleep(2000);
		sp.deletebtn();
		}
		
	}


