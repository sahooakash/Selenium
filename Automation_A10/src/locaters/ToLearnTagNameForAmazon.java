package locaters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnTagNameForAmazon {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000); 
		List<WebElement> allimg = driver.findElements(By.tagName("img"));
		System.out.println(allimg.size());

	// for links
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		System.out.println(alllinks.size());
		for(WebElement emu : alllinks) {
			String links = emu.getText();
			System.out.println(links);
			driver.close();
		}
	}

}
