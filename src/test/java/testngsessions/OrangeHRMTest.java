package testngsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseTest;

public class OrangeHRMTest extends BaseTest {
//WebDriver driver;
	
//	@BeforeTest      //Before test metod runs only once before all Test metods...if it is before method it'll run before
					// evry test case.Here BeforeTest method is preferred
//	public void setup() {
//		driver=new ChromeDriver();
//		driver.get("https://orangehrm.com/en/contact-sales");
//		driver.manage().deleteAllCookies();    //Opens a fresh browser and fresh Page
//		driver.manage().window().maximize();
//		
//	}
	
	@Test(priority=1)
	public void titleTest() {
		//driver.get("https://orangehrm.com/en/contact-sales");
	  String title=driver.getTitle();
	  Assert.assertEquals(title, "Contact Sales | Get in Touch | HR Software | HRMS | OrangeHRM");
	}
	
	@Test(priority=2)
	public void urlTest() {
		String url=driver.getCurrentUrl();
	  Assert.assertTrue(url.contains("contact-sales"));
	}
	
//	@AfterTest
//	public void tearDown() {
//		driver.quit();     //Session id beomes null
//	}
}
