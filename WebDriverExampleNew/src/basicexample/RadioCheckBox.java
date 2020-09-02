package basicexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioCheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe"); 
	     WebDriver driver = new ChromeDriver();  
	     driver.get("https://www.facebook.com/");
	     driver.manage().window().maximize();
	     //driver.findElement(By.name("r1")).click();
	    // driver.findElement(By.cssSelector("input[value=FeMale]")).click();
	     
	     driver.findElement(By.cssSelector("input[value='-1']")).click();
	  Select val = new Select(driver.findElement(By.name("preferred_pronoun")));
	  val.selectByIndex(2);
	  
	  WebElement tr = driver.findElement(By.name("custom_gender"));
	  tr.sendKeys("Transgender");
	     //  for(int i=0;i<2;i++)
	    //{
	    //	driver.findElement(By.cssSelector("input[value=C]")).click();
		//     System.out.print(driver.findElement(By.cssSelector("input[value=C]")).isSelected());
	   //  driver.findElement(By.cssSelector("input[value=CPP]")).click();
	     //System.out.print(driver.findElement(By.cssSelector("input[value=CPP]")).isSelected());
	  ///  }

	}

}
