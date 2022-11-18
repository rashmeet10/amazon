   package testLayer;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseAMZNclass;
import pompackage.PomLogin;
import pompackage.PomLoginpage;
import pompackage.pomIndex;

public class LoginTest extends BaseAMZNclass{
	PomLogin Log;
	PomLoginpage Login;
	pomIndex index;
	public LoginTest() {
		super();
		 
	}
	
@BeforeMethod
	public void initsetup() {
		initiation(); 
	 
}
@Test
public void Title() {
	
	 Log=new PomLogin();
	String actTitle= Log.getProjectTitle();
	Assert.assertEquals(actTitle, "Amazon Sign In");
}

@Test
public void signin() throws Throwable {
 
	index= new pomIndex();
	Login=Log.typeemail(prop.getProperty("username"));
	String actualURL=Login.getCurrentURL();
	String expectedURL="https://www.amazon.ca/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2Fgp%2Fcss%2Fhomepage.html%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=caflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&";
	Assert.assertEquals(actualURL, expectedURL);
}


@AfterMethod
public void close () {
	driver.quit();
}
}
