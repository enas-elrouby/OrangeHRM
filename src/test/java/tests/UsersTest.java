package tests;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.UsersPage;

public class UsersTest extends TestBase{
	LoginPage loginPage;
	UsersPage usersPage;
	HomePage homePage;
	
	@Test(priority=3, enabled=true)
	public void addNewUserSuccessfully() {
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
		loginPage.userLogin("Admin", "admin123");
		homePage.navigateToUsersView();
		usersPage = new UsersPage(driver);
		usersPage.navigateToAddNewUserPage();
		
	}
}
