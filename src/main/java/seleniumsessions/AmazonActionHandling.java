package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class AmazonActionHandling {

		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException  {
			 driver=new ChromeDriver();
			 ElementUtil eutil=new ElementUtil(driver);
			
			driver.get("https://www.amazon.in/");
			
			Thread.sleep(2000);
			
			
			By accountLogin=By.id("nav-link-accountList-nav-line-1");
			By accountLogin1=By.xpath("//span[@class='nav-line-2 ']");
			
			Actions act=new Actions(driver);
			act.moveToElement(driver.findElement(accountLogin)).perform();
			
			
			driver.findElement(By.xpath("//span[text()='Sign in']")).click();
			
			driver.findElement(By.id("ap_email_login")).sendKeys("9902695110");
			driver.findElement(By.id("continue")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("ap_password")).sendKeys("Amazon123");
			
			driver.findElement(By.id("signInSubmit")).click();
			
			Thread.sleep(2000);
			
			//WebElement accountLogin1=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
			act.moveToElement(driver.findElement(accountLogin1)).perform();
			
			Thread.sleep(2000);
			driver.findElement(By.id("nav-item-signout")).click();
			
			
	}

}
