package basicexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptConfirm {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe"); 
		  WebDriver driver = new ChromeDriver();  
		  driver.get("file:///D:/alertexample.html");
		  driver.findElement(By.cssSelector("input[value=PROMPT]")).click();
		  //driver.switchTo().alert().sendKeys("hello");
		  String data1=  driver.switchTo().alert().getText();
		  System.out.print(data1);
		  driver.switchTo().alert().accept();
		  driver.findElement(By.cssSelector("input[value=Confirm]")).click();
		  //driver.switchTo().alert().sendKeys("hello");
		  String data2=  driver.switchTo().alert().getText();
		  System.out.print(data2);
		  driver.switchTo().alert().accept();
		  

	}

}
