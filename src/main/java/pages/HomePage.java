package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//a[@id='menu_admin_viewAdminModule']")
	WebElement adminLink;
	
	
	@FindBy(xpath="//a[@id='menu_admin_UserManagement']")
	WebElement userManagementLink;
	
	@FindBy(xpath="//a[@id='menu_admin_viewSystemUsers']")
	WebElement usersLink;
	
	
	public void navigateToUsersView() {
		adminLink.click();
		userManagementLink.click();
		usersLink.click();
	}
}
