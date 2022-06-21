package automationexcercise.tests;

import automationexcercise.pages.HomePageAbout_TestCase3;
import automationexcercise.utilities.ConfigReader;
import automationexcercise.utilities.Driver;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase3_NegativeTest {

//  Test Case 3: Login User with incorrect email and password

    HomePageAbout_TestCase3 homePageAboutTestCase3 = new HomePageAbout_TestCase3();
    Faker faker = new Faker();
    @Test
    public void NegativeTest() {
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("base_url"));

        //3. Verify that home page is visible successfully
        Assert.assertEquals( Driver.getDriver().getCurrentUrl(), "https://www.automationexercise.com/");

        //4. Click on 'Signup / Login' button
        homePageAboutTestCase3.signUpLogin.click();

        //5. Verify 'Login to your account' is visible
        Assert.assertEquals(homePageAboutTestCase3.loginToYourAccnt.getText(),"Login to your account");

        //6. Enter incorrect email address and password
        homePageAboutTestCase3.invalidemail.sendKeys(faker.internet().emailAddress());
        homePageAboutTestCase3.invalidPassword.sendKeys(faker.internet().password());

        //7. Click 'login' button
        homePageAboutTestCase3.loginButton.click();

        //8. Verify error 'Your email or password is incorrect!' is visible
        Assert.assertTrue(homePageAboutTestCase3.warningMessage.isDisplayed());

//        Driver.closeDriver();
    }
}
