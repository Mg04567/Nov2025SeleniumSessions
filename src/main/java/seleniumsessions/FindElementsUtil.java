package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsUtil {

	static WebDriver driver;
	public static void main(String[] args) {
		driver= new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/en/contact-sales");
//		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
//		List<WebElement> allOptions=driver.findElements(By.xpath("//select[@name='Country' ]/option"));
//		List<WebElement> allimages=driver.findElements(By.tagName("img"));
//		
		By links=By.tagName("a");
		By images=By.tagName("img");
		By options=By.xpath("//select[@name='Country' ]/option");
		
		//allLinks.size();
//		int allLinks=getElements(links).size();
//		int allimages=getElements(images).size();
//		int alloptions=getElements(options).size();
		
		int allLinks=getelementsCount(links);
		int allimages=getelementsCount(images);
		int alloptions=getelementsCount(options);
		
		System.out.println(allLinks);
		System.out.println(allimages);
		System.out.println(alloptions);
		
		List<String> linksTextList=getElementsTextList(links);
		System.out.println(linksTextList);
		
		List<String> optionsTextList=getElementsTextList(options);
		System.out.println(optionsTextList);
		}
	

	
	public static List<String> getElementsTextList(By locator) {   //This metod has to return a list of the text and should not be avoid
		List<WebElement> elementList=getElements(locator);		//So we need to create an empty array list and store the values in the
		List<String> eleTextList=new ArrayList<String>();						//array list and return the arralylist.
															//If we mention return type as String then tis metod can return only
															//one text , not a list of text.List an be only store =d in an array
															//Arraylist has VC=10 and PC=0
		for (WebElement e : elementList) {
			String text=e.getText();
			if (text.length()!=0) {
				eleTextList.add(text);	//This will keep adding the text into the Arraylist
			}
		}
		return eleTextList;
		}
	
	
		
	public static int getelementsCount(By locator) {
		return getElements(locator).size();
	}
	
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
		
	}

}
