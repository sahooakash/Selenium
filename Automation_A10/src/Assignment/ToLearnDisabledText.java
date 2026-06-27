package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnDisabledText {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	driver.findElement(By.xpath("//section[text()='Button']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Disabled']")).click();
	 WebElement Box = driver.findElement(By.xpath("//input[@type='checkbox']"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].removeAttribute('disabled')",Box);
	Box.click();
}
}
