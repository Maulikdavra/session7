package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {
	WebDriver driver;

	@Test
	public void ValidUserShouldAbleToAddCustomer() {
		
	driver=BrowserFactory.init();

	LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	//LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	loginPage.enterUserName("demo@techfios.com");
	loginPage.enterPassword("abc123");
	loginPage.submit();
	
	
	AddCustomerPage customerpage = PageFactory.initElements(driver, AddCustomerPage.class);
	customerpage.customer();
	customerpage.addcustomer();
	customerpage.enterusername("maulik");
	customerpage.enterCompanyName("Techfios");
	customerpage.EnterEmail("abc@gmail.com");
	
	BrowserFactory.tearDown();
}
}