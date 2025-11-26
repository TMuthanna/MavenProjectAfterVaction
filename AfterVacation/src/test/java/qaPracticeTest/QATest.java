package qaPracticeTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;
import pages.LoginPage;
import pages.ShippingDetailsPage;
import pages.ShoppingCartPage;

public class QATest {
	
	@Test
	public void LogIn() {
		WebDriver driver = WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://qa-practice.razvanvancea.ro/");
		driver.manage().window().maximize();
		
		HomePage ObjHomePage = new HomePage(driver);
		ObjHomePage.ClickOnEcommerceLogIn();
		
		LoginPage ObjLoginPage = new LoginPage(driver);
		ObjLoginPage.EnterLoginDetails();
		
		ShoppingCartPage ObjShoppingCartPage = new ShoppingCartPage(driver);
		ObjShoppingCartPage.AddToCart();
		
		ShippingDetailsPage ObjShippingDetailsPage = new ShippingDetailsPage(driver);
		ObjShippingDetailsPage.ShippingDetails();
		
		
	} 
}
