package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeConcept {
static WebDriver driver;
	public static void main(String[] args) {
		driver =new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales");
		
		//driver.findElement(By.id("Form_getForm_FullName")).sendKeys("Ashish");
			//String newText=	driver.findElement(By.id("Form_getForm_FullName")).getAttribute("value");
			
				
			By newAttr=By.id("Form_getForm_FullName");
			ElementUtil elUtil=new ElementUtil(driver);
			
			elUtil.doSendKeys(newAttr, "Naveen Automation");   //we can enter the text using the sendkeys utility
			String placeholder_Fullnam=elUtil.getElementAttribute(newAttr, "placeholder");
			
			
			String entereVal=elUtil.getElementAttribute(newAttr, "value");
			
			
			//String newText=	driver.findElement(By.id("Form_getForm_FullName")).getAttribute("name"); this will not work
			//String newText=	driver.findElement(By.id("Form_getForm_FullName")).getText(); //value will be blank, this also will not work
			System.out.println(placeholder_Fullnam);
			System.out.println(entereVal);
	
	}
	
//	public static String getElementAttribute(By locator,String name) {
//		return get(locator).getAttribute(name);              //Attribute Util in ElementUtil
//	}

}
