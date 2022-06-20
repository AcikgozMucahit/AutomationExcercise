package automationexcercise.pages;

import automationexcercise.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
    public SignUpPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "(//h2)[1]")
    public WebElement enterAccountInformationText;
    @FindBy(id = "id_gender1")
    public WebElement title;
    @FindBy(id = "password")
    public WebElement passwordBox;
    @FindBy(id = "newsletter")
    public WebElement newsletterCheckBox;
    @FindBy(id = "optin")
    public WebElement receiveSpecialOffersBox;
    @FindBy(id="first_name")
    public WebElement firstNameBox;
    @FindBy(id = "last_name")
    public WebElement lastNameBox;
    @FindBy(id = "company")
    public WebElement companyBox;
    @FindBy(id = "address1")
    public WebElement address1Box;
    @FindBy(id = "address2")
    public WebElement addressBox2;
    @FindBy(id = "state")
    public WebElement stateBox;
    @FindBy(id = "city")
    public WebElement cityBox;
    @FindBy(id = "zipcode")
    public WebElement zipCodeBox;
    @FindBy(id = "mobile_number")
    public WebElement mobileBox;
    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement createAccount;
    @FindBy (xpath = "//*[text()='Login to your account']")
    public WebElement LoginToYourAccountText;
}
