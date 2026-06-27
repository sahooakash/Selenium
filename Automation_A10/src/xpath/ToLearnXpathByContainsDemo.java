package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpathByContainsDemo {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String letter = driver.findElement(By.xpath("//div[contains(text(),'Copyright')] ")).getText();
		System.out.println(letter);
		driver.close();
		
	}

}
