package pompackage;

import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAMZNclass;

public class PomYourAddress extends BaseAMZNclass{
	public PomYourAddress() {
		PageFactory.initElements(driver, this);
	}
	
}
