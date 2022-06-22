package automationexcercise.tests;

import automationexcercise.pages.*;
import automationexcercise.utilities.ConfigReader;
import automationexcercise.utilities.Driver;
import automationexcercise.utilities.ReusableMethods;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1 {
    HomePage homePage=new HomePage();
    Faker faker=new Faker();
    LoginPage loginPage=new LoginPage();
    SignUpPage signUpPage=new SignUpPage();
    ReusableMethods reusableMethods=new ReusableMethods();
    AccountCreatedPage accountCreatedPage=new AccountCreatedPage();
    DeleteAccountPage deleteAccountPage=new DeleteAccountPage();

    @Test
    public void automationSignUpTest(){
        // 1. Launch browser.
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("base_url"));

        //3. Verify that home page is visible successfully
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("https://automationexercise.com/"));
        //4. Click on 'Signup / Login' button
        homePage.signUpButton.click();

        //5. Verify 'New User Signup!' is visible
        Assert.assertTrue(loginPage.newUserSignUpText.isDisplayed());

        // 6. Enter name and email address
        loginPage.nameBox.sendKeys("Bestami Colak");
        loginPage.emailAddressBox.sendKeys(faker.internet().emailAddress());

        //7. Click 'Signup' button
        loginPage.signUPButton.click();

        //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        Assert.assertTrue(signUpPage.enterAccountInformationText.isDisplayed());

        //9. Fill details: Title, Name, Email, Password, Date of birth
        signUpPage.title.click();
        signUpPage.passwordBox.sendKeys(faker.internet().password());
        WebElement dropDown=Driver.getDriver().findElement(By.id("days"));
        Select select=new Select(dropDown);
        select.selectByValue("18");
        WebElement dropDown1=Driver.getDriver().findElement(By.id("months"));
        Select select1=new Select(dropDown1);
        select1.selectByValue("1");
        WebElement dropDown2=Driver.getDriver().findElement(By.id("years"));
        Select select2=new Select(dropDown2);
        select2.selectByValue("1980");

        //10. Select checkbox 'Sign up for our newsletter!'
        signUpPage.newsletterCheckBox.click();

        //11. Select checkbox 'Receive special offers from our partners!'
        signUpPage.receiveSpecialOffersBox.click();

        //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        signUpPage.firstNameBox.sendKeys("Bestami");
        signUpPage.lastNameBox.sendKeys("Colak");
        signUpPage.companyBox.sendKeys(faker.company().name());
        signUpPage.address1Box.sendKeys(faker.address().fullAddress());
        signUpPage.addressBox2.sendKeys(faker.address().fullAddress());
        WebElement dropDown3=Driver.getDriver().findElement(By.id("country"));
        Select select3=new Select(dropDown3);
        select3.selectByValue("United States");
        signUpPage.stateBox.sendKeys(faker.address().state());
        signUpPage.cityBox.sendKeys(faker.address().city());
        signUpPage.zipCodeBox.sendKeys(faker.address().zipCode());
        signUpPage.mobileBox.sendKeys(faker.phoneNumber().cellPhone());

        //13. Click 'Create Account button'
        signUpPage.createAccount.click();

        //14. Verify that 'ACCOUNT CREATED!' is visible
        Assert.assertTrue(accountCreatedPage.accountCreatedText.isDisplayed());

        //15. Click 'Continue' button
        accountCreatedPage.continueButton.click();
        //16. Verify that 'Logged in as username' is visible
        Assert.assertTrue((homePage.loggedInAs.isDisplayed()));
        //17. Click 'Delete Account' button
        homePage.deleteAccountButton.click();
        deleteAccountPage.deleteButtonSecond.click();
        //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
        //This page is not showing properly
        Driver.closeDriver();
    }
}
