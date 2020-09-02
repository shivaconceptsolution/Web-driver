package basicexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxExampleInWebDriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver;  //WebDriver is the interface and driver is the reference
		driver = new ChromeDriver(); //driver reference will be intialized by ChromeDriver Class
		driver.get("http://www.shivaconceptsolution.com/test.html");
	    driver.findElement(By.cssSelector("input[value=hello]")).clear();
		
		/*Select s = new Select(driver.findElement(By.name("c[]")));
		//s.selectByIndex(1);
		//s.selectByIndex(3);
		//s.selectByVisibleText("Web Driver");
		//s.selectByVisibleText("TESTNG");
		s.selectByValue("Web Driver");
		s.selectByValue("TestNG");
		s.deselectByValue("TestNG");*/

	}

}
