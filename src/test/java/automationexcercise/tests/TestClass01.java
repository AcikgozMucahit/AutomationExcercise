package automationexcercise.tests;

import automationexcercise.utilities.ConfigReader;
import automationexcercise.utilities.Driver;
import org.testng.annotations.Test;

public class TestClass01 {

    @Test
    public void test01(){
        Driver.getDriver().get(ConfigReader.getProperty("base_url"));
        Driver.getDriver().close();
    }
}
