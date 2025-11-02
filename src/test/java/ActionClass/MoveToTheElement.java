package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToTheElement {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions action=new Actions(driver);
		//scroll
		action.moveToElement(driver.findElement(By.xpath("//legend[text()='iFrame Example']"))).build().perform();
		action.moveToElement(driver.findElement(By.className("mouse-hover"))).build().perform();
		
	}
}
