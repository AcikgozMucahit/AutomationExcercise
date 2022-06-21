package automationexcercise.pages;

import automationexcercise.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    public CartPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//img[@alt='Product Image'])[1]")
    public WebElement firstProduct;

    @FindBy(xpath = "//img[@alt='Product Image'])[1]")
    public WebElement secondProduct;
}
