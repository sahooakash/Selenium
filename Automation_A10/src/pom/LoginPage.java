package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    // Login link
    @FindBy(linkText = "Log in")
    private WebElement loginLink;

    // Email text field
    @FindBy(id = "Email")
    private WebElement emailTextField;

    // Password text field
    @FindBy(id = "Password")
    private WebElement passwordTextField;
    // login button
    @FindBy(css = "input.login-button")
    private WebElement loginButton;
    
    private WebDriver driver;

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickLoginLink() {
        loginLink.click();
    }

    public void enterEmail(String email) {
        emailTextField.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordTextField.clear();
        passwordTextField.sendKeys(password);
    }
    public void clickLoginButton() {
        loginButton.click();
    }

  
    public void login(String email, String password) {
        clickLoginLink();
        enterEmail(email);
        enterPassword(password);
        clickLoginButton();
    }
}