package Assignment;


import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PraticeForSwitchTo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/51");
		Thread.sleep(30000);
		driver.findElement(By.id("compare")).click();
		Set<String> allwin = driver.getWindowHandles();
		for(String id : allwin) {
			driver.switchTo().window(id);
			String url = driver.getCurrentUrl();
			if(url.equals("https://www.flipkart.com/")) {
				Thread.sleep(5000);
				driver.manage().window().maximize();
			}else if(url.equals("https://amazon.in/")) {
				Thread.sleep(5000);
				driver.manage().window().minimize();
			}else  {
				Thread.sleep(5000);
				driver.manage().window().fullscreen();
			}
			
		}
	}

}
