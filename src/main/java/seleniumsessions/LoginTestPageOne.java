package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestPageOne {

	public static void main(String[] args) throws InterruptedException {
		BrowserUtil brUtil=new BrowserUtil();
	
		 WebDriver driver=brUtil.initDriver("chrome");
		 brUtil.enterURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		 
		By ftname= By.id("input-firstname");
		By ltname=By.id("input-lastname");
		By emilname=By.id("input-email");
		By telename=By.id("input-telephone");
		By pwdwd=By.id("input-password");
		By pwdnew=By.id("input-confirm");
		
		ElementUtil eleUtil=new ElementUtil(driver);
		
		eleUtil.doSendKeys(ftname, "shilpa");
		eleUtil.doSendKeys(ltname, "komal");
		eleUtil.doSendKeys(emilname, "sample@gmail.com");
		eleUtil.doSendKeys(telename, "012345");
		eleUtil.doSendKeys(pwdwd, "test@123");
		eleUtil.doSendKeys(pwdnew, "test@123");
		
		Thread.sleep(2000);
		
		brUtil.closeBrowser();
	}

}
