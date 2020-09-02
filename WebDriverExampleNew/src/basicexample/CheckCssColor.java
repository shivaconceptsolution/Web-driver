package basicexample;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckCssColor {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/demo1.html");
		WebElement ele = driver.findElement(By.name("txt1"));
		Point p= ele.getLocation();
		System.out.println("X:"+ p.x +" Y:="+p.y);
		System.out.println(driver.hashCode());
		String s = "ram";
		String s1 = "ram";
		String s2= new String("ram");
		System.out.println(s.hashCode() +","+s1.hashCode()+","+s2.hashCode());
		
		/*String bgcolor = ele.getCssValue("background-color");
		String fsize = ele.getCssValue("font-size");
		String width = ele.getCssValue("width");
		String height	 = ele.getCssValue("height");
		System.out.println("background-color"+bgcolor);
		System.out.println("font-size "+fsize);
		System.out.println("width is  "+width);
		System.out.println("height is  "+height);*/
	}

}
