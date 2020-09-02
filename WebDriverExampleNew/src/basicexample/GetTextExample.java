package basicexample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://shivaconceptsolution.com/");
		List<WebElement> ele = driver.findElements(By.tagName("img"));
        for(WebElement o:ele)
        {
    	   String s=o.getAttribute("src");
    	   int bg = s.lastIndexOf("/");
    	   String img = s.substring(bg+1);
    	   System.out.println(img);
        }
	}

}
