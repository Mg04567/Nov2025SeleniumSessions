package seleniumsessions;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandleBrowser {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  {
	
		driver=new ChromeDriver();	
		driver.get("https://www.orangehrm.com/en/contact-sales");
		
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector(".CybotCookiebotBannerCloseButton")).click();
		//driver.findElement(By.linkText("Contact Us")).click();
		//Suppose if the above click() method doesnt work we an use Action class
		Actions act	=new Actions(driver);
		
		act.click(driver.findElement(By.linkText("Contact Us"))).perform();
		
		//Now the driver is in the window and we need to switch it back
		//1.Get window ID's
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		String parentWindow=it.next();
		System.out.println("parentWindow id: " +parentWindow);
		String childWindow=it.next();
		System.out.println("childWindow id: " +parentWindow);
		
		//2.Switching work
		driver.switchTo().window(childWindow);
		String childtitle=driver.getTitle();
		System.out.println("child Window Title is: " +childtitle);
		driver.close();    //Closes thhe child window
		
		driver.switchTo().window(parentWindow);
		String parenttitle=driver.getTitle();
		System.out.println("Parent Window Title is: " +parenttitle);
		driver.quit();   //Closes the parent window also
		
		
	}

}
