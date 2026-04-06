package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateTovsGet {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//
//		driver.get("https://www.google.com/");
//		
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().back();
		
		
		//same AS
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login" );
		
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		
		driver.navigate().refresh();
	}

}
