package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathOnFlight {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://blazedemo.com/");
		driver.findElement(By.xpath("//input[contains(@value,'Find Flights')]")).click();
		List<WebElement> price = driver.findElements(By.xpath("//td[text()='Aer Lingus']/following-sibling::td[3]"));
		for(WebElement  id : price) {
			System.out.println(id.getText());
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[text()='Aer Lingus']/preceding-sibling::td[2]")).click();
	}

}
