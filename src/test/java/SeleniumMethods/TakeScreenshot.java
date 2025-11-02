package SeleniumMethods;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/tabs");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		TakesScreenshot file = (TakesScreenshot) driver;
		File fileOutPutFile=file.getScreenshotAs(OutputType.FILE);
		File filePath=new File("C:/Users/Manoj/eclipse-workspace/SeleniumInterview/src/test/java/SeleniumMethods/"+System.currentTimeMillis()+".png");
		FileUtils.copyFile(fileOutPutFile, filePath);
		driver.close();
		
	}

}
