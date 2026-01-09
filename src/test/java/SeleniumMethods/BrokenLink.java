package SeleniumMethods;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/broken");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> webElementList= driver.findElements(By.tagName("a"));
		for (WebElement webElement : webElementList) {
			String url=webElement.getAttribute("href");
			verifuURLLink(url);
		}
		
		
	}
	public static void verifuURLLink(String url) {
		try {
		URL link=new URL(url);
		HttpURLConnection httpURLConnection=(HttpURLConnection) link.getContent();
		httpURLConnection.setConnectTimeout(3000);
		httpURLConnection.connect();
		
		if (httpURLConnection.getResponseCode()==200) {
			System.out.println(httpURLConnection.getResponseMessage()+ "The linke is not broken");
		}
		else {
			System.out.println(httpURLConnection.getResponseMessage()+ "The linke is broken");
		}
		}
		catch (Exception e) {
			System.out.println(e+ "The linke is broken");
		}
		
	}

}
