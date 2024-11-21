package Shopperstack_GenericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class WebDriver_Utility {
	Java_Utility java_Utility = new Java_Utility();
	private @Nullable Object ele;
	
	public void selectByValue(WebElement element,String value) {
		Select sel =new Select(element);
		sel.selectByValue(value);
	}
	
	public void webPageScreenShot(WebDriver driver) throws IOException{
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(FrameworkConstants.screenShotPath+java_Utility.dateAndTime()+".png");
		FileHandler.copy(temp, dest);
		
	}
	
  public void WebElementScreenshot(WebElement element) throws IOException{
	  
	  File temp = element.getScreenshotAs(OutputType.FILE);
	  File dest = new File(FrameworkConstants.screenShotPath+java_Utility.dateAndTime()+".png");
	  FileHandler.copy(temp, dest);
  }
  
  public void selectByindex(WebElement element,int index) {
	  Select sel = new Select(element);
	  sel.selectByIndex(index);
  }
  
  public void selectByvisibleText(WebElement element,String visibletext) {
	  Select sel = new Select(element);
	  sel.deselectByVisibleText(visibletext);
  }

  public void deselectByindex(WebElement element,int index) {
	  Select sel =new Select(element);
	  sel.deselectByIndex(index);
  }
  
  public void deselectByvalue(WebElement element,String index) {
	  Select sel = new Select(element);
	  sel.deselectByValue(index);
  }
  
  public void deselectByvisibletext(WebElement element,String visibletext) {
	  Select sel = new Select(element);
	  sel.deselectByVisibleText(visibletext);
  }
  
  public void deselectAll(WebElement element,String deselectall) {
	  Select sel =new Select(element);
	  sel.deselectAll();
	  
	  
  }
  
 public void scrollToelement(WebDriver driver , WebElement element) {
	  Actions a = new Actions(driver);
	  a.scrollToElement(element);
  }
  
  public void javaScript(WebDriver driver , WebElement ele) {
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("arguments[0].scrollIntoView(true);",ele);
	  
	  
	  
  }

//public void takewebPagescreenShot(WebDriver driver) {
	//JavascriptExecutor js = (JavascriptExecutor)driver;
	  //js.executeScript("arguments[0].scrollIntoView(true);",ele);
}


	  
	



	



  

  



	  
	  
