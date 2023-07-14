import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ToolTipTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/tooltip/");
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"age\"]")));
//		System.out.println(driver.findElement(By.xpath("//*[@id=\"ui-id-7\"]")).getText());
		String tooltipText = driver.findElement(By.xpath("//*[@id=\"ui-id-11\"]/div")).getText();
		System.out.println(tooltipText);
		
		

	}

}
