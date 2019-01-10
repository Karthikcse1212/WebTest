package login;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class logintest {

	WebDriver driver;

	@BeforeTest
	public void loginsetup() {
		
		String driverpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", driverpath+ "\\Browserdriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void test() {
		driver.get("https://phptravels.org/clientarea.php");
		driver.findElement(By.name("username")).sendKeys("karthikbtc1212@gmail.com");
		driver.findElement(By.name("password")).sendKeys("abcd123");
		driver.findElement(By.id("login")).sendKeys(Keys.RETURN);
	}
	@AfterTest	
	public void aftertest() {
		driver.close();
		driver.quit();
		System.out.println("Test completed successfully");
	}

}
