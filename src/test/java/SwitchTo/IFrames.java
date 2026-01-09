package SwitchTo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrames {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// switch iframe by element and get text and switch to default frame
		driver.switchTo().frame(driver.findElement(By.id("frame1")));

		String sry = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(sry);

		driver.switchTo().parentFrame();
		// or
		// driver.switchTo().defaultContent();

		// switch iframe by index and get text and switch to default frame
		driver.switchTo().frame(2);

		String sry1 = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(sry1);

		driver.switchTo().parentFrame();
		// or
		// driver.switchTo().defaultContent();
		
		driver.close();
		
		/* The main diffrance of parentFrame() and defaultContent()
		 * defaultContent(): Example default--> frame1, frame2, Frame3, if use this defaultContent() the now matter how ever you isde it come to firt level 
		 * parentFrame(): Example default--> frame1, frame2, Frame3, if use this parentFrame() then it will go to frame3 not default one this is the diffrance.
		 */
		

	}

}
