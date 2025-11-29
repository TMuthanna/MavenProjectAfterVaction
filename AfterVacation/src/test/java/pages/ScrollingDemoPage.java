package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;



public class ScrollingDemoPage {
	WebDriver driver;
	public ScrollingDemoPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void ScrollDownBottom() {
		JavascriptExecutor ScrollBottom = (JavascriptExecutor) driver;
		ScrollBottom.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}

}
