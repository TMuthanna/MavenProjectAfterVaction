package pages;

import org.apache.commons.lang3.ObjectUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.Utils;

public class ShoppingCartPage {
	WebDriver driver;
	public ShoppingCartPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By AddToCart = By.xpath("(//button[@type='button'])[4]");
	By ProceedToCheckOut = By.xpath("//button[@onclick='displayCartMessage()']");
	
	
	Utils ObjUtils = new Utils();
	public void AddToCart() {
		ObjUtils.Click(driver, AddToCart);
		ObjUtils.Click(driver, ProceedToCheckOut);
		
	}

	

}
