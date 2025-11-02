package ActionClass;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OtherActionClassThings {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions action = new Actions(driver);
		// key Action
		action.keyDown(Keys.ENTER).build().perform();
		action.keyUp(Keys.ENTER).build().perform();

		// drage and grop
		// first null is for source element from where
		// second element is for target element to where
		action.dragAndDrop(null, null).build().perform();

		// click and hold
		action.clickAndHold(null).build().perform();
		action.release(null).build().perform();

		// right click
		action.contextClick().build().perform();

		// double
		action.doubleClick().build().perform();

	}

}
