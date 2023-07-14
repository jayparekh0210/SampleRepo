import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
public class AlertTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");
		driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
//		alert.accept();
		alert.dismiss();
		
		
		
		driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/button")).click();
		System.out.println(alert.getText());
		alert.accept();
		
		driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[3]/div[2]/button")).click();
		System.out.println(alert.getText());
		alert.sendKeys("TEST");
		alert.accept();
		
		

	}

}
