package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnSingleSelect {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/user/OneDrive/Desktop/contry.html");
		WebElement dropdown1 = driver.findElement(By.id("Select Contries"));
		Select sel = new Select(dropdown1);
		sel.selectByIndex(8);
		sel.selectByValue("5");
		sel.selectByVisibleText("USA");
	}

}
