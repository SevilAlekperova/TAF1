package baseEntities;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import configuration.ReadProperties;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;


public class BaseTest {


    @BeforeSuite
    public void setUp() {
        Configuration.baseUrl = ReadProperties.getUrl();
        Configuration.timeout = 1000;
        Configuration.clickViaJs = true;
    }

    @AfterMethod
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}
