package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	static WebDriver driver;
	public static void main(String[] args) {
	
		driver=new ChromeDriver();	
		driver.get("https://practice.expandtesting.com/upload");
		driver.findElement(By.id("fileInput")).sendKeys("C:\\Users\\Dell\\Desktop\\vriti.html");

	}

}
