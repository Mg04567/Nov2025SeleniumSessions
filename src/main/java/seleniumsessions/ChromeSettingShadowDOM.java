package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeSettingShadowDOM {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("chrome://settings/");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		String jspath="return document.querySelector(\"body > settings-ui\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"#searchInput\")";
		
				
		WebElement searchEle=(WebElement)js.executeScript(jspath);
		
		searchEle.sendKeys("notifiation");
	}

}

//SVG   =====> special XPATH (local-name(), name()) /normal CSS
//Pseudo elements ======> Jasriptexeutor
//SHADOW DOM========> JS PATH will give HTML Element convert to WebElement to perform action
//JSPath=====doument.querySelector used for CSS Selector
//SHADOW DOM  =======> XPath will not work  .....it always use CSS with JSPath....inside JSPath onlyquery Selector is used
