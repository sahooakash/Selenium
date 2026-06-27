package windowsMethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TolearnSetPosition {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().window().setPosition(new Point(-6, -8));
		Point position = driver.manage().window().getPosition();
		System.out.println(position);
	}
	
	

}
