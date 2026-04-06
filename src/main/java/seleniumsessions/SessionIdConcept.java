package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SessionIdConcept {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
						//A new Session id is generated 
		String title=driver.getTitle();     //same session id is same
		System.out.println(title);
		
		String url=driver.getCurrentUrl();  //same session id is same
		System.out.println(url);			//same session id is same
		
		//driver.quit();						//session id becomes null , //This will give a NoSuchSession Exception
												//Thw whole browser gets closed inluding all the tabs
		
		driver.close();							//session id still exists the same but becomes invalid./expired
												//To resolve this issue we have to launch a fresh browser and will get a new session id
												//Closes only the speific window	
		
		//System.out.println(driver.getTitle());       
		
		//To issue a query after driver.quit() , we need to launch the browser again
		
		
		driver=new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		System.out.println(driver.getTitle());  
		
	}

}
