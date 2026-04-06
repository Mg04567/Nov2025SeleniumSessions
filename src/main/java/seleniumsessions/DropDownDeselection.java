package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDeselection {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
		
		driver.get("https://html.com/attributes/select-multiple/");
		WebElement  deselectoptions=driver.findElement(By.xpath("//select"));
		
		Select select=new Select(deselectoptions);
		
		select.selectByValue("American");
		select.selectByIndex(1);
		select.selectByVisibleText("Chilean flamingo");
		
		select.deSelectByContainsVisibleText("Chilean flamingo");
		
		
		select.selectByValue("American");
		select.selectByIndex(1);
		select.selectByVisibleText("Chilean flamingo");
	}

}
