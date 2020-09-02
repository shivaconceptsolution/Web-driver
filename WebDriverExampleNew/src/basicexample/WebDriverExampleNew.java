package basicexample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverExampleNew {
public static void main(String args[])
{
	System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/test/delete_customer.php");
	//driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	//driver.switchTo().alert().accept();
	driver.findElement(By.name("submit")).click();
	
	String s= driver.switchTo().alert().getText();
	System.out.print(s);
	driver.switchTo().alert().accept();
	
	
}
}
