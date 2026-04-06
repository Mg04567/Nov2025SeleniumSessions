package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomMultiLevelElement {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://books-pwakit.appspot.com/");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		
		
		WebElement searchEle=
	(WebElement) js.executeScript("return document.querySelector(\"body > book-app\").shadowRoot.querySelector(\"#input\")");
		
		searchEle.sendKeys("testing books");

	}

}
