import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CheckBoxAndTRadioButton {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		WebElement checkButton = driver.findElement(By.xpath("//*[@id=\"isAgeSelected\"]"));
		
		if(!checkButton.isSelected()) {
			checkButton.click();
		}
		
		driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
		WebElement radioButton = driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label[1]/input"));
		if(!radioButton.isSelected()) {
			radioButton.click();
		}
	}

}
