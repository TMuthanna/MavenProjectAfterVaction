package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.Utils;

public class ShowHideElementPage {
	WebDriver driver;
	public ShowHideElementPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By ShowHide = By.cssSelector("#showHideBtn");
	
	Utils objUtils = new Utils();
	public void ClickOnShowHideElement() {
		objUtils.Click(driver, ShowHide);
	}
}
