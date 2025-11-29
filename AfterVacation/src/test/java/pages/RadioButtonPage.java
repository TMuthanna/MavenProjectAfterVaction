package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.Utils;

public class RadioButtonPage {
	WebDriver driver;
	public RadioButtonPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By RadioButton1 = By.cssSelector("#radio-button1");
	By RadioButton2 = By.cssSelector("#radio-button2");
	By RadioButton3 = By.cssSelector("#radio-button3");
	By RadioButton4 = By.cssSelector("#radio-button4");
	
	
	Utils ObjUtils = new Utils();
	public void ClickOnRadioButtons() {
		ObjUtils.Click(driver, RadioButton1);
		ObjUtils.Click(driver, RadioButton2);
		ObjUtils.Click(driver, RadioButton3);
		ObjUtils.IsDisplay(driver, RadioButton4);
		
		
	}

}
