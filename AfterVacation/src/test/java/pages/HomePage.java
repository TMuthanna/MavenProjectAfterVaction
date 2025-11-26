package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.Utils;


public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver = driver;
	} 
	
	By EcommerceLogIn = By.cssSelector("#auth-shop");
	
	
	
	Utils ObjUtils = new Utils();
	public void ClickOnEcommerceLogIn() {
		ObjUtils.Click(driver, EcommerceLogIn);
		
	}
	
}
