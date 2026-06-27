package webElementMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TolearnGetAttribute {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		List<WebElement> allinks = driver.findElements(By.tagName("a"));
		System.out.println(allinks.size());
		for(WebElement ele : allinks) {
			System.out.println(ele.getText());
			System.out.println(ele.getAttribute("href"));
			}
		driver.quit();
		}

}
