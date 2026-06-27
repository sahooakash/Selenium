package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignentOnDynamicWebElement {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com/");
		driver.findElement(By.xpath("//input[@placeholder='Leaving From']")).sendKeys("Hydrabad");
		driver.findElement(By.xpath("//input[@placeholder='Going To']")).sendKeys("Banglore");
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		
		
	}

}
