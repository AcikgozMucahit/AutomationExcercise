package automationexcercise.tests;

import automationexcercise.pages.DeleteAccountPage;

import automationexcercise.pages.HomePage;
import automationexcercise.pages.LoginPage;
import automationexcercise.utilities.ConfigReader;
import automationexcercise.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC02_PositiveLoginTest {
    /*
    1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click on 'Signup / Login' button
5. Verify 'Login to your account' is visible
6. Enter correct email address and password
7. Click 'login' button
8. Verify that 'Logged in as username' is visible
9. Click 'Delete Account' button
10. Verify that 'ACCOUNT DELETED!' is visible
     */

    HomePage homePage;
    LoginPage loginPage;
    DeleteAccountPage deletePage;

    @Test
    public void userLogin(){
        Driver.getDriver().get(ConfigReader.getProperty("base_url"));
        homePage = new HomePage();
        loginPage= new LoginPage();
        deletePage=new DeleteAccountPage();
        Assert.assertTrue(homePage.loginButton.isDisplayed());
        homePage.loginButton.click();
        Assert.assertTrue(loginPage.loginPageVisibilityCheck.isDisplayed());
        loginPage.emailBox.sendKeys(ConfigReader.getProperty("customer_username"));
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty("customer_password"));
        loginPage.loginPageLoginButton.click();
        Assert.assertTrue(loginPage.loginCheck.isDisplayed());
        loginPage.deleteButton.click();
        deletePage.deletePageButton.click();
        Assert.assertTrue(deletePage.deleteCheck.getText().equals("ACCOUNT DELETED"));
        Driver.closeDriver();




    }


}
