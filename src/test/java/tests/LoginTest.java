package tests;


import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends TestBase {
	LoginPage loginPage;

	
	@Test(priority=1)
	public void userCanLoginSuccessfully() throws InterruptedException {
		System.out.println("userCanLoginSuccessfully");
		loginPage =new LoginPage(driver);
		loginPage.userLogin("Admin", "admin123");
		Thread.sleep(2000);
		//		new WebDriverWait(driver, 10).until(ExpectedConditions.or(ExpectedConditions.invisibilityOf(campaignPage.manageCampaignsTxt)));
//		Assert.assertTrue(campaignPage.manageCampaignsTxt.isDisplayed());
	}
}
