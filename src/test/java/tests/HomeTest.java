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
	HomePage homePage;
	@Test(priority=3,suiteName ="Regression suit")
	public void SearchForExistingUser() {
		homePage = new HomePage(driver);
		System.out.println("SearchForExistingUser");;
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='searchSystemUser_userName']")));
		homePage.searchForUser();
		Assert.assertTrue(homePage.userSearchResultRow.isDisplayed());
		homePage.openUserDetailsPage();
	}
	
}
