package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();		
		driver.get("https://www.londonfreelance.org/courses/frames/index.html");
		//driver.switchTo().frame(2);   //frame(index) is not a  stable element hence we annot use this
		
		//driver.switchTo().frame("main");  //frame name/id  can be used
		
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='top.html']")));
		String header=driver.findElement(By.tagName("h2")).getText();
		System.out.println(header);
		
		
		
	}

}
