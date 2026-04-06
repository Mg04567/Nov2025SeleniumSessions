package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForURL {


	static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		Boolean urlname=wait.until(ExpectedConditions.urlContains("crmpro"));
		
		
		
		//String urlname=driver.getCurrentUrl();
		
		System.out.println(urlname);
		
	}

}
