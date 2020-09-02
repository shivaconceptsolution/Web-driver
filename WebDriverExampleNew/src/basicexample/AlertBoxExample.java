package basicexample;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBoxExample {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe"); 
		  WebDriver driver = new ChromeDriver();  
		  driver.get("http://demo.guru99.com/test/delete_customer.php");
		  WebElement ele = driver.findElement(By.name("cusid"));
		  ele.sendKeys("1001");
		  driver.findElement(By.name("submit")).click();
		  String data = driver.switchTo().alert().getText();
		  driver.switchTo().alert().dismiss();
		  System.out.println(data);
		  try
		  {
		  String data1 = driver.switchTo().alert().getText();
		  driver.switchTo().alert().accept();
		  System.out.println(data1);
		  }
		  catch(NoAlertPresentException ex)
		  {
		  }
		  
		  
		  
		  

	}

}
