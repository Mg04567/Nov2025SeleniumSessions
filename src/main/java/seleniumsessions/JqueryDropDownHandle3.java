package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDropDownHandle3 {

	//For multiple choices
	static WebDriver driver;
	public static void main(String[] args) {
		driver =new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.id("justAnInputBox")).click();
		
		By choicespath=By.xpath("(//div[@class='comboTreeDropDownContainer'])[1]//li//span[@class='comboTreeItemTitle']");
		
		selectChoices(choicespath,"choice 2");
//		List<WebElement> choicesnew=driver.findElements(choicespath);
		
//		System.out.println("No of choices: " +choicesnew.size());
		
//		for (WebElement e : choicesnew) {
//			String text=e.getText();
//			System.out.println(text);
//			if (text.trim().toLowerCase().equals("choice 2")) {
//				e.click();
//				break;
				
//			}
//		}
}
	public static void selectChoices(By locator, String... choices ) {    //Multiple choices
		List<WebElement> choicesnew=driver.findElements(locator);
		System.out.println("No of choices: " +choicesnew.size());
		for (WebElement e : choicesnew) {
			String text=e.getText();
		System.out.println(text);
		
		
			for (String value : choices) {
				if (text.trim().toLowerCase().equals(value)) {
					e.click();
					break;
			}
	}
}
}
}