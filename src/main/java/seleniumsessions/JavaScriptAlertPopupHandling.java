package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlertPopupHandling {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
	//driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//	Alert alt=driver.switchTo().alert();    //Alert is an interface here
//	
//	String text=alt.getText();
//	System.out.println(text);
//
//	alt.accept();
	//alt.dismiss();
	Thread.sleep(2000);
	
//	driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//	
//	Alert alt=driver.switchTo().alert();
//	String text=alt.getText();
//	System.out.println(text);
//	
//	Thread.sleep(2000);
//	//alt.accept();
//	alt.dismiss();
	
	driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	Alert alt=driver.switchTo().alert();
	String text=alt.getText();
	System.out.println(text);
	
	alt.sendKeys("admin");
	alt.accept();
	}

}
