package assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnHardAssert {
	@Test
	public void login() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("demowebshop.tricentis.com");
		driver.findElement(By.linkText("Log in")).click();
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://demowebshop.tricentis.com/login","Login Page is Displayed");
		Reporter.log("Login Page is displayed",true);
		driver.findElement(By.id("Email")).sendKeys("virat18rcb@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("virat@rcb");
		driver.findElement(By.xpath("//input[@value='Log in'")).click();
		
		Assert.assertEquals(driver.getCurrentUrl(),"https://demowebshop.tricentis.com/", "Home Page is not Displayed");
		Reporter.log("Login Page is displayed",true);
		
		
		
	}
	

}
