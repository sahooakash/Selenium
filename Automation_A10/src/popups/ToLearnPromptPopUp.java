package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnPromptPopUp {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	driver.findElement(By.xpath("//section[text()='Popups']")).click();
	driver.findElement(By.xpath("//section[text()='Javascript']")).click();
	driver.finElement(By.xpath("//a[text()='Prompt']")).click();

}
