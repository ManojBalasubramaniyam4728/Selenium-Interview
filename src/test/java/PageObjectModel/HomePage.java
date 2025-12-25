package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	private WebElement HomePageText = driver.findElement(By.xpath("//label[text()='Books : ']"));
	
	public WebElement HomePageText() {
	return HomePageText;
	}

}
