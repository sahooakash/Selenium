package webdriverMethods;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetCurrentUrl {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	//https://www.flipkart.com/
	String url = driver.getCurrentUrl();
	if(url.equals("https://www.flipkart.com")) {
		System.out.println("WelcomePage is displayed");
	}
	else {
		System.out.println("WelcomePage is not displayed");
	}
}
}
