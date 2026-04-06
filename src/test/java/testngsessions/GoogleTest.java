package testngsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseTest;

public class GoogleTest extends BaseTest {

//	WebDriver driver;
//	
//	@BeforeTest
//	public void setup() {
//		driver=new ChromeDriver();
//		driver.get("https://www.google.com/");
//		driver.manage().deleteAllCookies();
//		driver.manage().window().maximize();
		
//	}
	
	@Test(priority=1)
	public void titleTest() {
		//driver.get("https://www.google.com/");
		String title=driver.getTitle();
		Assert.assertEquals(title, "Google");
	}
	
	@Test(priority=2)
	public void urlTest() {
		String url=driver.getCurrentUrl();
		Assert.assertTrue(url.contains("google.com/"));
	}
		
//		@AfterTest
//		public void tearDown() {
//			driver.quit();     //Session id beomes null
//		}
	}

