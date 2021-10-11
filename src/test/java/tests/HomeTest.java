package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.UsersPage;

public class HomeTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	
	@Test
	public void adminCanCreateNewTeamSuccessfully() {
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
		loginPage.userLogin("Admin", "admin123");
		homePage.navigateToUsersView();
	}
}
