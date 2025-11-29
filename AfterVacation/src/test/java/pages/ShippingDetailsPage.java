package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.Utils;

public class ShippingDetailsPage {
	WebDriver driver;
	public ShippingDetailsPage(WebDriver driver) {
		this.driver = driver;	
	}
	
	By PhoneNumber = By.cssSelector("#phone");
	By Street = By.xpath("//input[@name='street']");
	By City =By.xpath("//input[@placeholder='London']");
	By Country = By.cssSelector("#countries_dropdown_menu");
	By SubmitOrder = By.cssSelector("#submitOrderBtn");
	By Message = By.cssSelector("#message");
	
	Utils ObjUtils = new Utils();
	public void ShippingDetails() {
		ObjUtils.Sendkeys(driver, PhoneNumber, "9876543210");
		ObjUtils.Sendkeys(driver, Street, "wolfrashauserstrasse 215, solln");
		ObjUtils.Sendkeys(driver, City, "Bavaria");
		ObjUtils.SelectByVisibleText(driver, Country, "Germany");
		ObjUtils.Click(driver, SubmitOrder);
		ObjUtils.GetText(driver, Message);
		
	}
	
	

}
