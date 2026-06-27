package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("Gender")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("FirstName")).sendKeys("Akash");
		Thread.sleep(2000);
		driver.findElement(By.id("LastName")).sendKeys("Sahoo");
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("sahoo.akash321@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("Sahoo@akash21");
		Thread.sleep(2000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Sahoo@akash21");
		Thread.sleep(2000);
		driver.close();
		
	}

}
