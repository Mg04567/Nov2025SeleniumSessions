package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageTest {

	public static void main(String[] args) {
			//We need to open the Browser initialise driver here for this we have to call the BrowserUtil Class
			//Create an object for BrowserUtil Class , call the initDriver method initialise the driver , call enterURL method
			// Get the by Loators.
			//Now to perform ations we need to call the ElementUtil class, create an object for the Element util calls, which calls
			//the driver again and initialise the driver with the chrome driver value.
		
		BrowserUtil brUtil=new BrowserUtil();
		WebDriver driver=brUtil.initDriver("chrome");
		
		brUtil.enterURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By emailIdnew=	By.id("input-email");
		By passwordnew=By.id("input-password");	
		
		ElementUtil eleUtil=new ElementUtil(driver);
		
		eleUtil.doSendKeys(emailIdnew, "naveen@gmail.com");
		eleUtil.doSendKeys(passwordnew, "test@123");
		
		brUtil.quitBrowser();
	}

}
