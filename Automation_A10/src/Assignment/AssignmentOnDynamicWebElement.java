package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class AssignmentOnDynamicWebElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(2000);
		 String price = driver.findElement(By.xpath("(//span[text()='iphone']/..//span[contains(text(),'₹')])[1]")).getText();
		System.out.println(price);
		driver.findElement(By.xpath("(//button[@id='addToCart'])[1]")).click();
		
	}

}
