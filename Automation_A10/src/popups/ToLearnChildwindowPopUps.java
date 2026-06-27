package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnChildwindowPopUps {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://the-internet.herokuapp.com/windows");
		String parent = driver.getWindowHandle();
		 driver.findElement(By.linkText("Click Here")).click();
		  Set<String> allWindows = driver.getWindowHandles();
		  for (String window : allWindows) {
	            if (!window.equals(parent)) {
	                driver.switchTo().window(window);
	                System.out.println("Child Window Text: " +
	                driver.findElement(By.tagName("h3")).getText());
	                driver.close();
	                
	}

}
