package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMElement {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testing.qaautomationlabs.com/shadow-dom.php");
		
		//Browser=====> Page======> Shadow Host========> any element
		
		//JSPath : will provide one Javascript...run this using JavascriptExecutor
				
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		
		//Here the Javasript returns a HTML Element....but selenium undertands only webelemnt ...hence we have to cast
		//into the WebElement or convert into WebElement
		WebElement divElement=
		(WebElement) js.executeScript("return document.querySelector(\"#shadow-host\").shadowRoot.querySelector(\"div.box\")");
		
		String text=divElement.getText();
		System.out.println(text);

	}

}
