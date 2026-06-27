package webdriverMethods;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwitchTo {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/51");
		driver.findElement(By.id("compare")).click();
		Set<String> allwinId = driver.getWindowHandles();
		for(String id : allwinId) {
        driver.switchTo().window(id);
       
	String Url = driver.getCurrentUrl();
	if(Url.equals("https://www.flipkart.com/")){
		driver.manage().window().maximize();
		}else if(Url.equals("https://amazon.in/")) {
			driver.manage().window().minimize();
		}else if(Url.equals("https://ebay.com/")) {
			driver.close();	
		}
	
	}
        
		}
	}

