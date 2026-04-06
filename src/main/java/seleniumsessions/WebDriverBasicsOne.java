package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasicsOne {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		if (title.equals("OrangeHRM")) {
			System.out.println("Pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		String Url=driver.getCurrentUrl();
		System.out.println(Url);
		
		if (Url.contains("opensource-demo.orangehrmlive.com")) {
			System.out.println("The URL is correct");
		} else {

			System.out.println("The URL is not correct");
		}

		driver.close();
	}

}
