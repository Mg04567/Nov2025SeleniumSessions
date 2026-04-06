package testngsessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {

	//1	
	@BeforeSuite
	public void startAppServer() {
	System.out.println("BS -- start the app server");
	}
	//2
	@BeforeTest
	public void createUser() {
	System.out.println("BT -- create a test user");
		}
	//3
	@BeforeClass
	public void launchBrowser() {
	System.out.println("BC -- launch browser"); 
	}
	
	//4//7//10
	@BeforeMethod
	public void loginToApp() {
	System.out.println("BM -- login to app"); 
	}
	//11
	@Test
	public void searchTest() {
	System.out.println("search Test"); 
	}
	//5
	@Test
	public void addToCart() {
	System.out.println("Add to cart"); 
	}
	//8
	@Test
	public void orderTest() {
	System.out.println("order Test"); 
	}
	//6//9//12
	@AfterMethod
	public void logout() {
	System.out.println("AM----logout"); 
	}
	//13
	@AfterClass
	public void closeBrowser() {
	System.out.println("AC-----close browser"); 
	}
	//14
	@AfterTest
	public void deleteUser() {
	System.out.println("AT----Delete the User");
	}
	//15
	@AfterSuite
	public void stopAppServer() {
	System.out.println("AS-----stop the app server");
	}
}
