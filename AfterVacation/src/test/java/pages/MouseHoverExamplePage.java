package pages;

import org.apache.commons.lang3.ObjectUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.Utils;

public class MouseHoverExamplePage {
	WebDriver driver;
	public  MouseHoverExamplePage(WebDriver driver) {
		this.driver = driver;	
	}
	
	By HoverOverMeExampleNo2 = By.cssSelector("#button-hover-over");
	
	Utils ObjUtils = new Utils();
	public void MouseHover() {
		ObjUtils.MouseHover(driver, HoverOverMeExampleNo2);
		
	}
	
}
