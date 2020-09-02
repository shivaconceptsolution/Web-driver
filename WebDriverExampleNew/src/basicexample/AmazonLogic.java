package basicexample;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AmazonLogic {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Open Amazon
		driver.get("https://www.amazon.in/");

		// Enter LED in search box
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("LED");

		// Click search button
		driver.findElement(By.xpath("(//input[@class='nav-input'])[1]")).click();

		List<WebElement> values=driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		String beforecomma ;
		String aftercomma;
		int f;
		   int max=0;
		    for(int i=0;i<values.size();i++)
		    { 
		    String value = values.get(i).getText();
		    System.out.println(value);
		    if(value!="")
		    {
		    if(value.indexOf(",")!=-1)
		    {
		     beforecomma = value.substring(0,value.indexOf(","));
		     aftercomma = value.substring(value.indexOf(",")+1);
		     f = Integer.parseInt(beforecomma+aftercomma);
		     System.out.println(f);
		     if(max<f)
		     {
		    	 max=f;
		     }
		     
		    }
		    }
		    }
		    System.out.println("Maximum price is "+max);
		try {
		Thread.sleep(5000);
		} catch (InterruptedException e) {
		e.printStackTrace();
		}

		// Close Test
		driver.close();

	}

}
