package pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import actiondriver.Action;
import basePackage.BaseAMZNclass;

public class pomIndex extends BaseAMZNclass{
	@FindBy(id= "nav-global-location-data-modal-action") WebElement AccandLists;
    @FindBy (id ="twotabsearchtextbox") WebElement SearchProductBox;    
    @FindBy (id ="nav-search-submit-button") WebElement SearchBtn;
    @FindBy (xpath="//*[@id=\"nav-flyout-ya-signin\"]/a/span") WebElement SignInBtn;
    public pomIndex() {
	PageFactory.initElements(driver, this);
}
public PomLogin mouseOverMethod() throws Throwable {
	Action.mouseOverElement(driver);
	Action.click(driver, SignInBtn);
	return new PomLogin();
}

public boolean validateAccandLists() throws InterruptedException  {
	return Action.isDisplayed(driver, AccandLists);
   
     }
public PomYourAccount Title() {
	Action.click(driver, AccandLists);
    return new PomYourAccount();
}


public PomSearchResult searchProduct(String productName) throws Throwable {
	Action.type(SearchProductBox, productName);
	Action.click(driver, SearchBtn);
	return new PomSearchResult();
}
}