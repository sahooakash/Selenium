package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnClear {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("(//input[contains(@name,'username')])[1]"));
		element.clear();
		element.sendKeys("akashSahoo");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.clear();
		password.sendKeys("Sahoo@321");
	}

}
