package tests.GUI;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.TopMenuPage;
import pages.projects.AddProjectPage;
import pages.projects.UpdateProjectPage;

public class LoginTest extends BaseTest {

    @Test
    public void successLoginTest() {
        loginStep.login(ReadProperties.username(), ReadProperties.password());

        Assert.assertTrue(new DashboardPage(driver).isPageOpened());
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
                , "Email/Login or Password is incorrect. Please try again.");
    }

    //@Test
    public void fail_incorrectUsernameTest() {
        Assert.assertEquals(
                loginStep.loginIncorrect("sdsd", ReadProperties.password())
                        .getErrorTextElement().getText()
                , "Email/Login or Password is incorrect. Please try again.111");
    }
}
