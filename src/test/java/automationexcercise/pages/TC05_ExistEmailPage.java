package automationexcercise.pages;

import automationexcercise.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//1. Launch browser
//2. Navigate to url 'http://automationexercise.com'
//3. Verify that home page is visible successfully
//4. Click on 'Signup / Login' button
//5. Verify 'New User Signup!' is visible
//6. Enter name and already registered email address
//7. Click 'Signup' button
//8. Verify error 'Email Address already exist!' is visible

public class TC05_ExistEmailPage {
    public TC05_ExistEmailPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@href='/'])[2]")
    public WebElement homePage;
    @FindBy(xpath = "//a[@href='/login']")
    public WebElement signupTab;
    @FindBy(xpath = "(//h2)[3]")
    public WebElement userSignup;
    @FindBy(xpath = "//input[@type=\"text\"]")
    public WebElement signUpName;
    @FindBy(xpath = "(//input[@placeholder='Email Address'])[2]")
    public WebElement emailAddress;
    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/button")
    public WebElement loginTab;
    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/p")
    public WebElement emailAlreadyExist;
}
