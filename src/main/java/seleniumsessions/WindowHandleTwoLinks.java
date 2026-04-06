package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleTwoLinks {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  {
	
		driver=new ChromeDriver();	
		driver.get("https://www.orangehrm.com/en/contact-sales");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".CybotCookiebotBannerCloseButton")).click();
		
		driver.findElement(By.linkText("Contact Us")).click();
		
		Set<String> newhandles=driver.getWindowHandles();
		Iterator<String> it=newhandles.iterator();
		String parenthandle=it.next();
		String child1=it.next();
		System.out.println("parent handle"  +driver.getCurrentUrl());
		
				driver.switchTo().window(child1);
				System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.linkText("Press Releases")).click();
		
		newhandles=driver.getWindowHandles();

		for (String handles1 : newhandles) {
			
		if (!handles1.equals(parenthandle)&&!handles1.equals(child1) ) {
		driver.switchTo().window(handles1);
		
		System.out.println(driver.getCurrentUrl());
				}
	}
		
		driver.findElement(By.linkText("Careers")).click();
		newhandles=driver.getWindowHandles();
		
		System.out.println(driver.getCurrentUrl());
	}	
	}
		
	
   

