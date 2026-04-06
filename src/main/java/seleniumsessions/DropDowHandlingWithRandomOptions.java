package seleniumsessions;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowHandlingWithRandomOptions {

	static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales");
		
		WebElement dropdown=driver.findElement(By.id("Form_getForm_Country"));
		//To get the middle option in the list of options
		
		Select select=new Select(dropdown);     //to get the size of the element and index value we need to use select class
//		int midrange=select.getOptions().size()/2;
		
//		select.selectByIndex(midrange);
//		System.out.println(midrange);
		
		//To get random options in the list. Random class has to be used to generate random nunmbers in the list
		
		int min=100;
		int max=200;
		
		Random random=new Random();
		
//		int randomIndex=random.nextInt(select.getOptions().size());
//		select.selectByIndex(randomIndex);
//		System.out.println(randomIndex);
		
		//To get a range between two sizes
		
		int rangeNum=random.nextInt((max-min)+1)+ min;
		select.selectByIndex(rangeNum);
		System.out.println(rangeNum);
	}

}
