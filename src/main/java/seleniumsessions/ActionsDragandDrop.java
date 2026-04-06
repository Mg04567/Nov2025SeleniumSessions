package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDragandDrop {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		//WebElement soureEle=driver.findElement(By.xpath("//div[@id='draggable']"));
		By soureEle=By.id("draggable");
		By targetEle=By.id("droppable");
	//	WebElement targetEle=driver.findElement(By.xpath("//div[@id='droppable']"));
		Thread.sleep(2000);
		
    	
		
	act.dragAndDrop(driver.findElement(soureEle), driver.findElement(targetEle)).perform();
		
		
//		act.clickAndHold(driver.findElement(soureEle))
//		.moveToElement(driver.findElement(targetEle)).release().perform();
	}

}
