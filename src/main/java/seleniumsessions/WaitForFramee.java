package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForFramee {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form");
		
		//Here we need to wait for the Image to be loaded.
		
		By image=By.xpath("//img[@title='Vehicle-Registration-Forms-and-Examples']" );
		By frameLocator=By.xpath("//iframe[contains(@id,'frame-one')]");
		By title=By.id("RESULT_TextField-1");
		
		ElementUtil eleUtil=new ElementUtil(driver);
		
		eleUtil.waitForElementVisible(image, 10).click();
		WaitForFrameAndSwitchToIt(frameLocator, 10);
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));	
												//This method checks if frame is available
												//within 10 secs and automatically swithes toit.No need to write driver.switchTo.frame()
		
		//Again we need wait to enter wait for the title field hence we ca us
		
		eleUtil.waitForElementVisible(title, 5).sendKeys("Test Automation");
		
		driver.switchTo().defaultContent();
		String text=driver.findElement(By.cssSelector(".details__form-preview-title" )).getText();
		System.out.println(text);
		}

	//To wait for Frame and switch to frame autommatically the wait.unitil() can be used with FrameId, FrameIndex,Frame WebElemant 
		//and FrameLocator
	public static void WaitForFrameAndSwitchToIt(By frameLocator,long timeout) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));	
	}
	
	public static void WaitForFrameAndSwitchToIt(int frameIndex ,long timeout) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));	
	}
	
	public static void WaitForFrameAndSwitchToIt(String FrameIdOrName ,long timeout) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(FrameIdOrName));	
	}
	
	public static void WaitForFrameAndSwitchToIt(WebElement FrameElement ,long timeout) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(FrameElement));	
	}
	
}
