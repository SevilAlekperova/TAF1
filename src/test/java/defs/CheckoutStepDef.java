package defs;

import configuration.ReadProperties;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import steps.CheckoutStep;
import steps.LoginStep;
import steps.MainPageStep;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;

public class CheckoutStepDef {
    @Given("successful login with {string} and {string}")
    public void successfulLogin(String username, String password) {
        LoginStep loginStep = new LoginStep();
        loginStep.loginSuccessfulAndClick(username, password);
    }

    @When("user go to checkoutPage")
    public void userGoToCheckoutPage() {
        MainPageStep mainPageStep = new MainPageStep();
        CheckoutStep checkoutStep = new CheckoutStep();
        mainPageStep.goToCheckoutPage();
        checkoutStep.goToContinueCheckout();
    }

    @When("user successful checkout with {string} and {string} and {string}")
    public void successfulCheckout(String firstName, String lastName, String postalCode) {
        CheckoutStep checkoutStep = new CheckoutStep();
        checkoutStep.successfulCheckout(firstName, lastName, postalCode);
        checkoutStep.clickToFinishCheckout();
        checkoutStep.finishCheckout();
    }

    @Then("checkout complete")
    public void сheckoutFinish() {
        webdriver().shouldHave(url(ReadProperties.succsfullCheckout()));
    }
}
