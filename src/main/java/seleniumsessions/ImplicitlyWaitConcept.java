package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWaitConcept {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement logo=driver.findElement(By.xpath("//img[@alt='naveenopencart']"));
		WebElement username=driver.findElement(By.cssSelector("#input-email"));
		//e3, e4 , e5
		
		//HomePage: 20secs
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//e6  e7  e8
		
		//Login Page  : 10secs.....again speify the implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//register page : 5 secs
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//forgot pwd page: 0 secs
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));    //Nullification of Implicit wait
		//e1, e2, e3
		}

}
