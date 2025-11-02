package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsIntrivew {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");

		// 1. Xpath
		WebElement serchStoreTextFiled = driver.findElement(By.xpath("//input[@placeholder='Search store']"));

		// 2. css
		WebElement serchStoreTextFiled1 = driver.findElement(By.cssSelector("input[palceholder='Search store']"));

		// 3. tagename and 4. name
		WebElement serchStoreTextFiled2 = driver.findElement(By.tagName("input")).findElement(By.name("q"));

		// 5. linkText
		WebElement serchStoreTextFiled3 = driver.findElement(By.linkText("Register"));

		// 6. partialLinkText
		WebElement serchStoreTextFiled4 = driver.findElement(By.partialLinkText("Regis"));

		// 7. className
		WebElement serchStoreTextFiled5 = driver.findElement(By.className("title"));

		// 8. Id
		WebElement serchStoreTextFiled6 = driver.findElement(By.id("small-searchterms"));

		// findelement
		WebElement serchStoreTextFiled7 = driver.findElement(By.xpath("//input[@placeholder='Search store']"));
		//returens one WebElement
		//Througes no shuch elemet expecetion

		// findelements
		List<WebElement> webElements = driver.findElements(By.xpath("//input[@placeholder='Search store']"));
		//returne List of WEbelemet
		//does not trows no such element expections

		driver.close();

	}

}
