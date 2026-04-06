package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {
 
	 private WebDriver driver;
	
	    /**
		 * Tihs method initialise driver on basis of Browsername
		 *@param browserName
		 *@return  return driver
		 */
			
		public WebDriver initDriver(String browser)  {			//First step initialise the Driver ,here the initialise Driver metod
			
		System.out.println("Browser name is: " + browser);						//will be public and the webdriver driver will be private so that outsie the class
		switch (browser.toLowerCase().trim()) {		//we can call the initDriver method which will use the private variable and call Browser
		
		case "chrome":								//Concept of encapsulation
			driver=new ChromeDriver();
			break;
		case "firefox":
			driver=new FirefoxDriver();
			break;
		case "safari":
			driver=new SafariDriver();
			break;
		case "edge":
			driver=new EdgeDriver();
			break;	
		default:
			System.out.println("Please pass the right Browser");
			throw new BrowserException("Invalid Browser");
		}
		return driver;
		}
		
		
		/**This method is used to enter the URL in the browser.
		 * @param url
		 */
		public void enterURL(String url) {
			if (url==null) {					//Null check condition ......Selenium will not supply these exceptions, custom exceptions
												//with custom Utilities.
				throw new BrowserException("Invalid URL-URL cannot be null");
				}
			if (url.indexOf("http")!=0) {    //Index of http is always 0 .Means http is at starting always.
											//If http is not available at 0th position throw an exception.  
				throw new BrowserException("Invalid URL - http or https is missing in the URL");
			}
			driver.get(url);				//No need of return fr this method.
		}
		 
		/**
		 * get the page title
		 * @return
		 */
		public String getPageTitle() {   //No need OF NULL Check as it just return whatever title is there , we are not passing any valiues
		String title=driver.getTitle();
		System.out.println(title);  		//here we are printing the title nd returning the title to user
			return title;
			}
		
		
		public String getPageUrl() {
			String url=driver.getCurrentUrl();
			System.out.println(url);
			return url;
		}
		
		public void quitBrowser() {
			driver.quit();
		}
		
		public void closeBrowser() {
			driver.close();
		}
		
	}




