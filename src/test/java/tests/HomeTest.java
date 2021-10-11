package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.UsersPage;
public class HomeTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	UsersPage userPage;
	
	@Test(priority=3)
	public void SearchForExistingUser() {
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
//		loginPage.userLogin("Admin", "admin123");
		System.out.println("SearchForExistingUser");
//		homePage.navigateToUsersView();
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='searchSystemUser_userName']")));
		homePage.searchForUser();
		Assert.assertTrue(homePage.userSearchResultRow.isDisplayed());
		homePage.openUserDetailsPage();
	}
	
}
