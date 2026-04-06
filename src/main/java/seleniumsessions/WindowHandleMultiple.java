package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandleMultiple {

	
		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException  {
		
			driver=new ChromeDriver();	
			driver.get("https://www.orangehrm.com/en/contact-sales");
			Thread.sleep(3000);
			driver.findElement(By.cssSelector(".CybotCookiebotBannerCloseButton")).click();
			Actions act	=new Actions(driver);
			act.sendKeys(Keys.END).perform();
			
			WebElement fb=driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
			WebElement lk=driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
			WebElement xc=driver.findElement(By.xpath("//a[contains(@href,'x.com')]"));
			WebElement yt=driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));
			//WebElement ig=driver.findElement(By.xpath("//a[contains(@href,'instagram')]"));
			fb.click();  
			lk.click();
			xc.click();
			yt.click();
			//ig.click();
			
			Set<String> handles=driver.getWindowHandles();
			Iterator<String> it=handles.iterator();
//		String windowHandle=it.next();
//		System.out.println(driver.getTitle());    
//												
//		String childHandle1=it.next();
//		System.out.println(driver.getTitle());
//		String childHandle2=it.next();
//		System.out.println(driver.getTitle());
//		driver.switchTo().window(childHandle1);
//		String childtitle=driver.getTitle();
//		System.out.println(childtitle);
			
			//Instead of writing repetitive it.next we can use a While Loop as we do not know	
			//the number of iterations here, if know iterations we can use for loop
		String parentId=driver.getWindowHandle();
		
		while(it.hasNext()) {
			String windowId=it.next();	
			driver.switchTo().window(windowId);
			System.out.println(driver.getTitle());       //We are using the if condition to make sure the parent window is not closed
			if (!windowId.equals(parentId)) {
				driver.close();	
			}
		}
		
		driver.switchTo().window(parentId);
		System.out.println(driver.getTitle());
		}
}
