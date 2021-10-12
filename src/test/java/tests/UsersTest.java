package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.UsersPage;

public class UsersTest extends TestBase{
	LoginPage loginPage;
	UsersPage usersPage;
	HomePage homePage;
	
	@Test(priority=2, enabled=true)
	public void addNewUserSuccessfully() throws InterruptedException {
		System.out.println("addNewUserSuccessfully");
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
//		loginPage.userLogin("Admin", "admin123");
		homePage.navigateToUsersView();
		usersPage = new UsersPage(driver);
		usersPage.navigateToAddNewUserPage();
		usersPage.addNewUser();
//		Assert.assertEquals("Successfully Saved",usersPage.creationMsgToast.getText());
	}

}
