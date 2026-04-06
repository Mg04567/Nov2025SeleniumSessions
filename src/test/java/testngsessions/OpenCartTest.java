package testngsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseTest;

public class OpenCartTest extends BaseTest{

//	WebDriver driver;
//	
//	@BeforeTest      //Before test metod runs only once before all Test metods...if it is before method it'll run before
//					// evry test case.Here BeforeTest method is preferred
//	public void setup() {
//		driver=new ChromeDriver();
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		driver.manage().deleteAllCookies();    //Opens a fresh browser and fresh Page
//		driver.manage().window().maximize();
//		
//	}
	
	@Test(priority=1)
	public void titleTest() {
		//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	  String title=driver.getTitle();
	  Assert.assertEquals(title, "Account Login");
	}
	
	@Test(priority=2)
	public void urlTest() {
		
		String url=driver.getCurrentUrl();
	  Assert.assertTrue(url.contains("route=account/login"));
	}
	
	@Test(priority=3)
	public void islogoExistTest() {
		
		Assert.assertTrue(driver.findElement(By.cssSelector(".img-responsive")).isDisplayed());
		
	}
	
	
	
	//tearDown method name is used once everything is done what nest or final step
//	@AfterTest
//	public void tearDown() {
//		driver.quit();     //Session id beomes null
//	}
//	
}
