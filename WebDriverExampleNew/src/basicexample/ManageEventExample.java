package basicexample;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;
public class ManageEventExample {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe"); 
		  WebDriver driver = new ChromeDriver();  
		  driver.get("http://shivaconceptsolution.com/ims/");
		  WebElement ele = driver.findElement(By.name("email"));
		  Actions ac = new Actions(driver);
		  Action obj = ac.moveToElement(ele).keyDown(ele,Keys.SHIFT).sendKeys("abc").doubleClick().contextClick().build();
		  obj.perform();
		  

	}

}
