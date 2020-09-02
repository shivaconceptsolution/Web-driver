package basicexample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWidthandHeight {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://shivaconceptsolution.com/test.html");
		List<WebElement> ele = driver.findElements(By.tagName("input"));
        System.out.println("Total element is "+ele.size());
		int maxw=0,maxh=0;
        for(WebElement o:ele)
        {
          if(o.getAttribute("type").equals("text"))
          {
    	  int width=o.getSize().getWidth();
    	   int height=o.getSize().getHeight();
    	   if(maxw<width)
    		   maxw=width;
    	   if(maxh<height)
    		   maxh=height;
    	 System.out.println(width+" "+height);
          }
        }
      System.out.println("max width is "+maxw+" Max height is "+maxh);

	}

}
