package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementText {
	static WebDriver driver;
	public static void main(String[] args) {
		driver =new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
//		String header=driver.findElement(By.tagName("h1")).getText();
//		System.out.println(header);
		
//		We can use utilities fr getText() and we need to find the locator for the header.
		
		By header=By.tagName("h1");
		ElementUtil eleUtil=new ElementUtil(driver);
		
		String headerEle=eleUtil.doElementGetText(header);
		System.out.println(headerEle);
		
		
	
	}
	
//	public static void doElementGetText(By locator) {   The same utility will be saved in ElementUtil class
//		doElement(locator).getText();
//	}
//	
//	
//	public static WebElement doElement(By locator) {
//		return driver.findElement(locator);
//	}
//	
	

}
