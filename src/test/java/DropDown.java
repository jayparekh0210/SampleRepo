import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		Select singleSelect = new Select(driver.findElement(By.xpath("//*[@id=\"select-demo\"]")));
		singleSelect.selectByValue("Monday");
		
		Select multiSelect = new Select(driver.findElement(By.xpath("//*[@id=\"multi-select\"]")));
		multiSelect.selectByValue("Ohio");
		multiSelect.selectByVisibleText("New York");
		multiSelect.selectByIndex(0);
		List <WebElement> listOfElement = multiSelect.getAllSelectedOptions();
		System.out.println(listOfElement.size());
//		System.out.println(multiSelect)
		multiSelect.deselectByIndex(0);
		

	}

}
