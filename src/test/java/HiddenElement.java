import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElement {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationbookstore.dev/");
		WebElement closeIcon = driver.findElement(By.xpath("//*[@id=\"demo-page\"]/div[2]/form/div/a"));
		
		System.out.println(closeIcon.isDisplayed());
	}


}
