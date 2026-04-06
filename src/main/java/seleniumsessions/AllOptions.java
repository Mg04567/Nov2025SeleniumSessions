package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllOptions {

	//Total number of options inside the country drop down
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales");
		List<WebElement> allOptions=driver.findElements(By.xpath("//select[@name='Country' ]/option"));
			System.out.println(" Total options: " + allOptions.size());
			
			for (WebElement options : allOptions) {
				String text=options.getText();
				System.out.println(text);
			}
			
			System.out.println(" ===============");
			
			for (int i = 0; i < allOptions.size(); i++) {
				String text=allOptions.get(i).getText();
				System.out.println(text);
			}
	}

	
}
