package Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationWait {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		
		//1. How do you implement an Implicit Wait in Selenium Java?
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//2. How do you use WebDriverWait with ExpectedConditions?
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@placeholder='Search store']"))));
		
		//3. What is FluentWait and how is it different from WebDriverWait?
		Wait<WebDriver> wait1=new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(10))
				.ignoring(NoSuchElementException.class);
		
		wait1.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@placeholder='Search store']"))));
		
		//4. How do you wait for an alert to be present?
		WebDriverWait wait2=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait2.until(ExpectedConditions.alertIsPresent());
		
	}

}
