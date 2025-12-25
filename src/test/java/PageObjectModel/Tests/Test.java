package PageObjectModel.Tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjectModel.HomePage;
import PageObjectModel.LoginPage;

public class Test {
	
	@org.testng.annotations.Test
	public void Test1() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		LoginPage lp= new LoginPage(driver);
		lp.userNameTextField().click();
		lp.userNameTextField().sendKeys("Manoj@gmail.com");
		lp.passwordTextField().click();
		lp.passwordTextField().sendKeys("Manj@123");
		lp.loginButton().click();
		HomePage hp=new HomePage(driver);
		hp.HomePageText().isDisplayed();
	}
	

}
