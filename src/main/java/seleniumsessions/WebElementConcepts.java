package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcepts {
	 static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// 1=====>This formula finds only one element at a time and perform the actions.Here we are directly creating the webelement 
		//and performing the action.
//		driver.findElement(By.id("input-email")).sendKeys("naveen@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("test@123");
		
		
		//2======> This approach provides reusability.The same webelement can be re used for other usernames also.Once we find the
		//webelemnt we can perform any nunmber of ations with it.
		//Disadvantage is Here we have to use driver fr all available elements even though we use the elements or not.
		
//		WebElement emailIdEle=driver.findElement(By.id("input-email"));
//		WebElement passwordEle=driver.findElement(By.id("input-password"));
//		
//		emailIdEle.sendKeys("naveen@gmail.com");
//		passwordEle.sendKeys("test@123");
		
		//3=======> This approach is better than 2nd approach.Here by locators is maintined and created without using the driver.
		//or Server, we can create the Webelement whenever we want using the driver.The by locator are also called object repository.
		//Here if we change the email id in by locator it gets automatially changed in all pages
//	By emailId=	By.id("naveen@gmail.com");
//	By password=By.id("input-password");
//	
//	WebElement emailIdEle1 =driver.findElement(emailId);
//	WebElement passwordEle1=driver.findElement(password);
	
	
	//4=======>By loactor and Utility creation. Here we create a utility for driver.findElement(locator);, create by locators
	//and pass the variables to the methods directly.Here bylocators have to be created and driveris used only once.
	
//	By emailIdnew=	By.id("input-email");
//	By passwordnew=By.id("input-password");
	//getElement(emailIdnew).sendKeys("naveen@gmail.com");	//To call the getElement method directly we are creating the method as Static
	//getElement(passwordnew).sendKeys("test@123");
	
	//Another way of writing the above to show WebElement is used., getElement always returns a webElement
//	WebElement emailIdEle= getElement(emailIdnew);
//	WebElement passwrdEle=getElement(passwordnew);
//	emailIdEle.sendKeys("naveen@gmail.com");
//	passwrdEle.sendKeys("test@123");
	
	//5========>Use by locator and create Util funtions one for getElement and sendKeys
	
//	By emailIdnew=	By.id("input-email");
//	By passwordnew=By.id("input-password");
//	
//	doSendKeys(emailIdnew,"naveen@gmail.com" );   //FE , using getElement(driver.findElement(locator))
//	doSendKeys(passwordnew, "test@123");

	//6.Using By locator, Use ElementUtil =====> doSendKeys and getElement (Create an object for ElementUtil class constructor will be
	//  called and driver will be initialised with the ChromeDriver value.
		
		By emailIdnew=	By.id("input-email");
		By passwordnew=By.id("input-password");	
		ElementUtil obj=new ElementUtil(driver);
		
		obj.doSendKeys(emailIdnew, "naveen@gmail.com");
		obj.doSendKeys(passwordnew, "test@123");
		
	}	
	
	public static void doSendKeys(By locator, String value) { //Here we are creating a method to both find element and perform action
		getElement(locator).sendKeys(value);					//Here we are calling the getElement method long with sendKeys to merge and make easy
	}
	
	public static WebElement getElement(By locator) { 
		return driver.findElement(locator);
	}

	
	
}