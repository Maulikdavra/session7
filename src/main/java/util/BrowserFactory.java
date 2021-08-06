package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class BrowserFactory {
	
	static WebDriver driver;
		
		
		public static WebDriver init() {
			
			System.setProperty("webdriver.edge.driver","C:\\Users\\MD\\selenium\\session7\\driver\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.techfios.com/billing/?ng=admin/");
			//return driver;
			return driver;
		}
	
		
		
		public static void tearDown()
		{
			driver.close();
			driver.quit();
	
		}

}
