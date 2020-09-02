package basicexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookReg {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        String fName= "abc";
        String lName="xyz";
        String mobNum="9812312222";
        String pwd = "12345";
		// Open FaceBook
		driver.get("http://facebook.com");

		// Enter First Name
		driver.findElement(By.name("firstname")).sendKeys(fName);

		// Enter Last Name
		driver.findElement(By.name("lastname")).sendKeys(lName);

		// Enter Mobile Number
		driver.findElement(By.name("reg_email__")).sendKeys(mobNum);

		// Enter Password
		driver.findElement(By.name("reg_passwd__")).sendKeys(pwd);

		// Select Birth Date
		Select dd=new Select(driver.findElement(By.name("birthday_day")));
		dd.selectByValue("22");

		// Select Birth Month
		Select mm=new Select(driver.findElement(By.name("birthday_month")));
		mm.selectByValue("3");

		// Select Birth Year
		Select yy=new Select(driver.findElement(By.name("birthday_year")));
		yy.selectByValue("1992");

		// Select Gender
		driver.findElement(By.cssSelector("input[value='2']")).click();

		// Click Sign Up
		driver.findElement(By.name("websubmit")).click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Close Test
		//driver.close();

	}

}
