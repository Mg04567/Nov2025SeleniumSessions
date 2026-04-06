package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDropDownHandle1 {
	
	//************** Drop Down Handle for multiple selection

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver =new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		//First we need to click on the input box
		driver.findElement(By.id("justAnInputBox")).click();
		Thread.sleep(4000);
		
		By choicespath=By.xpath("(//div[@class='comboTreeDropDownContainer'])[1]//li//span[@class='comboTreeItemTitle']");

//		List<WebElement> choicesListdriver=driver.findElements(By.xpath("(//div[@class='comboTreeDropDownContainer'])[1]//li//span[@class='comboTreeItemTitle']"));
//	System.out.println("Number of options: "  +choicesListdriver.size());
//	
//	
//	
//	for (WebElement e : choicesListdriver) {
//		String text=e.getText();
//		System.out.println(text);
//		
//		if (text.trim().equals("choice 2 3")) {     //Here it'll print only till choice 3 and will break the loop
//			e.click();
//			break;
//		}
//	}
	
		selectChoice(choicespath, "choice 2");
		//selectChoice(choicespath, "choice 2", "choice 3", "choice 7", "choice 6 2 1");
	}
	
	//Create Utility for ChoicesList
	/**
	 * This method is able to handle three use cases
	 * 1.Single selection (choice 2)
	 * Multiple seletion ( "choice 2", "choice 3", "choice 7", "choice 6 2 1")
	 * All choices (please pass all as a value eg: all
	 * @param locator
	 * @param choiceValue
	 */
	
	
	
	
	
	public static void selectChoice(By locator ,String... choiceValue) {

		List<WebElement> choicesList=driver.findElements(locator);
	System.out.println("Number of options: "  +choicesList.size());
	
	if(choiceValue[0].trim().toLowerCase().contains("all")) {   //If the 0th index of choiceValue list is "all"thrn click all elemnts
		
																//else go to the next for loop for single choice 
	for (WebElement e : choicesList) {
		e.click();
	}
	}
	
	else {
	for (WebElement e : choicesList) {                  //Use for eah loop to check thru the choices list and ompare the needed value
		String text=e.getText();
		System.out.println(text);
		
//		if (text.trim().equals(choiceValue)) {     //Here it'll print only till choice 3 and will break the loop
//			e.click();
//			break;
		
			
			//Suppose we need to compare the choice List with 3 or more values and then break the loop then we have to use another
			//for loop to put the list of expexted choices in the second loop and compare  them with the choicesList in first Loop
			
			for (String value : choiceValue) {
				if (text.trim().equals(value)) {     
					e.click();
					break;
			}
				
		}
	}
	}
	}
}

