package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllImages {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		List<WebElement> allimages=driver.findElements(By.tagName("img"));
		System.out.println("Number of images in the page:  "  +allimages.size() );
		
		//To get the text of the image:
		
		for (WebElement image : allimages) {
			String text=image.getText();
			System.out.println(text);
		}
		
		for (int i = 0; i < allimages.size(); i++) {
			String text=allimages.get(i).getText();
			System.out.println(text);
		}
	}

}
