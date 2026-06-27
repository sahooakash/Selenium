package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpathByAxis {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/user/OneDrive/Desktop/Movies.html");
		driver.findElement(By.xpath("//td[text()=' Dhurandar ']/following-sibling::td[2]"));
		driver.findElement(By.xpath(""));
		
	}

}
