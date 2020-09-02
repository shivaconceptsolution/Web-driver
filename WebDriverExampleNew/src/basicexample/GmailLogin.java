package basicexample;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class GmailLogin {
	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe"); 
		     WebDriver driver = new ChromeDriver();  
		     driver.get("https://www.gmail.com/");
		     WebElement txtname = driver.findElement(By.name("identifier"));
		     txtname.sendKeys("vermabeer1997@gmail.com");
		  
		     WebElement btn = driver.findElement(By.className("CwaK9"));
		     btn.click();
		     driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
		     WebElement txtpass = driver.findElement(By.name("password"));
		     WebDriverWait wait = new WebDriverWait(driver, 20);
		     wait.until(ExpectedConditions.elementToBeClickable(txtpass));
		     txtpass.sendKeys("asdsad62a");
		     //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		     driver.findElement(By.id("passwordNext")).click();

		 }
}
