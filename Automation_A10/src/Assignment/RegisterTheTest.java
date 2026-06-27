package Assignment;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import screenshots.Screenshoot;

public class RegisterTheTest {

	public static void main(String[] args) throws Exception {

        // Load property file 
        FileInputStream fis = new FileInputStream("config.properties");
        Properties prop = new Properties();
        prop.load(fis);

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(prop.getProperty("https://demowebshop.tricentis.com/"));

        RegisterPage register = new RegisterPage(driver);

        register.clickGender();
        register.enterFirstName(prop.getProperty("firstname"));
        register.enterLastName(prop.getProperty("lastname"));
        register.enterEmail(prop.getProperty("email"));
        register.enterPassword(prop.getProperty("password"));
        register.enterConfirmPassword(prop.getProperty("password"));
        register.clickRegister();

        // Screenshot after register
        Screenshoot.captureScreenshot(driver, "RegisterPage");

        driver.quit();
    }
}