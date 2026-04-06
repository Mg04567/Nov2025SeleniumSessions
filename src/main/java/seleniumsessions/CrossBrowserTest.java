package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowserTest {
	static WebDriver driver;
	public static void main(String[] args) {
		String browser="Firefox";  //This will give a null pointer exception as Shilpvalue doesnt exist, the driver.get will be assigned
									//null value .Fr this we can declare our custom Exception also.Throw keyword is used.
		
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			//System.out.println("Chrome Browser");
			driver=new ChromeDriver();  // Opens the browser, instead of calling the driver object fr every browser ,we
										//can declare the driver object as static before the method
			break;
		case "firefox":
			//System.out.println("firefox Browser");
			driver=new FirefoxDriver();
			break;	
			
		case "edge":
			//System.out.println("edge Browser");
			driver=new EdgeDriver();
			break;		

		case "safari":
			//System.out.println("safari Browser");
			driver=new SafariDriver();
			break;	
			
		default:
			System.out.println("Not valid browser");
			throw new BrowserException("Browser is not valid");
		//	break;                    Break will not work for custom Exception
		}
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		if (title.equals("OrangeHRM")) {
			System.out.println("Title is correct");
		} else {
			System.out.println("Title is not correct");
		}
		
		
		String url=driver.getCurrentUrl();
		System.out.println("url is: " +url);
		if (url.contains("opensource-demo.orangehrmlive.com")) {
			System.out.println("The URL is correct");
		} else {

			System.out.println("The URL is not correct");
		}

		driver.close();

		
	}

}
