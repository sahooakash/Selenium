package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	    WebDriver driver;

	    public RegisterPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    @FindBy(id = "gender-male")
	    private WebElement maleRadioBtn;

	    @FindBy(id = "FirstName")
	    private WebElement firstName;

	    @FindBy(id = "LastName")
	    private WebElement lastName;

	    @FindBy(id = "Email")
	    private WebElement email;

	    @FindBy(id = "Password")
	    private WebElement password;

	    @FindBy(id = "ConfirmPassword")
	    private WebElement confirmPassword;

	    @FindBy(id = "register-button")
	    private WebElement registerBtn;

	    public void clickGender() {
	        maleRadioBtn.click();
	    }

	    public void enterFirstName(String fname) {
	        firstName.sendKeys(fname);
	    }

	    public void enterLastName(String lname) {
	        lastName.sendKeys(lname);
	    }

	    public void enterEmail(String mail) {
	        email.sendKeys(mail);
	    }

	    public void enterPassword(String pwd) {
	        password.sendKeys(pwd);
	    }

	    public void enterConfirmPassword(String pwd) {
	        confirmPassword.sendKeys(pwd);
	    }

	    public void clickRegister() {
	        registerBtn.click();
	    }
	}

   