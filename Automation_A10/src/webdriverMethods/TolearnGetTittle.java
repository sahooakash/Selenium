package webdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TolearnGetTittle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.in/");
		//Amazon Great Summer Sale 2026
		
		String title = driver.getTitle();
		System.out.println(title);
       if(title.equals("Amazon Great Summer Sale 2026")) {
    	   System.out.println("Wp is display");
       }
       else {
    	   System.out.println("Wp not displayed");
       }
	}
       

}
