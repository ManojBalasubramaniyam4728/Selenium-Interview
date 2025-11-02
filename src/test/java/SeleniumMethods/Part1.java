package SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part1 {
public static void main(String[] args) {
	//1. How to launch Browsers in WebDriver?
	WebDriver driver=new ChromeDriver();
	
	//2. How to open Url?
	driver.get("https://zomato.com");
	
	//3. How to capture title of the page?
	String titleOfThePage=driver.getTitle();
	System.out.println("The page Title is "+titleOfThePage);
	
	//4. How to capture the url of the page?
	String webpageUrl=driver.getCurrentUrl();
	System.out.println("The web page Url is "+webpageUrl);
	
	//5. How to capture the page source of the page?
	String pagesources=driver.getPageSource();
	System.out.println("The Page Sources "+pagesources);
	
	//6. to close current active browser
	driver.close();
	
}
}
