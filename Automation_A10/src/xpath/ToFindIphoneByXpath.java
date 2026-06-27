package xpath;

import java.awt.Window;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFindIphoneByXpath {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("i phone 16");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		List<WebElement> product = driver.findElements(By.xpath("//span[contains(text(),'Apple iPhone 16 Plus')]"));
		
		for(WebElement id : product)
		{
			System.out.println(id.getText());
		}
		 List<WebElement> price = driver.findElements(By.xpath("//span[contains(text(),'Apple iPhone 16 Plus')]/../../../..//span[contains(text(),'₹')]"));
		for(WebElement prod : price) {
			System.out.println(prod.getText());
		}
	
	}

}
