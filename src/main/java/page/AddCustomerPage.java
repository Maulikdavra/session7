package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class AddCustomerPage extends BasePage {

	WebDriver driver;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"side-menu\"]/li[3]/a/span[1]") WebElement CUSTOMER_ELEMENT;
	@FindBy(how=How.XPATH, using="//a[contains(text(), 'Add Customer')]") WebElement ADD_CUSTOMER_ELEMENT;
	@FindBy(how=How.XPATH, using="//*[@id=\"account\"]") WebElement USER_NAME_ELEMENT;
	@FindBy(how=How.XPATH, using="//*[@id=\"cid\"]") WebElement COMPANY_ELEMENT;
	@FindBy(how=How.XPATH, using="//*[@id=\"email\"]") WebElement EMAIL_ELEMENT;

	public void customer()
	{
		CUSTOMER_ELEMENT.click();
	}

	
	public void addcustomer()
	{
		//waitForElement(driver, 3, ADD_CUSTOMER_ELEMENT);
		ADD_CUSTOMER_ELEMENT.click();
	}


	


	public void enterusername(String username)
	{
		//waitForElement(driver, 3, USER_NAME_ELEMENT);
		USER_NAME_ELEMENT.sendKeys(username +randomGenretaor(999));
	}
	
	public void enterCompanyName(String company) {
		selectDropdown(COMPANY_ELEMENT, company);
	}
	
	public void EnterEmail(String email)
	{
		EMAIL_ELEMENT.sendKeys(randomGenretaor(99)+email);
	}
	
	
	
	
	
	
	
























}
