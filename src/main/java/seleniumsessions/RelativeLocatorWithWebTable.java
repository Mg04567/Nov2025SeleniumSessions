package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorWithWebTable {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/ui/webtable.html");
		
		WebElement mainEle=driver.findElement(By.xpath("//td[text()='Joe.Root']"));
		
		driver.findElement(with(By.xpath("//input[@type='checkbox']")).toLeftOf(mainEle)).click();
		String text=driver.findElement(with(By.cssSelector(".role-ess")).toRightOf(mainEle)).getText();
		System.out.println(text);
		
		
	}
}
