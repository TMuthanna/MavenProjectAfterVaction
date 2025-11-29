package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.Utils;

public class RegisterFormPage {
	WebDriver driver;
	public RegisterFormPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By FirstName = By.cssSelector("#firstName");
	By LastName = By.cssSelector("#lastName");
	By PhoneNumber = By.cssSelector("#phone");
	By Country = By.cssSelector("#countries_dropdown_menu");
	By EmailAddress = By.cssSelector("#emailAddress");
	By Password = By.cssSelector("#password");
	By TermsCondition = By.cssSelector("#exampleCheck1");
	By RegisterButton  = By.cssSelector("#registerBtn");
	By Message = By.cssSelector("#message");
	
	
	Utils ObjUtils = new Utils();
	public void EnterDetailsInRegisterForm() {
		ObjUtils.Sendkeys(driver, FirstName, "Blenzy");
		ObjUtils.Sendkeys(driver, LastName, "Cabral");
		ObjUtils.Sendkeys(driver, PhoneNumber, "9876545678");
		ObjUtils.SelectByVisibleText(driver, Country, "Oman");
		ObjUtils.Sendkeys(driver, EmailAddress, "Blenzy@gmail.com");
		ObjUtils.Sendkeys(driver, Password, "Blenzy");
		ObjUtils.Click(driver, TermsCondition);
		ObjUtils.Click(driver, RegisterButton);
//		ObjUtils.IsDisplay(driver, Message);
		ObjUtils.GetText(driver, Message);
		
		
		
		
		
	}

}
