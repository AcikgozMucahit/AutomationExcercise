package automationexcercise.pages;

import automationexcercise.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteAccountPage {
    public DeleteAccountPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//button[@class='btn btn-danger']")
    public WebElement deleteButtonSecond;

    @FindBy(xpath = "//button[@class='btn btn-danger button-form js-tooltip']")
        public WebElement deletePageButton;

    @FindBy(xpath = "//b[normalize-space()='HTTP 405 Method Not Allowed']")
        public WebElement deleteCheck;

}
