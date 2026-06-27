package webdriverMethods;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnGetCurrentForChrome {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//https://www.amazon.in/
		 
		String url = driver.getCurrentUrl();
		if(url.equals("https://www.amazon.in/")) {
			System.out.println("Welcome Page is displayed");
		}else {
			System.out.println("Welcome page is not displayed");
		}
		 

	}

}
