package steps;

import pages.ContainerMenuPage;
import pages.ManeMenuPage;
import pages.LoginPage;


public class LoginStep {
    LoginPage loginPage;
    ManeMenuPage maneMenuPage;
    ContainerMenuPage containerMenuPage;


    public LoginStep() {
        loginPage = new LoginPage();
        maneMenuPage = new ManeMenuPage();
        containerMenuPage = new ContainerMenuPage();
    }

    public void login(String user, String psw) {
        loginPage.setEmail(user);
        loginPage.setPsw(psw);

    }

    public void loginSuccessful(String user, String psw) {
        login(user, psw);
    }

    public void loginSuccessfulAndClick(String user, String psw) {
        login(user, psw);
        loginPage.clickLoginButton();
    }
}

