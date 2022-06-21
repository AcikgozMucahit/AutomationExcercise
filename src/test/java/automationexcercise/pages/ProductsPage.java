package automationexcercise.pages;

import automationexcercise.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductsPage {
    public ProductsPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }
    //Click on 'Products' button
    @FindBy(xpath = "//a[@href='/products']")
    public WebElement productsOnHomePage;

    //'ALL PRODUCTS' are visible
    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement allProducts;

    //Special Offer Image
    @FindBy(xpath = "//img[@id='sale_image']")
    public  WebElement saleProductImage;

    // Search product box
    @FindBy(xpath = "//input[@name='search']")
    public WebElement searchProduct;

    // Little search button next to search product
    @FindBy(id="submit_search)[2]")
    public WebElement clickButton;

    // The first product of the list
    @FindBy (xpath = "(//p)[4]")
    public WebElement firstProductBlueTop;

    //The products list is visible =>'CATEGORY'
    @FindBy(xpath = "(//div[@class='container'])[3]")
    public WebElement category;

    // Second product of the product list
    @FindBy(xpath = "(//p)[6]")
    public WebElement secondProductMenTshirt;




}
