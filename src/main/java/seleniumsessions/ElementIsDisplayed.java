package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsDisplayed {
 static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		//Boolean flag=driver.findElement(By.id("input-firstname1")).isDisplayed();

		
			//If the element is not found it gives NoSuchElement Exception....it will nont give flse as it will nont get into the 
		//next line of exeution.
		
		
		//System.out.println(flag);
		
		By firstname=By.id("input-firstname1");  //When no element found it gives no Such ElementFound at line no 34.Hence we 
												//can catch the error using try catch blok
		
		  //isElementDisplayed(firstname);  For Boolean return we can directly pass this in the if condition
		if (isElementDisplayed(firstname)) {
			System.out.println("FN is displayed on the page --- passed");
		} else {
				System.out.println("FN is not displayed on the page --- Fail");
		}
	}

	
	public static Boolean isElementDisplayed(By Locator) {
		try {
			return getElement(Locator).isDisplayed(); //Here we an retun Boolean as isDisplayed() returns a boolean value and fr metod
														//we should mention as return .
		} catch (NoSuchElementException e) {
			System.out.println("Element not found using this locator"  + Locator);
			e.printStackTrace();
			return false;                              //If element is found return true if element is not found it'll not give false
														//it'll give Exception .
		}
		  
		
	}
	
	public static WebElement getElement(By Locator) {
		return driver.findElement(Locator);
		
	}
}
