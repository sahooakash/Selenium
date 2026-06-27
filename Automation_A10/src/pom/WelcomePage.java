package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	//Declaration of register link
	@FindBy(linkText = "Register")
	private WebElement reglink;
	//Declaration of login link
	@FindBy(linkText = "Login")
	private WebElement loglink;
	//Declaration of login link
		@FindBy(linkText = "Log in")
		private WebElement Login;
		//Declaration of Search Field
		@FindBy(linkText = "Search store")
		private WebElement Searchstore;
		//initialization
		public WelcomePage(WebDriver driver) {
		}
		  PageFactory"."initElements(driver,this);
		}
      

				

}
