package tests;

import BaseEntities.BaseTest;
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
import pages.projects.AddProjectPage;
import pages.projects.UpdateProjectPage;
import services.BrowsersService;
import steps.LoginStep;

public class LoginTest extends BaseTest {

    @Test
    public void successLoginTest() {
        loginStep.login(ReadProperties.username(), ReadProperties.password());

        Assert.assertTrue(new DashboardPage(driver).isPageOpened());
    }

    @Test
    public void successLoginTest1() {
        Assert.assertTrue(loginStep.loginSuccessful(ReadProperties.username(), ReadProperties.password()).
                isPageOpened());
    }

    @Test
    public void incorrectUsernameTest() {
        Assert.assertEquals(loginStep.loginIncorrect("sdsd", ReadProperties.password()).getErrorTextElement()
                .getText(), "Email/Login or Password is incorrect. Please try again.");

//        WebElement username = driver.findElement(By.id("name"));
//        WebElement psw = driver.findElement(By.id("password"));
//        WebElement loginButton = driver.findElement(By.id("button_primary"));
//
//        username.sendKeys(ReadProperties.username());
//        psw.sendKeys(ReadProperties.password());
//        loginButton.click();
    }

    @Test
    public void incorrectPswTest() {
        new AddProjectPage(driver).getSaveButton();
        new UpdateProjectPage(driver).nameInput();

    }
}
