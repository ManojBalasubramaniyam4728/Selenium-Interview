package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "userName")
	private WebElement userNameTextField;
	
	@FindBy(id= "password")
	private WebElement passwordTextField;
	
	@FindBy(id= "login")
	private WebElement loginButton;
	
	public WebElement userNameTextField() {
		return userNameTextField;
	}
	
	public WebElement passwordTextField() {
		return passwordTextField;
	}
	
	public WebElement loginButton() {
		return loginButton;
	}

}
