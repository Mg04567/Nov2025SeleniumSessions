package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//input[@name='q'])[1]")).sendKeys("macbook pro");
		Thread.sleep(3000);
		
	    //List<WebElement> options=driver.findElements(By.xpath("//div[contains(@class,'VDtK0l')]"));
		List<WebElement> options=driver.findElements(By.xpath("//div[contains(@class,'VDtK0l')]/span"));
		
		Thread.sleep(3000);
		
		System.out.println("Total nunmber of options:" +options.size());
		
		
		for (WebElement e : options) {
			String text=e.getText();
			Thread.sleep(3000);
			System.out.println(text);			
			if (text.contains("macbook pro m3")) {
				e.click();
				break;
				
			}

	}
	}
}
	
//div[@class='s-suggestion s-suggestion-ellipsis-direction']
//driver.get("https://www.amazon.com/");
//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("macbook pro");