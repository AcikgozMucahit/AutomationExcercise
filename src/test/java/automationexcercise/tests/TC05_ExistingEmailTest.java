package automationexcercise.tests;

import automationexcercise.pages.TC05_ExistEmailPage;
import automationexcercise.utilities.ConfigReader;
import automationexcercise.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC05_ExistingEmailTest {
    TC05_ExistEmailPage existingEmailPage = new TC05_ExistEmailPage();
        @Test
    public void existingEmail(){
//1. Launch browser
//2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("base_url"));
//3. Verify that home page is visible successfull
        existingEmailPage.homePage.sendKeys(ConfigReader.getProperty("home_page"));
//4. Click on 'Signup / Login' button
        existingEmailPage.signupTab.click();
//5. Verify 'New User Signup!' is visible
        existingEmailPage.signUpName.sendKeys(ConfigReader.getProperty("name"));
//6. Enter name and already registered email address
        existingEmailPage.emailAddress.sendKeys(ConfigReader.getProperty("address_username"));
//7. Click 'Signup' button
        existingEmailPage.loginTab.click();
//8. Verify error 'Email Address already exist!' is visible
            Assert.assertTrue(existingEmailPage.emailAlreadyExist.isDisplayed());

  }
}
