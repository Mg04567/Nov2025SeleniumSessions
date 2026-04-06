package seleniumsessions;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StaleElementRefernce {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
//		WebElement email=driver.findElement(By.id("input-email1"));
		
//		email.sendKeys("test123@gmail.com");
//		Thread.sleep(2000);
//		driver.navigate().refresh();
//		Thread.sleep(2000); 
//		//email.sendKeys("naveen123@gmail.com");    //This will always give a StaleElementRefernce Exception as the page is refreshed
//													//and the webElement id will no longer match and even the DOM will be refreshed
//		//Hence we need to reinitialise the elemnt and then assign the new value
//		
//		email=driver.findElement(By.id("input-email"));
//		email.sendKeys("naveen123@gmail.com");
		
		
//		By emailId=By.id("input-email1");
//		getElement(emailId).sendKeys("naveen@gmail.com");
//		driver.navigate().refresh();
//		getElement(emailId).sendKeys("test123@gmail.com");
	
		By emailId=By.id("input-email1");
		getElement(emailId, 5).sendKeys("test123@gmail.com");  //Testing here for wrong locator and timeout Exception
		}

	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static WebElement getElement(By locator, long timeout) {
		try {
			return driver.findElement(locator);			//Suppose the webelement is wrong not found It'll will throw ElementNoFound 
														//Exception , hene we can declare the try cath blok to handle Exception
		} catch (NoSuchElementException e) {
			System.out.println("Element not found" +locator);
			e.printStackTrace();							//After printing stak trace...if we wnt to wait for few seonds again a
															//for the element we can use the WebDriverWait
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));  //Normal webDriver Wait
			return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			
		}
		
		
		
	}
}
