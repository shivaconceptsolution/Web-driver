package basicexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe"); 
		  WebDriver driver = new ChromeDriver();  
		  driver.get("http://demo.guru99.com/test/upload/");
		  driver.findElement(By.name("uploadfile_0")).sendKeys("D:/MyData.txt");
		  driver.findElement(By.className("field_check")).click();
		  driver.findElement(By.id("submitbutton")).click();
		  

	}

}
