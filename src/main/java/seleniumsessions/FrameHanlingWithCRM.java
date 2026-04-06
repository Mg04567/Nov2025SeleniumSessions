//NEED TO FILL THE ENTIRE CRMPRO FORM

package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FrameHanlingWithCRM {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();		
		driver.get("https://classic.crmpro.com/index.html");
		
		driver.findElement(By.name("username")).sendKeys("apiautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		Actions act=new Actions(driver);
		
		Thread.sleep(2000);
		driver.switchTo().frame("mainpanel");
		act.moveToElement(driver.findElement(By.linkText("CONTACTS"))).perform();

		driver.findElement(By.linkText("New Contact")).click();
		WebElement titledd=driver.findElement(By.name("title"));
		
		Select select=new Select(titledd);
		select.selectByIndex(4);
		
		driver.findElement(By.id("first_name")).sendKeys("Radhika");
		
	}

}
