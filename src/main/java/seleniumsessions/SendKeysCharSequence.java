package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysCharSequence {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		Actions act=new Actions(driver);

		
		WebElement firstnameEle=driver.findElement(By.id("input-firstname"));
		
		act.sendKeys(firstnameEle, "Naveen","Automation", "Labs");  //sendkeys takes a char sequence values, wihch an be an array of Strings
		
		
		String emailid="NaveenAutomation";
		StringBuffer email=new StringBuffer("_testing");
		StringBuilder number=new StringBuilder("_123");
		String domain="nal.com";
		
		act.sendKeys(firstnameEle, "emailid","email", "number", "@" ,"domain" );
		
		
	}

}
