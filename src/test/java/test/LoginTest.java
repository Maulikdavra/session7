package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {

	WebDriver driver;
	@Test
	public void logintest()
	{
		driver=BrowserFactory.init();
		//LoginPage loginPage1 = new LoginPage();
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterUserName("demo@techfios.com");
		loginPage.enterPassword("abc123");
		loginPage.submit();
		
		

		//BrowserFactory.tearDown();
	}
}
