package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitPolingTime {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://google.com");
		By emailId=By.id("input-email1");
	
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10)); //If we dont mention sleep here, Timeout=10ses, poliing
														//time=500 milli secs=0.5 secsdefault time
		
		
		
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5), Duration.ofSeconds(1));
		
		WebElement emailEle=wait.until(ExpectedConditions.visibilityOfElementLocated(emailId));
		emailEle.sendKeys("test123@gmail.com");
				
				//Here sleep time time is the suration to sleep between polls, which can be customised
	}

}
