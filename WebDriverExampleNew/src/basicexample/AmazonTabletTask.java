package basicexample;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AmazonTabletTask {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Open Amazon
		driver.get("https://www.amazon.in/");

		// Click on Hamburger menu
		driver.findElement(By.id("nav-hamburger-menu")).click();
		Thread.sleep(2000);
		// Click on Mobile, Computer menu
		driver.findElement(By.xpath("//a[@data-menu-id='7']")).click();
		Thread.sleep(2000);

		// Click on Tablets
		driver.findElement(By.xpath("//a/div[contains(text(),'Tablets')]")).click();
		Thread.sleep(2000);
		
		// Click on 16 GB CheckBox
		driver.findElement(By.name("s-ref-checkbox-8561113031")).click();
		Thread.sleep(2000);
		List<WebElement> priceList16Gb=driver.findElements(By.xpath("//span[@class='a-price-whole']"));

		String beforeComma, afterComma;
		  int finalVal, max=0;
		      for(int i=0;i<priceList16Gb.size();i++)
		      {
		      String value = priceList16Gb.get(i).getText();
		      if(value!="")
		      {
		      if(value.indexOf(",")!=-1)
		      {
		       beforeComma = value.substring(0,value.indexOf(","));
		       afterComma = value.substring(value.indexOf(",")+1);
		       finalVal = Integer.parseInt(beforeComma+afterComma);
		       System.out.println(finalVal);
		       if(max<finalVal)
		       {
		        max=finalVal;
		       } 
		      }
		     }
		   }
		      System.out.println("Maximum price for 16 GB := "+max);

		      // UnCheck 16 GB CheckBox
		      Thread.sleep(6000);
		      driver.navigate().back();      
		      driver.findElement(By.name("s-ref-checkbox-8561114031")).click();
		     
		      List<WebElement> priceList32Gb=driver.findElements(By.xpath("//span[@class='a-price-whole']"));

		beforeComma="";
		afterComma="";
		finalVal=0;
		max=0;
		      for(int i=0;i<priceList32Gb.size();i++)
		      {
		      String value = priceList32Gb.get(i).getText();
		      if(value!="")
		      {
		      if(value.indexOf(",")!=-1)
		      {
		       beforeComma = value.substring(0,value.indexOf(","));
		       afterComma = value.substring(value.indexOf(",")+1);
		       finalVal = Integer.parseInt(beforeComma+afterComma);
		       System.out.println(finalVal);
		       if(max<finalVal)
		       {
		        max=finalVal;
		       } 
		      }
		     }
		   }
		      System.out.println("Maximum price for 32 GB := "+max);
		 
		try {
		Thread.sleep(5000);
		} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}

		// Close Test
		driver.close();
	}

}
