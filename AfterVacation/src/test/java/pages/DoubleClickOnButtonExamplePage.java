package pages;

import org.apache.commons.lang3.ObjectUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.Utils;

public class DoubleClickOnButtonExamplePage {
	WebDriver driver;
	public DoubleClickOnButtonExamplePage(WebDriver driver) {
		this.driver = driver;
	}
	
	By DoubleClickMe = By.cssSelector("#double-click-btn");
	By DoubleClickMessage = By.cssSelector("#double-click-result");
	

	
	public void ClickOnDoubleClickOnButtonExample() {
		WebElement DoubleButton = driver.findElement(DoubleClickMe);
		Actions Act = new Actions(driver);
		Act.doubleClick(DoubleButton).build().perform();
		
		Utils ObjUtils = new Utils();
		ObjUtils.GetText(driver, DoubleClickMessage);
		
	
	}
	
}
