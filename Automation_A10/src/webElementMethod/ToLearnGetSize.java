package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetSize {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Dimension size = driver.findElement(By.xpath("//input[@id='small-searchterms']")).getSize();
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		driver.quit();
		
	}

}
