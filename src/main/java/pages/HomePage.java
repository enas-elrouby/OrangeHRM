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
	
	@FindBy(xpath="//input[@id='searchSystemUser_userName']")
	WebElement usernameSearchTxt;
	
	@FindBy(css="input[id='searchBtn']")
	WebElement searchBtn; 
	

	@FindBy(xpath="//tr[@class='odd']")
	public WebElement userSearchResultRow; 
	
	@FindBy(xpath="//input[@type='checkbox' and @name='chkSelectRow[]']/parent::td/following-sibling::td[1]/a")
	WebElement userDetails;
	
	public void navigateToUsersView() {
		adminLink.click();
		userManagementLink.click();
		usersLink.click();
	}
	public void searchForUser() {
		usernameSearchTxt.sendKeys(PageBase.Insertedusername);
		searchBtn.click();
	}
	public void openUserDetailsPage() {
		userDetails.click();
	}
	
	
}
