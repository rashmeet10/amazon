package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import actiondriver.Action;
import basePackage.BaseAMZNclass;



public class PomYourAccount extends BaseAMZNclass {

	@FindBy(xpath="//*[@id=\"a-page\"]/div[2]/div/div[2]/div[1]/a/div/div/div/div[2]/h2") WebElement YourOrders;
	
	public PomYourAccount() {
		
		PageFactory.initElements(driver, this);
}
	public PomOrderHistory clickbtn()
	{
		Action.click(driver, YourOrders); 
		return new PomOrderHistory();
}}
