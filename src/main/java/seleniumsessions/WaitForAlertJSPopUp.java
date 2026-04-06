package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForAlertJSPopUp {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//		
//		Alert alert=wait.until(ExpectedConditions.alertIsPresent());
//		String text=alert.getText();
//		System.out.println(text);
//		alert.accept();    //No need to write driver.switchTo.alert.accept();
		//String text=waitForJSAlertAndAcept(10);
		//System.out.println(text);
		
	String text=waitForJSPromptAlertAndEnterValue("I am test", 10);
	System.out.println(text);
	}

	public static String waitForJSAlertAndAcept(long timeOut) {
     WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		
     Alert alert=wait.until(ExpectedConditions.alertIsPresent());
    String text=alert.getText();
		
		alert.accept();  
		return text;
	}
	
	public static String waitForJSAlertAndDismiss(long timeOut) {
	     WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeOut));
			
	     Alert alert=wait.until(ExpectedConditions.alertIsPresent());
	    String text=alert.getText();
			
			alert.dismiss();  
			return text;
		}
	
	public static String waitForJSPromptAlertAndEnterValue(String value,long timeOut) {
	     WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeOut));
			
	     Alert alert=wait.until(ExpectedConditions.alertIsPresent());
	    String text=alert.getText();
			
			alert.sendKeys(value); 
			alert.accept();
			return text;
		}
}
