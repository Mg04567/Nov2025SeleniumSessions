package base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;



public class BaseTest {
protected WebDriver driver;   //Here childclass cannot acess the parent properties which are in a different package.
						//Here WebDriver driver is default access modifier...not public .default access modifiers should 
						//be inn same package.We can either use public or protected.Here if we give public anyone an access
						//So we an make protected.
//private String browser="chrome";

	@Parameters({"browser","url"})
	@BeforeTest
	public void setup(String browsername ,String appurl) {      //We have to pass the browser as an annotation from runner file to Base Class
												//and then pass the browser as a variable in the setup method
		switch(browsername.trim().toLowerCase()) {
		case "chrome":
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
			System.out.println("please pass the correct browser" +browsername);
			break;
		}
		driver.get(appurl);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();     //Session id beomes null
	}
}
