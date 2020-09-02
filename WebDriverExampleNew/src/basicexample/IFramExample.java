package basicexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFramExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe"); 
	     WebDriver driver = new ChromeDriver();  
	     driver.get("http://demo.guru99.com/test/guru99home");
	     driver.manage().window().maximize();
	     driver.switchTo().frame("a077aa5e");
	     driver.findElement(By.xpath("//html/body/a/img")).click();

	}

}
