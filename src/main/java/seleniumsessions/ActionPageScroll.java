package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionPageScroll {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		//driver.get("https://www.amazon.in/");
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		Actions act=new Actions(driver);
		
//		act.sendKeys(Keys.PAGE_DOWN).perform();
//		Thread.sleep(2000);
//		act.sendKeys(Keys.PAGE_UP).perform();
//		
//		Thread.sleep(2000);
//		act.sendKeys(Keys.END).perform();  //goes down TO THE end
//		Thread.sleep(2000);
//		act.sendKeys(Keys.HOME).perform();  //goes back to the top
//		act.sendKeys(Keys.SHIFT).sendKeys(Keys.SPACE).perform();   //step by step srolling
//		
		
		//Scroll to element
		Thread.sleep(2000);
		
//		act.scrollToElement(driver.findElement(By.linkText("Careers"))).pause(2000)
//		.click(driver.findElement(By.linkText("Help"))).perform();
//		
		
		act.scrollToElement(driver.findElement(By.linkText("OpenCart"))).pause(2000)
		.click(driver.findElement(By.linkText("Delivery Information"))).perform();
	}

}
