package basePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import actiondriver.Action;
import io.github.bonigarcia.wdm.WebDriverManager;
import utility.TimeUtils;



public class BaseAMZNclass { 
public static Properties prop= new Properties();
public static WebDriver driver;

//step 1
public BaseAMZNclass() {
	try {
		
		FileInputStream file=new FileInputStream("C:\\Users\\hbahn\\eclipse-workspace\\Amazon\\src\\test\\java\\environmentvariables\\Config.properties");
		
		prop.load(file);
	}
	catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	
	catch(IOException a) {
		a.printStackTrace();
	}}
//step 2

public static void initiation() {
//WebDriverManager.chromedriver().setup();
	String browsername= prop.getProperty("browser");
	
	if(browsername.equals("Firefox")) {
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		driver= new FirefoxDriver();
	}
	
	else if(browsername.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hbahn\\Desktop\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS );
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
	driver.get(prop.getProperty("url"));
	
	  
	}}
