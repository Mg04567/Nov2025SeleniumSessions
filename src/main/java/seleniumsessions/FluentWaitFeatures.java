package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitFeatures {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By emailId=By.id("input-email1");

//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.pollingEvery(Duration.ofSeconds(1))
//					.ignoring(NoSuchElementException.class)      //Fluent Wait Methods
//					.withMessage("---element not found---");
//		
//		WebElement usernameEle=wait.until(ExpectedConditions.visibilityOfElementLocated(emailId));
//		usernameEle.sendKeys("test@gmail.com");
		
		//Wait Interface  TopCasting is done here Between Parent Interface and Child Class object.Above methhod and below are same.
		//But above we have used Child class with fluent wait features, below we have done topcasting
		Wait<WebDriver> wait= new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(1))
				.ignoring(NoSuchElementException.class)      //Fluent Wait Methods
				.withMessage("---element not found---");
		WebElement usernameEle=wait.until(ExpectedConditions.visibilityOfElementLocated(emailId));
		usernameEle.sendKeys("test@gmail.com");
		
		
		
}
}
