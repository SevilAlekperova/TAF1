package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;
import pages.ItemsPage;
import pages.LoginPage;

public class LoginStep extends BaseStep {
    LoginPage loginPage;

    public LoginStep(WebDriver driver) {
        super(driver);

        loginPage = new LoginPage(driver);
    }

    public void login(String email, String psw) {
        loginPage.setEmail(email);
        loginPage.setPsw(psw);
        loginPage.clickLoginButton();
    }

    public ItemsPage loginSuccessful(String email, String psw) {
        login(email, psw);

        return new ItemsPage(driver);
    }

    public LoginPage loginIncorrect(String email, String psw) {
        login(email, psw);

        return loginPage;
    }
}
