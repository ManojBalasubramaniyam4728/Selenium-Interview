package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		
		WebElement serchStoreTextFiled= driver.findElement(By.xpath("//input[@placeholder='Search store']"));
		
		//1. How to check element is displayed or not in web page
		boolean isDisplayedOrNot=serchStoreTextFiled.isDisplayed();
		System.out.println("Serch Store Text Filed is "+ isDisplayedOrNot);
		
		//2. How to check element is enabled or not in web page
		boolean isEnabledOrNot=serchStoreTextFiled.isEnabled();
		System.out.println("Serch Store Text Filed is "+ isEnabledOrNot);
		
		//3. How to check element is selected or not in web page
		WebElement maleradioButton=driver.findElement(By.id("gender-male"));
		System.out.println(maleradioButton.isSelected()); //false
		maleradioButton.click();
		System.out.println(maleradioButton.isSelected()); //true
		
		driver.close();
		
	}

}
