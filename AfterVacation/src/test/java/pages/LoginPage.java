package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.Utils;

public class LoginPage {
	WebDriver driver;
	public  LoginPage(WebDriver driver) {
		this.driver = driver;
	//constructor	
	}
	
	By Email = By.cssSelector("#email");
	By Password = By.cssSelector("#password");
	By SubmitButton = By.cssSelector("#submitLoginBtn");
	
	
	Utils ObjUtils = new Utils();
	public void EnterLoginDetails() {
		ObjUtils.Sendkeys(driver, Email, "admin@admin.com");
		ObjUtils.Sendkeys(driver, Password, "admin123");
		ObjUtils.Click(driver, SubmitButton);
		
	}
	

}
