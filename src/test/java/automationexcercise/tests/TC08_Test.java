package automationexcercise.tests;

import automationexcercise.pages.TC07_HomePage;
import automationexcercise.pages.TC08_HomePage;
import automationexcercise.utilities.ConfigReader;
import automationexcercise.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC08_Test {

    TC08_HomePage tc08_page = new TC08_HomePage();
    @Test
    public void tc08_test() {
//1. Launch browser
//2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("base_url"));
//3. Verify that home page is visible successfully
        tc08_page.homePage.click();
//4. Click on 'Products' button
//5. Verify user is navigated to ALL PRODUCTS page successfully
// 6. The products list is visible
        tc08_page.productsBtn.click();
//7. Click on 'View Product' of first product
//8. User is landed to product detail page
//9. Verify that detail detail is visible: product name, category, price, availability, condition, brand
        tc08_page.viewProduct.click();
    }









    }
