package webdriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwithchToUsingBreak {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/51");
		Thread.sleep(30000);
		driver.findElement(By.id("compare")).click();
		Set<String> allwinId = driver.getWindowHandles();
		for(String id : allwinId) {
			driver.switchTo().window(id);
			String Url = driver.getCurrentUrl();
			if(Url.equals("https://www.flipkart.com/")) {
				break;
			}
		}
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		Thread.sleep(3000);
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
	}

}
