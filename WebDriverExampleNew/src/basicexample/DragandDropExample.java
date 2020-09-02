package basicexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragandDropExample {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe"); 
		  WebDriver driver = new ChromeDriver(); 
		  driver.manage().window().maximize();
		  driver.get("https://jqueryui.com/resizable/");
	      WebDriverWait wait = new WebDriverWait(driver, 5);
		  wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(".demo-frame")));
		 // Thread.sleep(4000);
		  try
		  {
		  WebElement resizeableElement = driver.findElement(By.xpath("//html/body/div/div[3]"));
		  if (resizeableElement.isDisplayed()) {
				Actions action = new Actions(driver);
				action.clickAndHold(resizeableElement).moveByOffset(50,50).release().build().perform();
			} else {
				System.out.println("Element was not displayed to drag");
			}
		  }
		  catch(Exception ex)
		  {
			  System.out.println(ex.getMessage().toString());
		  }
       
	}

}
