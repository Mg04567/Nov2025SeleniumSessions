package seleniumsessions;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PseudoElementHandling {

	static WebDriver driver;
	public static void main(String[] args) {
		
		//Pseudo elemet ::before  ::after
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
String jsscript="return window.getComputedStyle(document.querySelector('label[for=\"input-firstname\"]'),'::before').getPropertyValue('content')";
String jsscriptcolor="return window.getComputedStyle(document.querySelector('label[for=\"input-firstname\"]'),'::before').getPropertyValue('color')";
		
JavascriptExecutor js=(JavascriptExecutor) driver;
		
		String text=js.executeScript(jsscript).toString();
		System.out.println(text);
		if (text.contains("*")) {
			System.out.println("First name is a mandatory field");
		}
			
		
		String color=js.executeScript(jsscriptcolor).toString();
		System.out.println(color);
		if (color.contains("rgb(255, 0, 0)")) {
			System.out.println("color red is present");
		}
		String telephonecolor="return window.getComputedStyle(document.querySelector('label[for=\"input-telephone\"]'),'::before').getPropertyValue('color')";
		//To get the background color of an element:
		
		String continueBtncolor=driver.findElement(By.xpath("//input[@type='submit']")).getCssValue("backgroundColor");
		System.out.println(continueBtncolor);
		
	}
	

}
