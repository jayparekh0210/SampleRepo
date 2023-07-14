import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		String label = driver.findElement(By.xpath("//*[@id=\"page-top\"]/div/div/div/div/div/label/span")).getText();
		System.out.println(label);
//		driver.switchTo().frame("frame1");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/input")).sendKeys("Hello World!");
//		driver.switchTo().frame("frame3");
		driver.switchTo().frame(0); 
		driver.findElement(By.id("a")).click();
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("/html/body/input")).clear();
		driver.findElement(By.xpath("/html/body/input")).sendKeys("Hello India");
		driver.switchTo().defaultContent();
		System.out.println(label);
		driver.switchTo().frame("frame2");
		Select select = new Select(driver.findElement(By.xpath("//*[@id=\"animals\"]")));
		select.selectByValue("babycat");
		
		

	}

}
