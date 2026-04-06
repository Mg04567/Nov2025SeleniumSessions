package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownWithoutUsingSelect {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales");
		
		List<WebElement> options=driver.findElements(By.xpath("//select[@id='Form_getForm_Country']/option"));
		//List<WebElement> options=driver.findElements(By.cssSelector("select#Form_getForm_Country>option"));
		
System.out.println(options.size());

//To iterate the options list we need to use the for loop

		for (WebElement e : options) {
			String text=e.getText();
			System.out.println(text);
			if (text.trim().equals("India")) {
				e.click();
				break;
			}
}
	}

}
