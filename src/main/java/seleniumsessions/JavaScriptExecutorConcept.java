package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();	
		//driver.get("https://classic.crmpro.com/login.cfm");
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	    JavascriptExecutor js=(JavascriptExecutor)driver;
//	    
//    String title =js.executeScript("return document.title").toString(); //Execute script returns an Object whih is a Javascript value...
//	    System.out.println(title);								//we can store in a Java String title , hence we have to convert to 
//	    																//toString()  method
//	    String url=js.executeScript("return document.URL").toString();
//	    System.out.println(url);
//	    
//	    js.executeScript("alert('This is my login page');");
	    
//     js.executeScript("history.go(0);");
//	   String text= js.executeScript("return document.documentElement.innerText").toString();
//	   System.out.println(text);
	    
	    
		JavaScriptUtil jsUtil=new JavaScriptUtil(driver);
//		String title=jsUtil.getTitleByJS();
//		System.out.println(title);
//		
//		String URL=jsUtil.getURLByJS();
//		System.out.println(URL);
//		
//		jsUtil.getAlertByJS("Hello Testing");
//		
//		jsUtil.refreshBrowserByJS();
//		
//		String pagetxt=jsUtil.getPageInnerText();
//		System.out.println(pagetxt);
//		if (pagetxt.contains("Privacy passed")) {
//			System.out.println("Passed");
//		}
		
//		WebElement loginbtn=driver.findElement(By.xpath("//input[@type='submit']"));
//		jsUtil.flash(loginbtn);
//		
//		WebElement username=driver.findElement(By.name("username"));
//		jsUtil.flash(loginbtn);
//		username.sendKeys("Automation");
//		
//		jsUtil.drawBorder("red", username);
//		
//		jsUtil.scrollPageDown();
		
		WebElement registerLink=driver.findElement(By.linkText("Register"));
		jsUtil.clickElementByJs(registerLink);
		
		}
	
}

