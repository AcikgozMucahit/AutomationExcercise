package automationexcercise.pages;

import automationexcercise.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//h2)[3]")
    public WebElement newUserSignUpText;
    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameBox;
    @FindBy(xpath = "(//input[@name='email'])[2]")
    public WebElement emailAddressBox;
    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement signUPButton;
    @FindBy(xpath = "(//input[@type='email'])[1]")
    public WebElement emailBox;

    @FindBy(xpath = "(//input[@type='password'])[1]")
    public WebElement passwordBox;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement loginPageLoginButton;

    @FindBy(xpath = "//li[9]//a[1]")
    public WebElement loginCheck;

    @FindBy(xpath = "(//a[normalize-space()='Delete Account'])[1]")
    public WebElement deleteButton;
    @FindBy(xpath = "//h2[text()='Login to your account']")
    public WebElement loginPageVisibilityCheck;
}
