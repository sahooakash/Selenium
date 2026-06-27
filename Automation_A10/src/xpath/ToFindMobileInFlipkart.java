package xpath;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFindMobileInFlipkart {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[contains(@role,'button')]")).click();
		driver.findElement(By.xpath("(//input[contains(@title,'Search')])[1]")).sendKeys("mobile");
	    driver.navigate().to("https://www.flipkart.com/iqoo-z11x-5g-titan-black-128-gb/p/itm8157cfb5645d4?pid=MOBHHHBT766ZBUSF&lid=LSTMOBHHHBT766ZBUSF0XKBOX&marketplace=FLIPKART&q=mobile&store=tyy%2F4io&srno=s_1_1&otracker=search&otracker1=search&fm=organic&iid=2a528dea-7f1a-4e10-a1c2-969172e7d67b.MOBHHHBT766ZBUSF.SEARCH&ppt=None&ppn=None&ssid=p0cu1mk3eo0000001779992346849&qH=532c28d5412dd75b&ov_redirect=true");
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//div[contains(text(),'25%')]")).click();
	    List<WebElement> discount = driver.findElements(By.xpath("//h1[contains(text(),'IQOO Z11x 5G')]/../../../../../../../../../../../..//div[contains(text(),'25%')]"));
	    for (WebElement print : discount) {
	    	System.out.println(print.getText());
	    }
	    driver.quit();
		}
	}



