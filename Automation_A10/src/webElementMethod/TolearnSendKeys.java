package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TolearnSendKeys {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.amazon.in/");
	 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobile",Keys.ENTER);
		
	}

}
