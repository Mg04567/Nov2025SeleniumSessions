package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsMoveToElement {
	static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
//		WebElement addOns=driver.findElement(By.xpath("//div[text()='Add-ons']"));
//
//		Actions act=new Actions(driver);
//		act.moveToElement(addOns).perform();
//		
//		driver.findElement(By.xpath("//div[text()='Visa Services']")).click();

		By addOns= By.xpath("//div[text()='Add-ons']");
		By visaServices=By.xpath("//div[text()='Visa Services']");
		
		handleMenu(addOns, visaServices);
		
	}

	public static void handleMenu(By parentLocator, By childlocator) {
		Actions act=new Actions(driver);
		act.moveToElement(getElement(parentLocator)).perform();  //addOns is webelement of parent bylocator, so we need to call 
																// the get element method moveToElement needs a webelement only.
		getElement(childlocator).click();
	
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}
