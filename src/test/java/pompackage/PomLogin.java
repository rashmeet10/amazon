package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import actiondriver.Action;
import basePackage.BaseAMZNclass;

public class PomLogin extends BaseAMZNclass {
 // object repository
	@FindBy(id="ap_email") WebElement email;
	@FindBy(id="continue") WebElement Continuebtn;
	
	
	//to initiate page elements
	public PomLogin() {
	
		PageFactory.initElements(driver, this);
}
	public PomLoginpage typeemail(String  em) throws Throwable {
		Action.selectBySendkeys(email, em);
	   Action.click(driver, Continuebtn); 
       return new PomLoginpage();
	
}
	public String getProjectTitle() {
		String myProjectTitle1=driver.getTitle();
		return myProjectTitle1;
	} 

}
