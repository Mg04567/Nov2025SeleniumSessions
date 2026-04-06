package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorsTextField {

	static WebDriver driver;
	public static void main(String[] args) {
		
		//Relative locator to find if text field exists below the E-Mail Address label and above the Password label
		//Forgotten password to be available below the password text field
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
		WebElement emailId=driver.findElement(By.xpath("//label[text()='E-Mail Address']"));
		WebElement passwrd=driver.findElement(By.xpath("//label[text()='Password']"));
		Boolean flag= driver.findElement(with(By.id("input-email")).below(emailId).above(passwrd)).isDisplayed();
		 
		if (!flag.equals(true)) {
			System.out.println("Text field doesnot exist");
		}
		else {
			System.out.println("Text field exists below Email label and above passwrd");
		}
       
		
	}

}
