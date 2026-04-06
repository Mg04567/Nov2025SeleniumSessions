package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSendKeysWithPause {

	static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		Actions act=new Actions(driver);
		//WebElement firstnameEle=driver.findElement(By.id("input-firstname"));
		
		//String firstname="Shilpa";
		
		By firstname=By.id("input-firstname");
		sendKeysWithPause(firstname, "Shilpa", 500);
		
		//act.sendKeys(lastname, firstname).perform();   //This will enter the value without a pause, so we use for loop to enter char
														// by char
		
//		char[] arr=firstname.toCharArray();  //Converting the given string to a char array [S,h,i.l.p,a]
//		
//		//To iterate over the String value
//		for (char e : arr) {
//			act.sendKeys(firstnameEle, String.valueOf(e))     //sendkeys method takes only char sequence , either String, String Buffer and String builder is allowed
//					.pause(200).perform();					// e is a character here we have to convert to char sequence
		}
		
	
	public static void sendKeysWithPause(By locator,String value, long timeSpan) {
		Actions act=new Actions(driver);
		char[] val=value.toCharArray();
		for (char e : val) {
			act.sendKeys(getElement(locator), String.valueOf(e)).pause(timeSpan).perform();	
	}

}

	public static WebElement getElement(By locator) { 
		return driver.findElement(locator);
	}
}