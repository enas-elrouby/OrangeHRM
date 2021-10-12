package tests;

import org.testng.annotations.Test;
import pages.UsersPage;

public class UserDetailsTest extends TestBase{
    UsersPage usersPage;
    @Test
    public void verifyUserData(){
        usersPage= new UsersPage(driver);
		System.out.println("EmployeeName = "+usersPage.employeeNameTxt.getAttribute("value"));
        System.out.println("Username = "+usersPage.usernameTxt.getAttribute("value"));

    }
}
