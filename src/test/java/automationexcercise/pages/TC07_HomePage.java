package automationexcercise.pages;

import automationexcercise.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class TC07_HomePage {

    public TC07_HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//a[@href='/'])[2]")
    public WebElement homePage;
    @FindBy(xpath = "//a[@href = '/test_cases']")
    public WebElement testCasesBtn;
    @FindBy(xpath = "//h2//b")
    public WebElement testCasesText;
}
