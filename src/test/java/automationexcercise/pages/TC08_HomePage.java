package automationexcercise.pages;
import automationexcercise.utilities.Driver;
import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class TC08_HomePage {

    public TC08_HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//a[@href='/'])[2]")
    public WebElement homePage;
    @FindBy(xpath = "//a[@href = '/products']")
    public WebElement productsBtn;
    @FindBy (xpath = "//h2//h2")
    public WebElement ALLPRODUCTtext;
    @FindBy(xpath = "//a[@href = '/product_details/1']")
    public WebElement viewProduct;
}
