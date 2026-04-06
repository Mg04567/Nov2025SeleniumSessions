package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	static WebDriver driver;
	
	public static void main(String[] args) {
		driver=new ChromeDriver();     //Fr each driver initialisation one instance of the ChromeDriver will be created...one  objet 
										//will be created
		driver=new ChromeDriver();		//The latest position of the driver is pointing to third  ChromeDriver...remaining 2 will 
										//be eligible for GC.
										
		driver=new ChromeDriver();
		//driver.quit();  //this will close only the THIRD browser , as all browsers are in different windows.
	
		driver.close();  //this will close only the THIRD browser
	}

}
