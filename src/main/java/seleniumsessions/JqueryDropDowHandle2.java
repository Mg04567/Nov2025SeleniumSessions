package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//**************DropDown handle for one choice
public class JqueryDropDowHandle2 {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver =new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.id("justAnInputBox")).click();
		Thread.sleep(4000);
		
		By choicespath=By.xpath("(//div[@class='comboTreeDropDownContainer'])[1]//li//span[@class='comboTreeItemTitle']");
		selectChoice(choicespath, "choice 2");
		
	}
		public static void selectChoice(By locator, String choiceValue) {
			
			List<WebElement> newchoice=driver.findElements(locator);
			
			System.out.println(newchoice.size());
			
			for (WebElement e : newchoice) {	//For loop iterates thru the find elemnts list and displays all the choices
				String text=e.getText();		//To validate a choice we can use if condition 
				System.out.println(text);
				if (text.trim().equals(choiceValue)) {
					e.click();
					break;
				}
				
			}
			
		}
		
	}


