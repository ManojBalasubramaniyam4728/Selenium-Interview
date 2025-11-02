package SwitchTo;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class windows {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// This to new tab handels
		String parentWindow=driver.getWindowHandle();

		driver.findElement(By.id("tabButton")).click();

		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			if (driver.getCurrentUrl().equalsIgnoreCase("https://demoqa.com/sample")) {
				System.out.println("Switch scussfully");
				break;
			}
			driver.switchTo().window(string);

		}

		String textMessgeFromNewTab = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(textMessgeFromNewTab);

		// Switching back to parent window
		driver.switchTo().window(parentWindow);

		// This to window tab handels
		driver.findElement(By.id("windowButton")).click();

		Set<String> windowHandles1 = driver.getWindowHandles();
		for (String string : windowHandles1) {
			if (driver.getCurrentUrl().equalsIgnoreCase("https://demoqa.com/sample")) {
				System.out.println("Switch scussfully");
				break;
			}
			driver.switchTo().window(string);

		}

		String textMessgeFromNewTab1 = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(textMessgeFromNewTab1);

		// Switching back to parent window
		driver.switchTo().window(parentWindow);
		
		//This is to open new tab
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://github.com/login");
		driver.quit();
	}

}
