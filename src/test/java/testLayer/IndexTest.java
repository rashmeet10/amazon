package testLayer;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseAMZNclass;
import pompackage.pomIndex;

public class IndexTest extends BaseAMZNclass{
pomIndex index;
	
	@BeforeMethod
	public void initsetup() {
		initiation();
}

   @Test
   public void verifyAccandLists() throws Throwable {
	   index= new pomIndex();
	   boolean result=index.validateAccandLists();
	   Assert.assertTrue(result);
	   }
	
   @Test
   public void testMouseOver() throws Throwable {
	   index.mouseOverMethod();
   }
   
   @Test
   public void SigninTest() {
	   
   }
   
   @Test
   public void testTitle() {
	 String title=index.Title();  
   }
   
   @Test
   public void VerifysearchProduct() throws Throwable {
	   index.searchProduct("tops");
   }
   @AfterMethod
   public void close () {
   	driver.quit();
   }
	
	
} 