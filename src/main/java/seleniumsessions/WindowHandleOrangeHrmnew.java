package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleOrangeHrmnew {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  {
	
		driver=new ChromeDriver();	
		driver.get("https://www.orangehrm.com/en/contact-sales");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".CybotCookiebotBannerCloseButton")).click();
		By facebook=By.xpath("//a[contains(@href,'facebook')]");
		By linkedin=By.xpath("//a[contains(@href,'linkedin')]");
		By xcom=By.xpath("//a[contains(@href,'x.com')]");
		By youtube=By.xpath("//a[contains(@href,'youtube')]");
		By instagram=By.xpath("//a[contains(@href,'instagram')]");
		
		String parenthandle=driver.getWindowHandle();
		doHandle(facebook, parenthandle);
		doHandle(linkedin, parenthandle);
		doHandle(xcom, parenthandle);
		doHandle(youtube, parenthandle);
		doHandle(instagram, parenthandle);
		driver.close();
		
//driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		
//		Set<String> handles=driver.getWindowHandles();
//		Iterator<String> it=handles.iterator();
//		String parenthandle=it.next();
//		String childhandle=it.next();
//		driver.switchTo().window(childhandle);
//		System.out.println(driver.getTitle()); 
//		driver.close();
//		driver.switchTo().window(parenthandle);
		
//		WebElement fb=driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
//		WebElement lk=driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
//		WebElement xc=driver.findElement(By.xpath("//a[contains(@href,'x.com')]"));
//		WebElement yt=driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));
//      WebElement ig=driver.findElement(By.xpath("//a[contains(@href,'instagram')]"));
		
		
	}
	
		public static void doHandle(By Locator, String windowid) throws InterruptedException {
			driver.findElement(Locator).click();
			Set<String> handles=driver.getWindowHandles();
			
			for (String windowhandle : handles) {
			if (!windowhandle.equals(windowid)) {
				driver.switchTo().window(windowhandle);
				System.out.println(driver.getTitle()); 
				driver.close();
				driver.switchTo().window(windowid);
				Thread.sleep(2000);
			}
		}
		}
		
	
	
	
	

}
