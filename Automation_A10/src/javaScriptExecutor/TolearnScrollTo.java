package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TolearnScrollTo {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	     JavascriptExecutor js = (JavascriptExecutor)driver;
	     js.executeScript("window.scrollTo(0,4000)");
	     js.executeScript("window.scrollBy(0,2000)");
	     js.executeScript("window.scrollTo(0,2000)");
	     
	     
	}

}
