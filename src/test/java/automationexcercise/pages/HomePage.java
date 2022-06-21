package automationexcercise.pages;

import automationexcercise.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "footer")
    public WebElement footer;

    @FindBy(xpath = "//div[@class = 'single-widget']/h2")
    public WebElement subscriptionText;

    @FindBy(id = "susbscribe_email")
    public WebElement subscriptionEmail;

    @FindBy(id = "subscribe")
    public WebElement subscriptionSubmitBtn;

    @FindBy(xpath = "//div[@class = 'alert-success alert']")
    public WebElement subscriptionSuccessAlert;
}
