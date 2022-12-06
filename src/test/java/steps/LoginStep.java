package steps;

import pages.LoginPage;
import pages.ProductsPage;

import static com.codeborne.selenide.Selenide.page;


public class LoginStep {
    LoginPage loginPage;
    ProductsPage productsPage;

    public LoginStep() {
        loginPage = new LoginPage();
        productsPage = new ProductsPage();
    }

    public void login(String user, String psw) {
        loginPage.setEmail(user);
        loginPage.setPsw(psw);
        loginPage.clickLoginButton();
    }

    public ProductsPage loginSuccessful(String user, String psw)  {
        login(user, psw);
        return page(ProductsPage.class);
    }


    public LoginPage loginIncorrect(String user, String psw) {
        login(user, psw);
        return page(LoginPage.class);
    }
}
