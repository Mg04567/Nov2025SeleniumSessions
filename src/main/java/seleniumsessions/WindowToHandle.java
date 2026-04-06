package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowToHandle {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  {
	
		driver=new ChromeDriver();	
		driver.get("https://www.orangehrm.com/en/contact-sales");
		String parentHandle=driver.getWindowHandle();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".CybotCookiebotBannerCloseButton")).click();
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parentHandle);
		
		System.out.println(driver.getTitle());
		
	}

}
