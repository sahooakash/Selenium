package screenshots;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshoot {
	 

	    public static void captureScreenshot(WebDriver driver, String screenshotName) throws Exception {

	        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

	        TakesScreenshot ts = (TakesScreenshot) driver;
	        File source = ts.getScreenshotAs(OutputType.FILE);

	        File destination = new File("./screenshots/" + screenshotName + "_" + timestamp + ".png");

	        FileHandler.copy(source, destination);
	    }
	}


