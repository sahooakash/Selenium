package testNG;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript1 extends BaseClsss{
	
	@Test
	public void click() {
		driver.findElement(By.partialLinkText("BOOKS")).click();
		Reporter.log("Bookspage is Displayed",true);
	}

}
