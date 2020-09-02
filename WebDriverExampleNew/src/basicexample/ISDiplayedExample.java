package basicexample;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ISDiplayedExample {

	public static void main(String[] args) {
		try
		{
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://shivaconceptsolution.com/test.html");
	
		if(driver.findElement(By.name("txt223")).isDisplayed())
	{
		System.out.print("Element is present");
	}
	}
	catch(Exception ex)
	{
		System.out.println("Element not present");
	}
	}

}
