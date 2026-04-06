package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By logo=By.xpath("//img[@class='img-responsive']");
		By emailId=By.id("input-email");
		By pwd=By.id("input-password");
		By LoginBtn=By.xpath("//input[@value='Login']");
		
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
//		WebElement emailIdEle=wait.until(ExpectedConditions.presenceOfElementLocated(emailId));
//		emailIdEle.sendKeys("test@gmail.com");
//		
//		WebElement passwdEle=driver.findElement(pwd);
//		passwdEle.sendKeys("test@123");
//		
//		WebElement loginBtnEl=driver.findElement(LoginBtn);
//		loginBtnEl.click();
//		
//		//Need expliit wait of 5 secs for logo, again use object of WebDriverWait
//		//WebElement logoEle=driver.findElement(logo);
//		
//		WebElement logoEle=wait.until(ExpectedConditions.presenceOfElementLocated(logo));
//		System.out.println(logoEle.isDisplayed());
		
		
		//Here out of 4 elements we are explicitly applying wait for 2 elements
//		waitForElementPresence(emailId, 20).sendKeys("test@gmail.com");
//		getElement(pwd).sendKeys("test@123");
//		getElement(LoginBtn).click();
//		Boolean flag=waitForElementPresence(logo, 10).isDisplayed();
//		System.out.println(flag);
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement emailIdEle=wait.until(ExpectedConditions.visibilityOfElementLocated(emailId));
		emailIdEle.sendKeys("test@gmail.com");
		}
	
	public static WebElement waitForElementPresence(By locator,long timeout) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public static WebElement waitForElementVisible(By locator,long timeout) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}
