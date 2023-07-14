import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowAndTabHandelers {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://stqatools.com/demo/Windows.php");
		driver.manage().window().maximize();
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent Window: "+parentWindow);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/a[1]/button")).click();
		Set <String> tabs = driver.getWindowHandles();
		System.out.println(tabs.size());
		for(String child : tabs) {
			System.out.println(child);
			if(!parentWindow.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[2]/a")).click();
			}
		}
		driver.close();
		Thread.sleep(1000);
		driver.switchTo().window(parentWindow);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/a[1]/button")).click();
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://nodejs.org/en");
		Thread.sleep(1000);
		driver.switchTo().window(parentWindow);
//		driver.quit();
		
		

	}

}
