package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsSignature {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://signature-generator.com/draw-signature/");
		WebElement canvas=driver.findElement(By.id("signature-pad"));
		
		Actions act=new Actions(driver);
		
		Action signature=act.click(canvas).moveToElement(canvas, 30, 100)
		.clickAndHold(canvas).moveToElement(canvas, -200, -50)
		.moveByOffset(50, -50).release(canvas).build();
		
		signature.perform();
		
		
	}

}

//Differnce between Action and Actions
//Actions is the class where we perform various actions with the ation class object
//Ation is an interface where when we use only build metod it returns the Action....advantage is it builds all the actions together
// and we cn use it as per our convenience