package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsTabSequence {

	static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		WebElement firstname=driver.findElement(By.id("input-firstname"));

		Actions act=new Actions(driver);
		
		act.sendKeys(firstname, "Arun")
		.sendKeys(Keys.TAB).pause(200)
		.sendKeys("kumar")
		.sendKeys(Keys.TAB).pause(200)
		.sendKeys("kumar@gmail.com")
		.sendKeys(Keys.TAB).pause(200)
		.sendKeys("234567377")
		.sendKeys(Keys.TAB).pause(200)
		.sendKeys("kumar@123")
		.sendKeys(Keys.TAB).pause(200)
		.sendKeys("akumar@123")
		
		.sendKeys(Keys.TAB).pause(200)
		
		.sendKeys(Keys.TAB).pause(200)
		.sendKeys(Keys.TAB).pause(200)
		.sendKeys(Keys.SPACE).sendKeys(Keys.TAB)
		.sendKeys(Keys.ENTER).build().perform();		//keys.SPACE will click on the element, or checkbox again tab to go to continue
											//keys.ENTER to click on continue
		
		
	//		act.sendKeys(firstname, "Prasad")
//		.sendKeys(Keys.TAB).pause(200)
//		.sendKeys("Sharma")
//		.sendKeys(Keys.TAB).pause(200)
//		.sendKeys("prasad@gmail.com")
//		.sendKeys(Keys.TAB).pause(200)
//		.sendKeys("7373373737")
//		.sendKeys(Keys.TAB).pause(200)
//		.sendKeys("sharma@123")
//		.sendKeys(Keys.TAB).pause(200)
//		.sendKeys("sharma@123")
//		.sendKeys(Keys.TAB).pause(200)
//		.sendKeys(Keys.TAB).pause(200)
//		.sendKeys(Keys.TAB).pause(200)
//		.sendKeys(Keys.SPACE)
//		.sendKeys(Keys.TAB).pause(200)
//		.sendKeys(Keys.ENTER)
//		.build().perform();
//		
	}

}
