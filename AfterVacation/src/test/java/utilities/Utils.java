package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Utils {
	public void Click(WebDriver driver, By Locator) {
		driver.findElement(Locator).click();
	}
	public void Sendkeys(WebDriver driver, By Locator,String Value) {
		driver.findElement(Locator).sendKeys(Value);
	
	}
	
	public void SelectByVisibleText(WebDriver driver, By Locator, String Value) {
		Select DD = new Select(driver.findElement(Locator));
		DD.selectByVisibleText(Value);
		
	}
	public void GetText(WebDriver driver, By Locator) {
		String TEXT = driver.findElement(Locator).getText();
		System.out.println(TEXT);
		
	}

}
