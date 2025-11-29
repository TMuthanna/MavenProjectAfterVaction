package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

import utilities.Utils;


public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver = driver;
	} 
	
	By EcommerceLogIn = By.cssSelector("#auth-shop");
	
	By Forms = By.cssSelector("#forms");
	By Register = By.cssSelector("#register");
	By Buttons = By.xpath("//a[@href='#pageSubmenu']");
	By Checkboxes = By.cssSelector("#checkboxes");
	By RadioButton = By.cssSelector("#radio-buttons");
	By Btnactions = By.cssSelector("#actions");
	By Doubleclickbtn = By.cssSelector("#double-click");
	By Scrolling = By.cssSelector("#scrolling");
	By MouseHover = By.cssSelector("#mouse-hover");
	By ShowHideElement = By.cssSelector("#show-hide-elements");
	
	
	Utils ObjUtils = new Utils();
	public void ClickOnEcommerceLogIn() {
		ObjUtils.Click(driver, EcommerceLogIn);
		
	}
	
	public void ClickOnForms() throws InterruptedException {
		ObjUtils.Click(driver, Forms);
		
		//JavascriptExecutor Obj = (JavascriptExecutor) driver;
	//	Obj.executeScript("window.scrollBy(0,350)", "");
		//Thread.sleep(3000);
		
		ObjUtils.ExplicitWaitToClick(driver, Register);
		ObjUtils.Click(driver, Register);
			
	}
	
	public void ClickOnButtons() throws InterruptedException {
		ObjUtils.Click(driver, Buttons);
		Thread.sleep(2000);
		ObjUtils.Click(driver, Checkboxes);
			
	}
	
	public void RadioButton() throws InterruptedException {
		ObjUtils.Click(driver, Buttons);
		Thread.sleep(2000);
		ObjUtils.Click(driver, RadioButton);	
	}
	
	public void ClickOnBtnActions() throws InterruptedException {
		ObjUtils.Click(driver, Btnactions);
		Thread.sleep(2000);
		ObjUtils.Click(driver, Doubleclickbtn);
		
	}
	public void ClickOnScrollingButton() throws InterruptedException {
		ObjUtils.Click(driver, Btnactions);
		Thread.sleep(2000);
		ObjUtils.Click(driver, Scrolling);
	}
	public void ClickOnMouseHoverButton() throws InterruptedException {
		ObjUtils.Click(driver, Btnactions);
		Thread.sleep(2000);
		ObjUtils.Click(driver, MouseHover);
		
	}
	public void ClickOnShowHideElement() throws InterruptedException {
		ObjUtils.Click(driver, Btnactions);
		Thread.sleep(2000);
		ObjUtils.Click(driver, ShowHideElement);
		
	}
	
}
