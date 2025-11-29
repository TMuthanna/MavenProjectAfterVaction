package qaPracticeTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.CheckboxesPage;
import pages.DoubleClickOnButtonExamplePage;
import pages.HomePage;
import pages.LoginPage;
import pages.MouseHoverExamplePage;
import pages.RadioButtonPage;
import pages.RegisterFormPage;
import pages.ScrollingDemoPage;
import pages.ShippingDetailsPage;
import pages.ShoppingCartPage;
import pages.ShowHideElementPage;

public class QATest {
	
	@Test
	public void LogIn() throws InterruptedException {
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
		
		ObjHomePage.ClickOnForms();
		
		RegisterFormPage ObjRegisterFormPage = new RegisterFormPage(driver);
		ObjRegisterFormPage.EnterDetailsInRegisterForm();
		
		ObjHomePage.ClickOnButtons();
		Thread.sleep(3000);
		CheckboxesPage ObjCheckboxesPage = new CheckboxesPage(driver);
		ObjCheckboxesPage.ClickOnCheckboxes();
		
		
		ObjHomePage.RadioButton();
		RadioButtonPage ObjRadioButtonPage = new RadioButtonPage(driver);
		ObjRadioButtonPage.ClickOnRadioButtons();
		
		ObjHomePage.ClickOnBtnActions();
		Thread.sleep(2000);
		DoubleClickOnButtonExamplePage ObjDoubleClickOnButtonExamplePage = new DoubleClickOnButtonExamplePage(driver);
		ObjDoubleClickOnButtonExamplePage.ClickOnDoubleClickOnButtonExample();
		
		ObjHomePage.ClickOnScrollingButton();
		ScrollingDemoPage ObjScrollingDemoPage = new ScrollingDemoPage(driver);
		ObjScrollingDemoPage.ScrollDownBottom();
		
		
		
		ObjHomePage.ClickOnMouseHoverButton();
		MouseHoverExamplePage ObjMouseHoverExamplePage = new MouseHoverExamplePage(driver);
    	ObjMouseHoverExamplePage.MouseHover();
    	
    	ObjHomePage.ClickOnShowHideElement();
    	ShowHideElementPage ObjShowHideElementPage = new ShowHideElementPage(driver);
    	ObjShowHideElementPage.ClickOnShowHideElement();

		
	} 
}
;