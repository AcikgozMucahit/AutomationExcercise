package automationexcercise.tests;

import automationexcercise.pages.*;
import automationexcercise.utilities.ConfigReader;
import automationexcercise.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC04_Logout_User {
    TC07_HomePage tc07_page = new TC07_HomePage();
    TC05_ExistEmailPage existingEmailPage = new TC05_ExistEmailPage();
    SignUpPage signUpPage=new SignUpPage();
    ProductsPage productsPage=new ProductsPage();
    HomePageAbout_TestCase3 homePageAbout_testCase3=new HomePageAbout_TestCase3();
    @Test
    public void tc04_test() {
        //  1. Launch browser

        //    2. Navigate to url 'http://automationexercise.com'

        Driver.getDriver().get(ConfigReader.getProperty("base_url"));

        //      3. Verify that home page is visible successfully
      Assert.assertTrue( tc07_page.testCasesBtn.isDisplayed());

        //      4. Click on 'Signup / Login' button
        existingEmailPage.signupTab.click();

         //      5. Verify 'Login to your account' is visible
       Assert.assertTrue(signUpPage.LoginToYourAccountText.isDisplayed());

        //6. Enter correct email address and password
homePageAbout_testCase3.invalidemail.sendKeys("birolkoraycetin@gmail.com");
homePageAbout_testCase3.invalidPassword.sendKeys("test123");

        //7. Click 'login' button
        homePageAbout_testCase3.loginButton.click();

        //8. Verify that 'Logged in as username' is visible
       Assert.assertTrue(productsPage.loggedInAsUsername.isDisplayed());

        //9. Click 'Logout' button
        productsPage.logoutButton.click();

         //10. Verify that user is navigated to login page
        Assert.assertTrue( tc07_page.testCasesBtn.isDisplayed());


    }
}