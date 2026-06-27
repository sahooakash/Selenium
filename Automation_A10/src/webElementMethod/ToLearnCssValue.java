package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnCssValue {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String color = driver.findElement(By.xpath("//div[@role='button']")).getCssValue("color");
		System.out.println(color);
		Thread.sleep(2000);
		driver.quit();
	}

}
