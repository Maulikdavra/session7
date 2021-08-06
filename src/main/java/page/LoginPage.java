package page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	WebDriver driver;
	
	//WebElements
	
	// IN any cases we can not use WebElement or By class to store data as it is not 
	//appropriate in Pagelayout
	//WebElement USER_NAME_ELEMENT = driver.findElement(By.xpath("//*[@id=\"username\"]"));
	//By USER_NAME_LCATOR = By.xpath("//*[@id=\"username\"]");
	
	@FindBy(how=How.XPATH, using="//*[@id=\"username\"]") WebElement USER_NAME_ELEMENT;
	@FindBy(how=How.XPATH, using="//*[@id=\"password\"]") WebElement PASSWORD_ELEMENT;
	@FindBy(how=How.XPATH, using="/html/body/div/div/div/form/div[3]/button") WebElement SUBMIT_BUTTON;

	//Interactive method
	public void enterUserName(String userName) {
		USER_NAME_ELEMENT.sendKeys(userName);
	}
	
	public void enterPassword(String password) {
		PASSWORD_ELEMENT.sendKeys(password);
	}
	
	public void submit() {
		SUBMIT_BUTTON.click();
	}
	
	
}

