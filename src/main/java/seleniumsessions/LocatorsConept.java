package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsConept {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//1=====>Id is always Unique Attribute cannot be duplicate
		driver.findElement(By.id("input-firstname")).sendKeys("testing");
		
		//2=====> Name can be unique attribute...it an be duplicate also ..hence id attribute is always preffered first.
		driver.findElement(By.name("lastname")).sendKeys("automation");
		
		
		//3=====> Class name attribute is not unique, class name will be assigned to all elements so that the elements on the pge 
		//look alike.
		//Class name is used to make all the elements to look alike.
		//So this approach is nont the right approach
		
		driver.findElement(By.className("form-control")).sendKeys("test@gmail.com");  //Here class name is getting assigned to the first element
		boolean isLogoExist=driver.findElement(By.className("img-responsive")).isDisplayed();
		System.out.println(isLogoExist);    //To show if the image  is available or not.

		//4=====XPATH: If the above attributes are not avialable then we can use XPATH
		driver.findElement(By.xpath("//*[@id=\"input-telephone\"]")).sendKeys("12345678");
		
		//5====>  CSS Selector
		driver.findElement(By.cssSelector("#input-password")).sendKeys("test@123");
		
		
		//6====>  Link Text ..text of the link , it'll work only for links
		//Text is not an attribute
		
		//driver.findElement(By.linkText("Forgotten Password")).click();
		
		//7=====>  Partial Link text ,  this is similar to link text but here we can use a part of the link text when the text is too big
		//driver.findElement(By.linkText("Forgotten")).click();
		
		//8======> TAG Name , tag names can be used if they are unique.
		
	    String inputReader=	driver.findElement(By.tagName("h1")).getText();
		if (inputReader.equals("Register Account")) {
			System.out.println("PASS");
		}
		else {
			System.out.println("Fail");
		}
	}

}
