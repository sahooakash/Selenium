package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnMultiSelectDropDown {
	public static void main(String[] args) {
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/user/OneDrive/Desktop/MultipleDropDown.html");
		WebElement multipleDrop1 = driver.findElement(By.xpath("//select[@id='Contries']"));
		Select sel = new Select(multipleDrop1);
		sel.selectByIndex(5);
		sel.selectByValue("9");
		sel.selectByVisibleText("RUSIA");
		
	}

}
