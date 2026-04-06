package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class WaitForURLTitle {

	
	//Correct way of fetching title instead of driver.getTtile, we have to create a wrapper function on top of driver.getTitle,
	//wait for it and get the Title
	
	static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.titleContains("customer relationship management123"));
//		String title=driver.getTitle();
//		System.out.println(title);
		
		String title=waitForTitleContains("customer relationship management", 5);
		System.out.println(title);
		
		driver.findElement(By.linkText("Pricing")).click();
		String url=waitForURLContains("pricing.html", 10);
		System.out.println(url);
		String urlfull=waitForURLToBe("https://classic.freecrm.com/pricing.html", 10);
		System.out.println(urlfull);
		
	}

	//If title is wrong we will get a timeout Exception at Line 19, Hence we need to use a try catch block to handle the Exception
	
	public static String waitForTitleContains(String titlevalue,long timeout ) {
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
		try {
			wait.until(ExpectedConditions.titleContains(titlevalue));
			return driver.getTitle();				//Whatever URL is available return that URL
		} catch (TimeoutException e) {
			System.out.println(titlevalue + ": is not found");
			e.printStackTrace();
			return null;				//If the exception is there it'll come inside the catch block , and it must return Something
							//of type String as the method is of type String, hence we can return the default value null
		}
	}
		
		public static String waitForTitleIs(String titlevalue,long timeout ) {
			
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
			try {
				wait.until(ExpectedConditions.titleIs(titlevalue));
				return driver.getTitle();
			} catch (TimeoutException e) {
				System.out.println(titlevalue + ": is not found");
				e.printStackTrace();
				return null;				
			}
		}
	
		public static String waitForURLContains(String URLvalue,long timeout ) {
			
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
			try {
				wait.until(ExpectedConditions.urlContains(URLvalue));
				
			} catch (TimeoutException e) {
				System.out.println(URLvalue + ": is not found");
				e.printStackTrace();
								//If the exception is there it'll come inside the catch block , and it must return Something
								//of type String as the method is of type String, hence we can return the default value null
			}
			return driver.getCurrentUrl();
		}
	
public static String waitForURLToBe(String URLvalue,long timeout ) {
			
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
			try {
				wait.until(ExpectedConditions.urlToBe(URLvalue));
				
			} catch (TimeoutException e) {
				System.out.println(URLvalue + ": is not found");
				e.printStackTrace();
								//If the exception is there it'll come inside the catch block , and it must return Something
								//of type String as the method is of type String, hence we can return the default value null
			}
			return driver.getCurrentUrl();
		}
	
}
