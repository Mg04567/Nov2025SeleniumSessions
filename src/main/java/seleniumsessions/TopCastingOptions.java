package seleniumsessions;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCastingOptions {

	public static void main(String[] args) {
		// 1. ChromeDriver driver=new ChromeDriver(); Valid but not recommended
		//	  FirefoxDriver driver=new FirefoxDriver();
		
		// 2.  WebDriver driver=new ChromeDriver();    Valid and recommended. for local machines
		// driver=new FirefoxDriver();
		// driver=new EdgeDriver();

		// 3.  We can use Chromium Driver but it is the parent of Chrome and Edge Browser
		// Hence we an topcast with only these two Browsers.

		// ChromiumDriver driver1=new ChromeDriver();    Valid not recommended.
		// driver1=new EdgeDriver();

		// Valid and reommended for remote machine , vendor machine lambda and clolud.
		// 4.   WebDriver driver=new RemoteWebDriver(remoteAddress, capabilities); //When we run test cases on remote Mchine or third
																				//  party machine we use RemoteWebDriver,
																				//  remoteAddress--ip address,capabilities is on which browser nd OP
		
		//5 . SearchContext driver=new ChromeDriver();   Valid not recomended.
		
		//6.SearchContext driver=new RemoteWebDriver(remoteAddress, capabilities);  //Reference typechek will be passed only for findelement() and findelements()
																				//Valid but not remomnded.
		
		//RemoteWebDriver driver=new ChromeDriver(); //All methods of interface an child can be accessed.The browser will open in local Machine
												//This reference works but we generally use topcating with Parent Interfaces.
												//Valid reommended for local execution.
	}

}
