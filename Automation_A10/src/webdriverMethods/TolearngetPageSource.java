package webdriverMethods;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TolearngetPageSource {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		String page = driver.getPageSource();
		System.out.println(page);
	}

}
