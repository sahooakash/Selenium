package Assignment;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnApplicationOnRedBus {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		String check = driver.getCurrentUrl();
		System.out.println(check);
		if(check.equals("https://www.redbus.in/")) {
			System.out.println("Welcome Page Is Display");
		}
		else {
			System.out.println("Welcome Page is Not Displayed");
		}
		
		String Page = driver.getPageSource();
		System.out.println(Page);
		Dimension size = driver.manage().window().getSize();
		System.out.println("Height is " + size.getHeight());
		System.out.println("Width is " + size.getWidth());
		Point position = driver.manage().window().getPosition();
		System.out.println("X position is " + position.getX());
		System.out.println("Y position is " + position.getY());
		driver.quit();
		
		
	}

}
