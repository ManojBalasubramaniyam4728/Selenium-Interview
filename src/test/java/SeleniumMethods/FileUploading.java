package SeleniumMethods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploading {
	public static void main(String[] args) throws AWTException, IOException {
		// FileUploading
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/upload-download");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// One way
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Manoj\\Downloads\\sampleFile.jpeg");

		driver.navigate().refresh();

		// another way
		driver.findElement(By.xpath("//label[@for='uploadFile']")).click();
		StringSelection sc = new StringSelection("C:\\Users\\Manoj\\Downloads\\sampleFile.jpeg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sc, null);
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_C);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_C);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		driver.close();
	}
		
}
