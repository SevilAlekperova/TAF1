package baseEntities;

import configuration.ReadProperties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.CheckoutPage;
import services.BrowsersService;
import steps.CheckoutStep;
import steps.LoginStep;

public class BaseTest {
    protected WebDriver driver;
    protected LoginStep loginStep;
    protected CheckoutStep checkoutStep;

    @BeforeMethod
    public void setUp() {
        driver = new BrowsersService().getDriver();
        driver.get(ReadProperties.getUrl());

        loginStep = new LoginStep(driver);
        checkoutStep = new CheckoutStep(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
