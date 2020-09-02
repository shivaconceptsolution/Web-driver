package basicexample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllHyperLink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.videoblocks.com/collections/winter-video-footage");
		List<WebElement> ele  = driver.findElements(By.tagName("video"));
		System.out.print("Number of video is "+ele.size());
		for(WebElement o:ele)
		{
			System.out.println(o.getAttribute("poster"));
		}
		List<WebElement> ele1  = driver.findElements(By.tagName("a"));
		System.out.print("Number of hyperlink is "+ele1.size());
		for(WebElement o:ele1)
		{
			System.out.println(o.getAttribute("href"));
		}
		List<WebElement> ele2  = driver.findElements(By.tagName("p"));
		System.out.print("Number of paragraph is "+ele2.size());
		for(WebElement o:ele2)
		{
			System.out.println(o.getText());
		}
	}

}
