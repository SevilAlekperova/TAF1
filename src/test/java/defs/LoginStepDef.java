package defs;

import com.codeborne.selenide.Condition;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import steps.LoginStep;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;

public class LoginStepDef {
    @Given("user open login page")
    public void userOpenLoginPage() {
        open("https://www.saucedemo.com/");
    }

    @When("click login button")
    public void clickLoginButton() {
        $(By.id("login-button")).click();
    }

    @Then("user pass to MainPage")
    public void mainPageIsOpened() {
        webdriver().shouldHave(url("https://www.saucedemo.com/inventory.html"));
    }


    @Then("user should receive {string}")
    public void userErrorText(String text) {
        $(By.tagName("h3")).shouldHave(Condition.text(text));
    }

    @When("user enter {string} and {string}")
    public void userLogin(String username, String password) {
        LoginStep loginStep = new LoginStep();
        loginStep.loginSuccessful(username, password);
    }
}


