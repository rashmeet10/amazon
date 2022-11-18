package testLayer;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseAMZNclass;
import pompackage.PomSearchResult;
import pompackage.pomIndex;

public class SearchResultTest extends BaseAMZNclass {
pomIndex index;
PomSearchResult searchResult;
	@BeforeMethod
	public void initsetup() {
		initiation();
}
    @Test
	public void productAvailability() throws Throwable {
	index= new pomIndex();
	searchResult=index.searchProduct("t-shirt");
	boolean result=searchResult.isProductAvailable();
	Assert.assertTrue(result);
	}
	
	
	
	
	
	
	
	 @AfterMethod
	   public void close () {
	   	driver.quit();
	   }
		
		
}
