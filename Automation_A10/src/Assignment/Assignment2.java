package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Log")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("sahoo.akash321@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("Sahoo@321");
		Thread.sleep(2000);
		driver.findElement(By.id("RememberMe")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Forgot")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
