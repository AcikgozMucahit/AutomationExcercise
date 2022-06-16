package automationexcercise.pages;

import automationexcercise.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountCreatedPage {
    public AccountCreatedPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//h2//b")
    public WebElement accountCreatedText;
    @FindBy(xpath = "//a[@data-qa='continue-button']")
    public WebElement continueButton;
}
