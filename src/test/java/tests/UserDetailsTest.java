package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UsersPage;

public class UserDetailsTest extends TestBase{
    UsersPage usersPage;
    @Test(priority=4, suiteName ="Regression suit")
    public void verifyUserData(){
        usersPage= new UsersPage(driver);
		System.out.println("EmployeeName = "+usersPage.employeeNameTxt.getAttribute("value"));
        System.out.println("Username = "+usersPage.usernameTxt.getAttribute("value"));
        System.out.println("Inserted Username = "+usersPage.username);
        System.out.println("Inserted EmployeeName = "+usersPage.employeeName);
        Assert.assertEquals(usersPage.username,usersPage.usernameTxt.getAttribute("value"));
        Assert.assertEquals(usersPage.employeeName,usersPage.employeeNameTxt.getAttribute("value"));

    }
}
