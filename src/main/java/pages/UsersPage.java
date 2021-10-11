package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class UsersPage extends PageBase{

	public UsersPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//input[@id='btnAdd']")
	WebElement addUserBtn;
	
	
	public void navigateToAddNewUserPage() {
		addUserBtn.click();
	}
}
