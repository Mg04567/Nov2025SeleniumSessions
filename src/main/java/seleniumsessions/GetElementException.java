package seleniumsessions;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;    //Here we need 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementException {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		
			try {
				driver.findElement(By.id("input-firstnamee")).sendKeys("Shilpa");
			} 
			catch (NoSuchElementException e) {
				System.out.println("element not found using this locator");
				e.printStackTrace();
			}
	
		
		
		//driver.findElement(By.id("input-firstname1")).sendKeys("Shilpa");  //No such Element Exception when the element cannot be found
									// We'll use a try catch block to figure out the exception
	driver.quit();
	
	}

}

