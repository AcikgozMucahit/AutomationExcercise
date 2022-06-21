package automationexcercise.tests;

import automationexcercise.pages.HomePage;
import automationexcercise.utilities.ConfigReader;
import automationexcercise.utilities.Driver;
import automationexcercise.utilities.JSUtils;
import automationexcercise.utilities.ReusableMethods;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase10 {
    HomePage homePage;
    @Test
    public void testCase09() {
        homePage = new HomePage();

        Driver.getDriver().get(ConfigReader.getProperty("base_url"));
        String title = Driver.getDriver().getTitle();
        String url = Driver.getDriver().getCurrentUrl();

        SoftAssert softAssert = new SoftAssert();
        Assert.assertEquals(title, ConfigReader.getProperty("title"), "The title did not match");
        Assert.assertEquals(url, ConfigReader.getProperty("url"), "The url did not match");

        softAssert.assertEquals(title, ConfigReader.getProperty("title"), "The title did not match");
        softAssert.assertEquals(url, ConfigReader.getProperty("url"), "The url did not match");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        String isPageCompleted = js.executeScript("return document.readyState").toString();

        softAssert.assertEquals(isPageCompleted, "complete");
        Assert.assertEquals(isPageCompleted, "complete");

        JSUtils.scrollIntoViewJS(homePage.footer);

        Assert.assertTrue(homePage.subscriptionText.isDisplayed());

        homePage.subscriptionEmail.sendKeys(ConfigReader.getProperty("email"));
        homePage.subscriptionSubmitBtn.click();

        ReusableMethods.waitForVisibility(homePage.subscriptionSuccessAlert,3);

        Assert.assertTrue(homePage.subscriptionSuccessAlert.isDisplayed());

        Driver.closeDriver();


    }
}
