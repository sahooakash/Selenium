package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.web.Values;

public class ToLearnGetRect {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	Rectangle valus = driver.findElement(By.xpath("//input[@id='newsletter-subscribe-button']")).getRect();
	System.out.println(valus.getHeight());
	System.out.println(valus.getWidth());
	driver.quit();
	System.out.println(valus.getX());
	System.out.println(valus.getY());
	
}
}
