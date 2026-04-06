package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketMoveToElement {
 static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		 driver=new ChromeDriver();
		
		driver.get("https://www.bigbasket.com/");
	By shopBycategory=By.id("headlessui-menu-button-:Ramkj6:");
	By foodcourt=By.linkText("Food Court");  
	By coldbeverages=By.linkText("Cold Beverages");
	By icedtea=By.linkText("Iced Tea");

	multipleMenu(shopBycategory, foodcourt, coldbeverages, icedtea);
	//Actions act=new Actions(driver);
//	driver.findElement(shopBycategory).click();
//	Thread.sleep(2000);
//
//	act.moveToElement(driver.findElement(foodcourt)).perform();
//	Thread.sleep(2000);
//	
//	act.moveToElement(driver.findElement(coldbeverages)).perform();
//	Thread.sleep(2000);
//	
//	act.moveToElement(driver.findElement(icedtea)).click();

	}

	
	public static void multipleMenu(By locator1, By locator2,By locator3, By locator4) throws InterruptedException {
		Actions act=new Actions(driver);
		doClick(locator1);
		Thread.sleep(2000);

		act.moveToElement(getElement(locator2)).perform();
		Thread.sleep(2000);
		
		act.moveToElement(getElement(locator3)).perform();
		Thread.sleep(2000);
		
		doClick(locator4);
		
	
	}

	public static void doClick(By locator) {
		getElement(locator).click();
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	
 
}
