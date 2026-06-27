package webdriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetWindowHandle {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/51");
		Thread.sleep(40000);
		driver.findElement(By.id("compare")).click();
		 Set<String> allwin = driver.getWindowHandles();
		 for(String id:allwin) {
			 System.out.println(id);
		 }
		 driver.quit();
		
	}

}
