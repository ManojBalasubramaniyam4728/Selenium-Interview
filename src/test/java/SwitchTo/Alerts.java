package SwitchTo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(6));
		
		//This is to click on ok on alert popup
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[text()='Click Button to see alert ']/..//following-sibling::div/button[text()='Click me']"))));
		driver.findElement(By.xpath("//span[text()='Click Button to see alert ']/..//following-sibling::div/button[text()='Click me']")).click();
		driver.switchTo().alert().accept();
		
		//This is to wait for alert to preset and click on ok
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[text()='On button click, alert will appear after 5 seconds ']/..//following-sibling::div/button[text()='Click me']"))));
		driver.findElement(By.xpath("//span[text()='On button click, alert will appear after 5 seconds ']/..//following-sibling::div/button[text()='Click me']")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		
		//This is to click on cancel button on alert
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[text()='On button click, confirm box will appear']/..//following-sibling::div/button[text()='Click me']"))));
		driver.findElement(By.xpath("//span[text()='On button click, confirm box will appear']/..//following-sibling::div/button[text()='Click me']")).click();
		driver.switchTo().alert().dismiss();
		
		//This is to enter text in alert
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[text()='On button click, prompt box will appear']/..//following-sibling::div/button[text()='Click me']"))));
		driver.findElement(By.xpath("//span[text()='On button click, prompt box will appear']/..//following-sibling::div/button[text()='Click me']")).click();
		driver.switchTo().alert().sendKeys("Hello Alert");
		
		driver.close();
		
		
	}

}
