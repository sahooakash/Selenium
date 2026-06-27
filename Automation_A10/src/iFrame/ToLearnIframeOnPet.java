package iFrame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.parser.antlr.GraphqlParser.ArgumentsContext;

public class ToLearnIframeOnPet {
	private static final String T = null;

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://petdiseasealerts.org/");
		WebElement ele = driver.findElement(By.xpath("//a[text()='Go to maps']"));
		JavascriptExecutor js =(JavascriptExecutor)driver;
	
		js.executeScript("arguments[0].scrollintoview(F)".ele);
		//driver.findElement(By.linkText("Go to maps");
		
	}

}
