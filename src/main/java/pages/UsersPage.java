package pages;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Sleeper;

public class UsersPage extends PageBase{
	public String employeeName =PageBase.InsertedemployeeName;
	public String username =PageBase.Insertedusername;

	public UsersPage(WebDriver driver) {
		super(driver);
	}	
	@FindBy(xpath="//input[@id='btnAdd']")
	WebElement addUserBtn;
	
	@FindBy(css="input[id='systemUser_employeeName_empName']")
	public WebElement employeeNameTxt;
	
	@FindBy(css="input[id='systemUser_userName']")
	public WebElement usernameTxt;
	
	@FindBy(css="input[id='systemUser_password']")
	WebElement passwordTxt;
	
	@FindBy(css="input[id='systemUser_confirmPassword']")
	WebElement confirmPasswordTxt;
	
	@FindBy(css="input[id='btnSave']")
	WebElement saveBtn;
	
	@FindBy(xpath="//div[@class='message success fadable']")
	public WebElement creationMsgToast;

	
	public void navigateToAddNewUserPage() {
		addUserBtn.click();
	}
	
	public void addNewUser() throws InterruptedException {
		employeeNameTxt.sendKeys(PageBase.InsertedemployeeName);
		usernameTxt.sendKeys(PageBase.Insertedusername);
		passwordTxt.sendKeys("WelcomeOrange2");
		confirmPasswordTxt.sendKeys("WelcomeOrange2");
		saveBtn.click();
		Thread.sleep(4000);
	}
}
