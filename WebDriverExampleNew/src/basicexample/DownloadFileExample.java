package basicexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFileExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe"); 
		  WebDriver driver = new ChromeDriver();  
		  driver.get("http://demo.guru99.com/test/yahoo.html");
		  WebElement ele = driver.findElement(By.id("messenger-download"));
		  String path = ele.getAttribute("href");
		  String command = "cmd /c C:\\wget.exe -P D: --no-check-certificate " + path;
		  try
		  {
			 Process exec = Runtime.getRuntime().exec(command);
			// int e = exec.waitFor();
			  
		  }
		  catch(Exception ex)
		  {
			  System.out.print(ex.getMessage().toString());
		  }

	}

}
