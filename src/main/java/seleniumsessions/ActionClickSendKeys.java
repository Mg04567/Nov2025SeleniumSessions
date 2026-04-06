package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClickSendKeys {

	static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		WebElement lastname=driver.findElement(By.id("input-lastname"));
		WebElement poliychk=driver.findElement(By.name("agree"));
			
		
			Actions act=new Actions(driver); 
			act.sendKeys(lastname, "automation").perform();    //action class sendkeys
			act.click(poliychk).perform();					//action class click
	}

}
