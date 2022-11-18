package actiondriver;


import java.time.Duration;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import basePackage.BaseAMZNclass;

public class Action extends BaseAMZNclass {

	public static void scrollByVisibilityOfElement(WebDriver driver, WebElement ele ) throws InterruptedException {
      JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();", ele);

}

public static boolean click(WebDriver driver, WebElement locatorName)  { 

     Actions act = new Actions(driver);
     act.moveToElement(locatorName).click().build().perform();
	return false;

}
public static boolean findElement(WebDriver driver, WebElement ele) throws InterruptedException  {
   boolean flag = false;
   try {
	   ele.isDisplayed();
	   flag=true;
	  
   } catch (Exception e) {
	  //System.out.println("location not found:" + locatorName); 
	   flag = false;
   } finally {
	   if (flag) {
		   System.out.println("Successfully found element at");
	   }else {
		   System.out.println("Unable to locate element at");
	   }
	   }
   return flag;
		   
	   }
   
	
	

public static boolean isDisplayed(WebDriver driver, WebElement ele) throws InterruptedException  {
 boolean flag = false;
 flag = findElement(driver,ele);
 if (flag) {
	 flag= ele.isDisplayed();
	 if (flag) {
		 System.out.println("The element is Displayed");
		 
	 } else {
		 System.out.println("The element is not Displayed");
	 }
 } else {
	 System.out.println("Not Displayed");
 }
 return flag;
 }

public static boolean isSelected(WebDriver driver, WebElement ele) throws InterruptedException  {
	 boolean flag = false;
	 flag = findElement(driver, ele);
	 if (flag) {
		 flag= ele.isSelected();
		 if (flag) {
			 System.out.println("The element is Selected");
			 
		 } else {
			 System.out.println("The element is not Selected");
		 }
	 } else {
		 System.out.println("Not Selected");
	 }
	 return flag;
	 }
public static boolean isEnabled(WebDriver driver, WebElement ele) throws InterruptedException  {
	 boolean flag = false;
	 flag = findElement(driver, ele);
	 if (flag) {
		 flag= ele.isSelected();
		 if (flag) {
			 System.out.println("The element is Enabled");
			 
		 } else {
			 System.out.println("The element is not Enabled");
		 }
	 } else {
		 System.out.println("Not  Enabled");
	 }
	 return flag;
	 }

public static boolean type(WebElement ele, String text)throws Throwable {
  boolean flag = false;
  try {
	  flag = ele.isDisplayed();
	  ele.clear();
	  ele.sendKeys(text);
	  
	  flag=true;
  } catch (Exception e) {
	  System.out.println("location not found");
	  flag = false;
  } finally {
	  if (flag) {
		  System.out.println("Successfully entered value");
	  }
	  else {
		  System.out.println("Unable to enter value");
	  }
  }
  return flag;
  
}
public static boolean selectBySendkeys(WebElement ele, String value)throws Throwable {
	  boolean flag = false;
	  try {
          ele.sendKeys(value);
          flag=true;
          return true;
} catch (Exception e) {
	    return false;
}   finally {
	if (flag) {
		 System.out.println("Select value from the DropDown"); 
	} else {
		System.out.println("Not Selected value from the DropDown"); 
	// throw new elementNotFoundException("","","")
		}
	
	}}
public static boolean selectByIndex(WebElement element, int index)throws Throwable {
	  boolean flag = false;
	  try {
		  Select s= new Select(element);
		  s.selectByIndex(index);
		  flag= true;
		  return true;
	  } catch (Exception e) {
		  return false;
	  } finally {
		  if (flag) {
			  System.out.println("Option selected by Index");
		  } else {
			  System.out.println("Option not selected by Index");
		  }
		  
	  }
	  }
public static boolean selectByValue(WebElement element, String value)throws Throwable {
	  boolean flag = false;
	  try {
		  Select s= new Select(element);
		  s.selectByValue(value); 
		  flag= true;
		  return true;
	  } catch (Exception e) {
		  return false;
	  } finally {
		  if (flag) {
			  System.out.println("Option selected by Value");
			  
		  } else {
			  System.out.println("Option not selected by Value"); 
		  }
 	  }}

public static boolean selectByVisibleText(WebElement ele, String visibletext)throws Throwable {
	  boolean flag = false;
	  try {
		  Select s= new Select(ele);
		  s.selectByValue(visibletext); 
		  flag= true;
		  return true;
	  } catch (Exception e) {
		  return false;
	  } finally {
		  if (flag) {
			  System.out.println("Option selected by Visible text");
			  
		  } else {
			  System.out.println("Option not selected by Visible text"); 
		  }
	  }}

public static boolean mouseHoverByJavaScript(WebElement locator)throws Throwable {
	  boolean flag = false;
	  try {
		  WebElement mo = locator;
		  String javaScript = "var evObj = document.createEvent('MouseEvent')"
	  + "evObj.initMouseEvent(\"mouseover\",true, false, window)"	  
	  + "arguments[0].dispatchEvent(evObj);";
		  JavascriptExecutor js =(JavascriptExecutor) driver;
		  js.executeScript(javaScript, mo);
	  flag = true;
	  return true;
	  }
	  catch (Exception e) {
		   return false;
	  } finally {
		  if (flag) {
			  System.out.println("MouseOver action is performed");
		  } else {
			  System.out.println("MouseOver action is not performed");
		  }
	  }}

public static boolean JSClick(WebDriver driver, WebElement ele) throws Throwable {
	boolean flag = false;
	try {
		//WebElement element = driver.findElement(locator);
		JavascriptExecutor  executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", ele);
	flag = true;
	}
	
	catch (Exception e) {
		throw e;
	} finally {
		if (flag) {
			System.out.println("Click action is performed");
			
		} else if (!flag) {
			System.out.println("Click action is not performed");
		}
	}
	return flag;
}


public static boolean switchToFrameByIndex(int index)throws Throwable {
	
	boolean flag = false;
	  
	  try {
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
		  driver.findElement(By.xpath("//div[contains(text(),'COMPOSE')]")).click();
		  driver.switchTo().frame(index); 
		  flag= true;
		  return true;
	  } catch (Exception e) {
		  return false;
	  } finally {
		  if (flag) {
			  System.out.println("Frame with index \"" + index + "\" is selected");
			  
		  } else {
			  System.out.println("Frame with index \"" + index + "\" is not selected"); 
		  }
	  }}

public static boolean switchToFrameById(String idValue) throws Throwable {
	boolean flag= false;
	try {
		driver.switchTo().frame(idValue);
		flag = true;
		return true;
} catch (Exception e) {
	e.printStackTrace();
	return false;
} finally {
	if (flag) {
		 System.out.println("Frame with Id \"" + idValue + "\" is selected");
		  
	  } else  if (!flag) {
		  System.out.println("Frame with Id \"" + idValue + "\" is not selected"); 
}
}
}



public static boolean switchToFrameByName(String nameValue) throws Throwable {
	boolean flag= false;
	try {
		driver.switchTo().frame(nameValue);
		flag = true;
		return true;
} catch (Exception e) {
	e.printStackTrace();
	return false;
} finally {
	if (flag) {
		 System.out.println("Frame with Name \"" + nameValue + "\" is selected");
		  
	  } else if (!flag) {
		  System.out.println("Frame with Name \"" + nameValue + "\" is not selected"); 
	}
}
}

public static boolean switchToDefaultFrame() throws Throwable {
	boolean flag= false;
	try {
		driver.switchTo().defaultContent();
		flag = true;
		return true;
} catch (Exception e) {
	e.printStackTrace();
	return false;
} finally {
	if (flag) {
		 //SuccessReport("SelectFrame","Frame with name is selected");
		  
	  } else if (!flag) {
		  //failureReport("SelectFrame","Frame is not selected"); 
	}
}
}
public static void mouseOverElement(WebDriver driver) throws Throwable {
	boolean flag= false;
	try {
		new Actions(driver).moveToElement((WebElement) driver).build().perform();
		flag = true;
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		if (flag) {
			System.out.println("MouseOver action is performed on");
		} else {
			System.out.println("MouseOver action is not performed on");
		}
	}
}
		  
public static boolean  mouseToElement(WebDriver driver, WebElement ele) {
	boolean flag= false;
	String nameValue = null;
	try {		  
		  
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true);", ele);
	    Actions actions = new Actions(driver);
	    actions.moveToElement(ele).build().perform();	
		  

		driver.switchTo().frame(nameValue);
		flag = true;
		return true;
} catch (Exception e) {
	
	return false;
} finally {
	if (flag) {
		 System.out.println("Frame with Name \"" + nameValue + "\" is selected");
		  
	  } else  if (!flag){
		  System.out.println("Frame with Name \"" + nameValue + "\" is not selected"); 
	}
}  
}

public void  handlingPagination() throws InterruptedException {
	String displayedCount= driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[1]")).getText().split("")[2];      
	WebElement nextButton= driver.findElement(By.className("s-pagination-item s-pagination-next s-pagination-button s-pagination-separator"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,5000);");
	
	List<WebElement> products = driver.findElements(By.xpath("div[@class=\"sg-col-inner\"]//div[@class=\"a-section a-spacing-micro puis-padding-left-micro puis-padding-right-micro\"]//descendant:div[@class=\"a-row a-size-base a-color-secondary\"]//h5//h2[@class=\"a-size-mini a-spacing-none a-color-base s-line-clamp-2\"]//a//span[@class=\"a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal"));
	List<String> productNames = new ArrayList();

    for(WebElement names: products) {
    	productNames.add(names.getText());
    	
    	System.out.println(names.getText());
    }
     
       System.out.println("*****************");
        while(true) {
        	Thread.sleep(2000);
         nextButton.click();
         
         Thread.sleep(3000);
         js.executeScript("window.scrollBy(0,5000);");
         
         Thread.sleep(3000);
         products = driver.findElements(By.xpath("div[@class=\"sg-col-inner\"]//div[@class=\"a-section a-spacing-micro puis-padding-left-micro puis-padding-right-micro\"]//descendant:div[@class=\"a-row a-size-base a-color-secondary\"]//h5//h2[@class=\"a-size-mini a-spacing-none a-color-base s-line-clamp-2\"]//a//span[@class=\"a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal"));
        
         for(WebElement names: products) {
         	productNames.add(names.getText());
         	
            System.out.println(names.getText());
         }
         System.out.println("*****************");
        try {
         nextButton= driver.findElement(By.className("s-pagination-item s-pagination-next s-pagination-button s-pagination-separator"));
        } catch (Exception e) {
        System.out.println("No more products now");
        break;
        }
        }
        System.out.println("*****************");
        System.out.println("My no. of products are:" +productNames.size());
        System.out.println("Total no. of displayed products:" +displayedCount);
}

public void sorting() {
	
	public void sortingPrices() throws InterruptedException{  
		driver.get("URL");
		List<WebElement> table = driver.findElements(By.cssSelector("[class*='data- 
		price']"));
		ArrayList<String> Prices1 = new ArrayList<String>();
		List<Integer> IntList1 = new ArrayList<Integer>();
		for(int i=0;i<table.size();i++){
		Prices1.add(table.get(i).getText().replace("$", "").replace(",", ""));
		}
		System.out.println("prcies are "+Prices1);
		System.out.println("Page 1 consists of " +Prices1.size()+ "  price 
		elements");
		Thread.sleep(3000);

		/*converting string list Prcies1 to integer list */
		for (String s: Prices1){
		    IntList1.add(Integer.valueOf(s));  
		}
		System.out.println("Integerlist1 is "+IntList1);    

		/*Array list named as sortedPrices and passing integer list into it to sort*/
		ArrayList<Integer> sortedPrices = new ArrayList<Integer>(IntList1);
		ArrayList<Integer> sortedPrices = new ArrayList<Integer>(IntList1);
		Collections.sort(sortedPrices);
		System.out.println("Sorted list is "+sortedPrices);
		/*clicking on sort drop down and arranging in ascending order*/  
		Select s = new Select(driver.findElement(By.cssSelector("[id='srp- 
		sortby']")));
		s.selectByValue("1");
		Thread.sleep(5000);
		List<WebElement>table2= driver.findElements(By.cssSelector("[class*='data- 
		price']"));
		List<Integer> IntList2 = new ArrayList<Integer>();
		ArrayList<String> Prices2 = new ArrayList<String>();
		for(int i=0;i<table2.size();i++){
		    Prices2.add(table2.get(i).getText().replace("$", "").replace(",", ""));
		    }
		    System.out.println("price2 are "+Prices2);
		/*converting string list to integer list */
		for (String s1: Prices2){
		    IntList2.add(Integer.valueOf(s1));  
		    }
		    System.out.println("Integer2 list is "+IntList2);  
	
}



public static void implicitWait(WebDriver driver, int i) {
	// TODO Auto-generated method stub
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

public static void pageLoadTimeOut(WebDriver driver, int i) {
	// TODO Auto-generated method stub
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
}
} 
		  
		  
		  
		  
		  
		  
		  
