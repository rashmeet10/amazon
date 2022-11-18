package testLayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import basePackage.BaseAMZNclass;
import pompackage.PomLogin;
import pompackage.PomLoginpage;

public class LoginpageTest extends BaseAMZNclass {
	PomLogin Log;
	PomLoginpage Login; 
	public LoginpageTest() {
		super();
		 
	}
	@BeforeMethod
	public void initsetup() {
		initiation(); 
	 
}
	public void signin() {
		Log= new PomLogin(); 
		Login=Log.
	}
	
	
	
	@AfterMethod
	public void close () {
		driver.quit();
	}
	}


