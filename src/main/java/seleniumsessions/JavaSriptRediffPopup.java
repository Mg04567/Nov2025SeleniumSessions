package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaSriptRediffPopup {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new FirefoxDriver();		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Log In']")).click();
		
		Alert alt=driver.switchTo().alert();
		String text=alt.getText();
		System.out.println(text);
		alt.accept();
		
	}

}
