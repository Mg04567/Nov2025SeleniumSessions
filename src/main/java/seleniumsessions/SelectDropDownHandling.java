package seleniumsessions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownHandling {

	static WebDriver driver;
	public static void main(String[] args) {
		driver =new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales");

		//WebElement dropdown=driver.findElement(By.id("Form_getForm_Country"));
		
		By country=By.id("Form_getForm_Country");
//		WebElement countryEle=driver.findElement(country);
//		
//		Select select=new Select(countryEle);
//		select.selectByIndex(1);
//		select.selectByValue("Algeria");
//		select.selectByVisibleText("American Samoa");
		
		By employee=By.id("Form_getForm_NoOfEmployees");    //For the seond drop down , we need to create another by class argument
//		WebElement NoofEmployee=driver.findElement(employee);
//		
//		Select selectnew=new Select(NoofEmployee);    //For second drop down , we need to create anoter Selct objet
//		selectnew.selectByIndex(1);
//		selectnew.selectByValue("11 - 50");
//		selectnew.selectByVisibleText("51 - 200");
		
//		dodropDownSelectByIndex(country, 1);
//		dodropDownSelectByIndex(employee, 1);
//		dodropDownSelectByValue(country, "Algeria");
//		dodropDownSelectByValue(employee, "11 - 50");
//		dodropDownSelectByVisibleText(country, "American Samoa");
//		dodropDownSelectByVisibleText(employee, "51 - 200");
		
		ElementUtil elUtil=new ElementUtil(driver);
		elUtil.dodropDownSelectByIndex(country, 1);
		elUtil.dodropDownSelectByIndex(employee, 1);
		elUtil.dodropDownSelectByValue(country, "Algeria");
		elUtil.dodropDownSelectByValue(employee, "11 - 50");
		elUtil.dodropDownSelectByVisibleText(country, "American Samoa");
		elUtil.dodropDownSelectByVisibleText(employee, "51 - 200");
		
		
	}
	
//	public static WebElement getElement(By locator) {
//		return driver.findElement(locator);
//	}
//	
//	public static void dodropDownSelectByIndex(By locator, int index) {
//		 Select select=new Select(getElement(locator));
//		 select.selectByIndex(index);
//	}
//	
//	public static void dodropDownSelectByValue(By locator, String value) {
//		Select select=new Select(getElement(locator));
//		select.selectByValue(value);
//	}
//	
//	public static void dodropDownSelectByVisibleText(By locator, String text) {
//		Select select=new Select(getElement(locator));
//		select.selectByValue(text);
//	}

}
