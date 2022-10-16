package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void successLoginTest() throws InterruptedException {
        loginStep.login(ReadProperties.username(), ReadProperties.password());

        Thread.sleep(2000);
    }

    @Test
    public void successLoginTest1() {
        Assert.assertTrue(
                loginStep.loginSuccessful(ReadProperties.username(), ReadProperties.password())
                        .isPageOpened());
    }

    @Test
    public void incorrectUsernameTest() {
        Assert.assertEquals(
                loginStep.loginIncorrect("sdsd", ReadProperties.password())
                        .getErrorTextElement().getText()
                , "Epic sadface: Username and password do not match any user in this service");
    }

    @Test
    public void incorrectPswTest() {
        Assert.assertEquals(
                loginStep.loginIncorrect(ReadProperties.username(), "ReadProperties.password()")
                        .getErrorTextElement().getText()
                , "Epic sadface: Username and password do not match any user in this service");
    }
}
