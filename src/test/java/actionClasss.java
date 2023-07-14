import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionClasss {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		TakesScreenshot screen = (TakesScreenshot) driver;
		File src = screen.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Administrator\\Downloads\\ScreenShot\\fullscreen.png"));
//		WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"search\"]/input"));
		WebElement comonent = driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[3]/a"));
		
		Actions actions = new Actions(driver);
		WebElement dropdownItem = driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[3]/div/div/ul/li[1]/a"));
//		actions.contextClick(searchBox).perform();
		actions.moveToElement(comonent).click(dropdownItem).build().perform();
		actions.scrollToElement(driver.findElement(By.xpath("//*[@id=\"carousel-banner-0\"]/div/div/div/div/a/img"))).perform();
		driver.get("https://stqatools.com/demo/DoubleClick.php");
		Thread.sleep(2000);
		WebElement doubleClicks = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/p[1]/button"));
		File imgSrc =doubleClicks.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(imgSrc, new File("C:\\Users\\Administrator\\Downloads\\ScreenShot\\element.png"));

		
		actions.doubleClick(doubleClicks);
	}
}
