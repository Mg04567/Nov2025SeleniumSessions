package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleeOrangeHrm {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  {
	
		driver=new ChromeDriver();	
		driver.get("https://www.orangehrm.com/en/contact-sales");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".CybotCookiebotBannerCloseButton")).click();
		
		String parenthandle=driver.getWindowHandle();
		String childhandle=driver.getWindowHandle();
		
		driver.findElement(By.linkText("Contact Us")).click();
		doHandles(parenthandle);
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.linkText("Press Releases")).click();
		doHandles(parenthandle);
		System.out.println(driver.getCurrentUrl());
		
		
		driver.findElement(By.linkText("Careers")).click();
		doHandles(parenthandle);
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		
//		driver.findElement(By.xpath("button[text()='Book a Free Demo']")).click();
//		doHandles(parenthandle);
//	System.out.println(driver.getCurrentUrl());
		
//		for (String windowhandle : driver.getWindowHandles()) {
//			if (!parenthandle.equals(windowhandle)) {
//				driver.switchTo().window(windowhandle);
//				System.out.println(driver.getCurrentUrl());
//				}
//			}
//		
		
//		driver.findElement(By.linkText("Press Releases")).click();
//		
//		for (String windowhandle : driver.getWindowHandles()) {
//			if (!parenthandle.equals(windowhandle)) {
//				driver.switchTo().window(windowhandle);
//				System.out.println(driver.getCurrentUrl());
//				}
//		}
//		
//		driver.findElement(By.linkText("Careers")).click();
//		for (String windowhandle : driver.getWindowHandles()) {
//			if (!parenthandle.equals(windowhandle)) {
//				driver.switchTo().window(windowhandle);
//				System.out.println(driver.getCurrentUrl());
//				}
	}
	

	public static void doHandles(String id) throws InterruptedException {
Set<String> handle=driver.getWindowHandles();
	for (String windowhandle : handle) {
		if (!windowhandle.equals(id)) {
			driver.switchTo().window(windowhandle);
			Thread.sleep(2000);
			//System.out.println(driver.getCurrentUrl());
			
			}}}}
