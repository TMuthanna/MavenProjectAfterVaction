package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.Utils;

public class CheckboxesPage {
	WebDriver driver;
	public CheckboxesPage(WebDriver driver) {
		this.driver = driver;
	}
	By CheckMeOut1 = By.cssSelector("#checkbox1");
	By CheckMeOut2 = By.cssSelector("#checkbox2");
	By CheckMeOut3 = By.cssSelector("#checkbox3");
	By Reset = By.xpath("//button[@type='reset']");
	
	Utils ObjUtils = new Utils();
	public void ClickOnCheckboxes() {
		ObjUtils.Click(driver, CheckMeOut1);
		ObjUtils.Click(driver, CheckMeOut2);
		ObjUtils.Click(driver, CheckMeOut3);
		ObjUtils.Click(driver, Reset);
		
	}

	
	
	
}
