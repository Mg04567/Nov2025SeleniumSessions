package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorChain {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//driver.findElement(By.id("account")).findElement(By.id("input-firstname")).sendKeys("test");
		
		
		//Here account id is parent Element ...and input-firstname id is the child element...the chaining not needed
		//as we an write CSS selector itself from parent to child
		
		driver.findElement(By.cssSelector("fieldset#account input#input-firstname")).sendKeys("test1");
	}

}
