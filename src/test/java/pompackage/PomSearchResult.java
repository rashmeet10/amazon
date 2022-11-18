package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import actiondriver.Action;
import basePackage.BaseAMZNclass;

public class PomSearchResult extends BaseAMZNclass {

	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div[1]/div/span/a/div/div[2]/img") 
	WebElement productResult ;
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[68]/div/div/span/a[3]   ")
	WebElement NextPage ;
	@FindBy(xpath="//*[@id=\"a-autoid-0-announce\"]")
	WebElement SortByButton;
	
	public PomSearchResult() {
		PageFactory.initElements(driver, this);
	}
	public boolean isProductAvailable() throws InterruptedException {
		return Action.isDisplayed(driver, productResult);
	}
	
	public PomSearchResult productsPerPage() throws Throwable {
		Action.selectByIndex(NextPage, 60);
	
		Action.click(driver, NextPage); 
		return new PomSearchResult();
		
		public void pagination() {
			handlingPagination.
		}
		public void sorting() {
			Action.click(driver, SortByButton);
			
		}
}}
