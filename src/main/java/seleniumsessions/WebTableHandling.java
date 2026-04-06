package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling {

	static WebDriver driver;
	public static void main(String[] args) {
		
		 driver=new ChromeDriver();
		
driver.get("https://naveenautomationlabs.com/opencart/ui/webtable.html");
selectUsername("Joe.Root");    //We can create a method for the complete driver.findelement and call the method here.
selectUsername("John.Smith");  //This doesnt matter where the username is or in wichever row it is this XPATH will work, for dynmi elements

//driver.findElement(By.xpath("//td[text()='Joe.Root']preceding-sibling::td/input[@type=checkbox']")).click();
//driver.findElement(By.xpath("//td[text()='John.Smith']preceding-sibling::td/input[@type=checkbox']")).click();
	}

	//td[text()='Jasmine.Morgan']/preceding-sibling::td/input[@type='checkbox']
	
	//UTILITY created here is application related utility not generi utility
	public static void selectUsername(String username) {
		driver.findElement(By.xpath("//td[text()='"+username+"']/preceding-sibling::td/input[@type='checkbox']")).click();
		
	}
}
