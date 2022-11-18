package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import actiondriver.Action;
import basePackage.BaseAMZNclass;

public class PomOrderHistory extends BaseAMZNclass {

	@FindBy(linkText= "Buy Again") WebElement BuyAgain;
	@FindBy(linkText="Not Yet Shipped") WebElement NotYetShipped;
	@FindBy(linkText="Not Yet Shipped") WebElement CancelledOrders;
	
	public PomOrderHistory() {
		PageFactory.initElements(driver, this);
	}
	  public  PomBuyAgain clckbuyAgn( ) throws Throwable {
		   Action.click(driver, BuyAgain);
		   return new PomBuyAgain(); 	       		
}
	  public  PomBuyAgain clckNotShppd( ) throws Throwable {
		   Action.click(driver, NotYetShipped);
		   return new PomBuyAgain(); 	       		
}
	  public  PomBuyAgain clckCnclOrder( ) throws Throwable {
		   Action.click(driver, CancelledOrders);
		   return new PomBuyAgain(); 	       		
}
	  
}