package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class SVGElementoncept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map");
		Thread.sleep(2000);

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
		
		//We have to go to each and every region and print the name on the console
		
		//Normal CSS will work : svg#map-svg g.region path
		//Xpath of all the regions in SVG IS ://*[local-name()='svg' and @id='map-svg']//*[local-name()='g' and @class='region']//*[local-name()='path']
		//Xpath as will also work : //*[name()='svg' and @id='map-svg']//*[name()='g' and @class='region']//*[name()='path']
		
		List<WebElement> regionsList=driver
			.findElements(By.xpath("//*[local-name()='svg' and @id='map-svg']//*[local-name()='g' and @class='region']//*[local-name()='path']"));
		System.out.println(regionsList.size());
		Actions act=new Actions(driver);
		
		for (WebElement e : regionsList) {
			act.moveToElement(e).perform();  //If we have to click on each element we need to use Action class
			
			String name=e.getAttribute("name");
			System.out.println(name);             //To diretly print the region name on onsole we can use getAttribute
			
		}
	}

}
