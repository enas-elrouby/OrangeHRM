package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends TestBase {
	LoginPage loginPage;

	
	@Test(priority=2)
	public void userCanLoginSuccessfully() throws InterruptedException {
		loginPage =new LoginPage(driver);
		loginPage.userLogin("Admin", "admin123");
		Thread.sleep(2000);
		System.out.println("userCanLoginSuccessfully");
		//		new WebDriverWait(driver, 10).until(ExpectedConditions.or(ExpectedConditions.invisibilityOf(campaignPage.manageCampaignsTxt)));
//		Assert.assertTrue(campaignPage.manageCampaignsTxt.isDisplayed());
	}
}
