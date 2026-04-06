package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		
		//To get the number of all links
		//To get the text of links iterate using for and foreah loop
		//To remove the links without text/blank text.	
		//To find out broken links
		
	List<WebElement> allLinks=driver.findElements(By.tagName("a"));
	System.out.println("The number of links is : " + allLinks.size());
	
	//Get the text of the link by using for loop or for eah loop
	
	for (WebElement a : allLinks) {
		String linktext=a.getText();
		if (linktext.length()!=0) {
			System.out.println(linktext);
		} 
		
	}
	
	System.out.println("===================");
	for (int i = 0; i < allLinks.size(); i++) {
		String text=allLinks.get(i).getText();      //Here it checks the array from oth index and gets the text and prints the text 
		if (text.length()!=0) {   
		System.out.println(text);
	}
		
	}

}
}
