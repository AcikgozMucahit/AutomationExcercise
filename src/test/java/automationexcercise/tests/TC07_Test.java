package automationexcercise.tests;

import automationexcercise.pages.TC07_HomePage;
import automationexcercise.utilities.ConfigReader;
import automationexcercise.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC07_Test{

    TC07_HomePage tc07_page = new TC07_HomePage();
    @Test
    public void tc07_test(){
//1. Launch browser
//2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("base_url"));
//3. Verify that home page is visible successfully
        tc07_page.homePage.click();
//4. Click on 'Test Cases' button
        tc07_page.testCasesBtn.click();
//5. Verify user is navigated to test cases page successfully
        Assert.assertTrue(tc07_page.testCasesText.isDisplayed());
    }
}

