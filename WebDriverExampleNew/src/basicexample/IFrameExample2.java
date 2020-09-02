package basicexample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameExample2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe"); 
	     WebDriver driver = new ChromeDriver();  
	     driver.get("file:///D:/iframeexample.html");
	     driver.manage().window().maximize();
	     driver.switchTo().frame(1);
	     driver.findElement(By.xpath("//html/body/div/header/div[1]/nav/div/ul/li[3]/a")).click();

	}

}
