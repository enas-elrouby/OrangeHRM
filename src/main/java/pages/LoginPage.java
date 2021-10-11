package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//input[@id='txtUsername']")
	WebElement usernameTxt;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	WebElement passwordTxt;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;
	
	public void userLogin(String uname, String password) {
		usernameTxt.sendKeys(uname);
		passwordTxt.sendKeys(password);
		loginBtn.click();
	}
}
