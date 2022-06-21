package automationexcercise.pages;

import automationexcercise.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageAbout_TestCase3 {

    public HomePageAbout_TestCase3(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(partialLinkText="Login" )
    public WebElement signUpLogin;

    @FindBy(xpath = "(//h2)[1]")
    public WebElement loginToYourAccnt;

    @FindBy(xpath= "//input[@data-qa='login-email']")
    public WebElement invalidemail;

    @FindBy(xpath  ="//input[@data-qa='login-password']")
    public WebElement invalidPassword;

    @FindBy(xpath ="//button[@data-qa='login-button']")
    public WebElement loginButton;

    @FindBy(xpath = "//form[@action='/login']/p")
    public WebElement warningMessage;

}

