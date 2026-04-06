package seleniumsessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownOptions {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver =new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales");
		By country=By.id("Form_getForm_Country");
		
//		WebElement countryEle=driver.findElement(country);
//		
//		Select select=new Select(countryEle);
//		
//		List<WebElement> countryOptionsList=select.getOptions();
//		System.out.println("Total options"  + countryOptionsList.size());     //To get the total options available we can use the .size() method
//		
//	for (WebElement e : countryOptionsList) {     //To  print the options list as text we need to use the iteration method with for loop
//												//or for eah loop
//		String text=e.getText();
//		System.out.println(text);
//	}
	
		List<String> CountryList=getDropDownOptionsTextList(country);
		System.out.println(CountryList);
		
		
		
		//To check whether three four ountries are available or not....Assertion........ Contains() method
		//First create an arraylist and add those expected Countries to it
		
//		List<String> expectedCountryList=new ArrayList<String>();
//		expectedCountryList.add("India");
//		expectedCountryList.add("Australia");
//		expectedCountryList.add("Brazil");
		
//		if (CountryList.containsAll(expectedCountryList)) {
//			System.out.println("Countries are present");
//		} else {
//			System.out.println("Countries are NOT present");
//		}
		
		List<String> expectedCountryList=Arrays.asList("India","Australia","Brazil" );   //Instead of using containsAll method we ca use Arrays.asList() Method	                    
																//with comma seperated values to diretly vlidate the values
		if (CountryList.containsAll(expectedCountryList)) {
			System.out.println("Countries are present");
		} else {
			System.out.println("Countries are NOT present");
		}
		
		int optionssize=getDropDownOptionsount(country);
		System.out.println("Totak count is: " +optionssize);
		
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static int getDropDownOptionsount(By locator) {
		Select select= new Select(getElement(locator));
		return select.getOptions().size();
		
	}
	
	public static List<String> getDropDownOptionsTextList(By locator) {
		Select select= new Select(getElement(locator));
		List<WebElement> OptionsList=select.getOptions();
		List<String> textdata=new ArrayList<String>();
		for (WebElement e : OptionsList) {
			String text=e.getText();
			textdata.add(text);
			}
		return textdata;
	}
	
}
