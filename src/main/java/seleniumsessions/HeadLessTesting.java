package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadLessTesting {

	public static void main(String[] args) {
		
		//headless : no browser/no UI
		ChromeOptions co=new ChromeOptions();
		//co.addArguments("--headless");
		//co.addArguments("--incognito"); 
		
		List<String> optList=new ArrayList<String>();
		optList.add("--incognito");
		optList.add("--headless");
		co.addArguments(optList);
		
		
		FirefoxOptions fo=new FirefoxOptions();
		//fo.addArguments("--headless");
		//fo.addArguments("--incognito");
		
		EdgeOptions eo=new EdgeOptions();
		//eo.addArguments("--headless");
		//eo.addArguments("--InPrivate"); 
		
		
		
		WebDriver driver=new ChromeDriver(co);   //Supply ChromeOptions objet to constructor of ChromeDriver
		//WebDriver driver=new FirefoxDriver(fo) ;
		//WebDriver driver=new EdgeDriver(eo);
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.quit();

	}

}
