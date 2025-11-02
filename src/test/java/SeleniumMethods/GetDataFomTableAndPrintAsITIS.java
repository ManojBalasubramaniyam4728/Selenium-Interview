package SeleniumMethods;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetDataFomTableAndPrintAsITIS {

	@Test
	public void test() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/table?scenario=1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> tableName = driver.findElements(By.xpath("//thead/tr/th"));
		List<String> tableNames = new ArrayList<String>();
		int tableNameValue = tableName.size();
		for (WebElement webElement : tableName) {
			tableNames.add(webElement.getText());
		}
		List<WebElement> tableValue = driver.findElements(By.xpath("//tbody/tr/th"));

		int bodyValueCount = tableValue.size();

		List<String> tableValueNames = new ArrayList<String>();

		for (WebElement webElement : tableValue) {
			tableValueNames.add(webElement.getText());
		}

		for (int i = 1; i < tableNameValue; i++) {
			System.out.print(tableNames.get(i) + "          ");
		}
		System.out.println();

		for (int i = 1; i < bodyValueCount; i++) {
			System.out.print(tableValueNames.get(i) + "     ");
			for (int j = 1; j < bodyValueCount; j++) {
				System.out.print(driver.findElement(By.xpath(tablevalueWIthIndex(tableValueNames.get(j)))).getText()+"     ");
			}
			System.out.println();

		}
		
		driver.close();

	}

	public String tablevalueWIthIndex(String tableValueNames) {
		return "//tbody/tr/th[text()='" + tableValueNames + "']/following-sibling::td";
	}
	


}
