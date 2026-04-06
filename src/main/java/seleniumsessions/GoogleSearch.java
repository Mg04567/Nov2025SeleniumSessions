package seleniumsessions;

import java.util.Collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;



public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Selenium Automation");
		Thread.sleep(3000);

		List<WebElement> options=driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
		System.out.println("Total nunmber of options :"  +options.size());
		
		//To iterate thru the elements and print the text we need to use the for each loop
		int i = 0;
		for (WebElement e : options) {
			String text=e.getText();
			
			if (text.trim().length()!=0) {
				System.out.println(" suggestions:" + i +" " + text);
				i++;
				if (text.contains("with python")) {
					e.click();
					break;
				}
			}
		}
		
	}

}
