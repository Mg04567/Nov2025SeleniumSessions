package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AuthPopUpHandle {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();		
//		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
//		
		//We can also initiate the Usernme and password as below and enter the URL with the variable name
		
		String username="admin";
		String password="admin";
		driver.get("https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");
	}

}
