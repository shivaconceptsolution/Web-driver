package basicexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseOverActionExample {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe"); 
		 WebDriver driver = new ChromeDriver();  
		 driver.get("http://www.newtours.demoaut.com/");
		 WebElement ele = driver.findElement(By.xpath("//html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]"));
		 System.out.println(ele.getCssValue("background-color"));
		 
		 Actions ac = new Actions(driver);
		 Action ac1 = ac.moveToElement(ele).build();
		 ac1.perform();
		 System.out.println(ele.getCssValue("background-color"));
		 
		  

	}

}
