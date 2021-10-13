package tests;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.UsersPage;

public class UsersTest extends TestBase{
	UsersPage usersPage;
	HomePage homePage;
	
	@Test(priority=2, suiteName ="Regression suit")
	public void addNewUserSuccessfully() throws InterruptedException {
		System.out.println("addNewUserSuccessfully");
		homePage = new HomePage(driver);
		homePage.navigateToUsersView();
		usersPage = new UsersPage(driver);
		usersPage.navigateToAddNewUserPage();
		usersPage.addNewUser();
//		Assert.assertEquals("Successfully Saved",usersPage.creationMsgToast.getText());
	}

}
