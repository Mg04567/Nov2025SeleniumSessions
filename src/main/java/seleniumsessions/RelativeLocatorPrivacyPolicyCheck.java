package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;

public class RelativeLocatorPrivacyPolicyCheck {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		WebElement privacyPolicy=driver.findElement(By.cssSelector(".agree"));
		WebElement continueBtn= driver.findElement(By.cssSelector(".btn-primary"));
		
		driver.findElement(with(By.xpath("//input[@type='checkbox']")).toRightOf(privacyPolicy).toLeftOf(continueBtn)).click();
		
		WebElement yesBtn=driver.findElement(By.cssSelector(".radio-inline"));
		
		driver.findElement(with(By.name("newsletter")).toRightOf(yesBtn)).click();
		
		WebElement firstname=driver.findElement(By.xpath("//label[@for='input-firstname']"));
		
		driver.findElement(with(By.id("input-firstname")).toRightOf(firstname)).sendKeys("Test");
		
		String text=driver.findElement(with(By.cssSelector("form div.pull-right")).near(privacyPolicy)).getText();
		System.out.println(text);
	}
	//*[@id="content"]/form/fieldset[3]/div/div/label[1]
}
