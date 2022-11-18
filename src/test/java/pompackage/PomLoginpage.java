package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import actiondriver.Action;
import basePackage.BaseAMZNclass;

public class PomLoginpage extends BaseAMZNclass{

	@FindBy(id="ap_password") WebElement password;
	@FindBy(id="signInSubmit") WebElement Signinbtn;
	@FindBy(id="checkbox")WebElement KeepmeSignedIn;
	public PomLoginpage() {
		PageFactory.initElements(driver, this);
	}
		public pomIndex typepassword (String  pswrd) throws Throwable {
			Action.type(password, pswrd);
			Action.click(driver, Signinbtn);
			Action.isSelected(driver, KeepmeSignedIn);
			return new pomIndex();
			
		}
		public String getCurrentURL() {
			String loginPageURL=driver.getCurrentUrl();
			return loginPageURL; 

		
	}}

