package takesscreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TolearnScreenshotOfWebpage {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		String timestamp = LocalDateTime.now().toString().replace(":", "_");
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		TakesScreenshot ts= (TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File perm = new File("./screenshot/"+timestamp+".png");
		FileHandler.copy(temp, perm);
		
	}

}
