package SeleniumMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Part3 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://zomato.com");

		// 1. How navigate to url
		driver.navigate().to("https://demo.nopcommerce.com/register");

		// 2. How to navigate back
		driver.navigate().back();

		// 3. How to navigate forward
		driver.navigate().forward();

		// 4. How to refresh
		driver.navigate().refresh();

		// diffrence b/w navigate().to() and get()
		/*
		 * => get() navigate to url and wait to page load' => navigate().to() navigate
		 * to url and does not wait
		 **/

		driver.close();

	}

}
