package seleniumsessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForElements {

	//Wait for Elementns for Footer Links
	static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By footerLinks=By.xpath("//footer//a");
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		//List<WebElement> footerLinksList=wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(footerLinks));
		
		List<WebElement> footerLinksList=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(footerLinks));
	}

}
