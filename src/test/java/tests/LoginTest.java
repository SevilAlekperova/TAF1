package tests;

import configuration.ReadProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;
import services.BrowsersService;

public class LoginTest extends BaseTest {

    @Test
    public void successLoginTest() {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.loginSuccessful(ReadProperties.username(), ReadProperties.password());
        Assert.assertTrue(new DashboardPage(driver).isPageOpened());
    }

    @Test
    public void incorrectUserNameTest() {
//        WebElement username = driver.findElement(By.id("name"));
//        WebElement psw = driver.findElement(By.id("password"));
//        WebElement loginButton = driver.findElement(By.id("button_primary"));
//
//        username.sendKeys(ReadProperties.username());
//        psw.sendKeys(ReadProperties.password());
//        loginButton.click();

        DashboardPage dashboardPage = new DashboardPage(driver);
    }

    @Test
    public void incorrectPswTest() {
    }
}
