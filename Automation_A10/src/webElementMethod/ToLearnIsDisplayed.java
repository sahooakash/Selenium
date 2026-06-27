package webElementMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnIsDisplayed {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://in.pinterest.com/");
		driver.manage().window().maximize();
		List<WebElement> allimg = driver.findElements(By.tagName("img"));
		System.out.println(allimg.size());
	}

}
