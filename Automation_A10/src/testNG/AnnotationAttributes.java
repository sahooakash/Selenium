package testNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.helpers.Reporter;
import org.testng.annotations.Test;

public class AnnotationAttributes {
	public void Register() {
		@Test(priority = 10,invocationCount = 4,threadPoolSize = 2)
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/register");
		org.testng.Reporter.log("Register Page Is Displayed",true);
		
	}
	public void Login() {
		@Test(priority = 10,invocationCount = 4,threadPoolSize = 2)
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/login");
		org.testng.Reporter.log("Login Page is displayed",true);
	}
}
