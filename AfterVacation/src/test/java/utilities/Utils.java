package utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	
	public void ExplicitWaitToClick(WebDriver driver, By Locator) {
		WebDriverWait ExWait = new WebDriverWait(driver, Duration.ofSeconds(3));
		ExWait.until(ExpectedConditions.elementToBeClickable(Locator));		
	}
	
	public void IsDisplay(WebDriver driver, By Locator) {
		boolean TF = driver.findElement(Locator).isDisplayed();
		System.out.println(TF);
	}
	public void MouseHover(WebDriver driver, By Locator) {
		Actions MouseHover = new Actions(driver);
		MouseHover.moveToElement(driver.findElement(Locator)).build().perform();
		
	}

}
