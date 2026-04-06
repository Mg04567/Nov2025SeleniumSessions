package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementClick {

	static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

//		driver.findElement(By.name("agree")).click();
//		driver.findElement(By.linkText("Forgotten Password")).click();
		
		By agreeCheckBox= By.name("agree");
		By forgotPwdLink= By.linkText("Forgotten Password");
		
		
		ElementUtil eleUtil= new ElementUtil(driver);
		
		eleUtil.doClick(agreeCheckBox);
		eleUtil.doClick(forgotPwdLink);
		}

//The below utilities are added in ElementUtil Class.
//	public static void doClick(By Locator) {      
//		getElement(Locator).click();
//	}
//	
//	
//	   Create a utitlity for findElement
//	public static WebElement getElement(By Locator) {
//		return driver.findElement(Locator);
//	}
//	
}	

