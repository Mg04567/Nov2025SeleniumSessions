package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		// ChromeDriver driver=new ChromeDriver(); //Default construtor of Chromedriver
		// class, object is created and browser is launched.

		WebDriver driver = new ChromeDriver();    //Launch BROWSER, topacsting can be done so that we can use the same object with Other Browser
		//WebDriver driver = new FirefoxDriver(); 		//For acheiving Cross Browser
		
		driver.get("naveenautomationlabs.com");  //enter the URL
		
		String title = driver.getTitle();				//gett the title
		System.out.println("title: " + title);

		if (title.equals("Welcome to Naveen AutomationLabs -")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		String url = driver.getCurrentUrl();			//get the Current URL
		System.out.println("url: " + url);

		if (url.contains("naveenautomationlabs")) {
			System.out.println("URL is correct");
		} else {
			System.out.println("URL is wrong");

		}

		//driver.close();
	}

}
