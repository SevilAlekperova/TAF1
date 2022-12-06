package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckoutPage;
import pages.ProductsPage;
import steps.CheckoutStep;
import steps.LoginStep;

import static com.codeborne.selenide.Selenide.open;

public class CheckoutTest extends BaseTest {
    CheckoutPage checkoutPage;

    @Test
    public void successCheckout() throws InterruptedException {
        LoginStep loginStep = open("", LoginStep.class);
        loginStep.loginSuccessful(ReadProperties.username(), ReadProperties.password());
        Thread.sleep(4000);

        CheckoutStep checkoutStep = open("", CheckoutStep.class);
        checkoutStep.successAddToShoppingCart();
        Thread.sleep(2000);

        checkoutStep.infoCheckoutSuccess(ReadProperties.firstName(), ReadProperties.lastName(), ReadProperties.postalCode());
        Thread.sleep(2000);

        checkoutStep.finishButton();
    }



    @Test
    public void infoOfElementFromCheckout() throws InterruptedException {
        LoginStep loginStep = open("", LoginStep.class);
        CheckoutStep checkoutStep = open("", CheckoutStep.class);
        loginStep.login(ReadProperties.username(), ReadProperties.password());
        Thread.sleep(4000);

        checkoutStep.successAddToShoppingCart();
        Thread.sleep(2000);

        checkoutStep.infoCheckoutSuccess(ReadProperties.firstName(), ReadProperties.lastName(), ReadProperties.postalCode());
        Thread.sleep(2000);

        checkoutStep.continueButton();

        checkoutStep.infoOfElement();
        Thread.sleep(2000);


    }

    @Test
    public void returnToProducts() throws InterruptedException {
        LoginStep loginStep = open("", LoginStep.class);
        CheckoutStep checkoutStep = open("", CheckoutStep.class);
        loginStep.login(ReadProperties.username(), ReadProperties.password());
        Thread.sleep(4000);

        checkoutStep.successAddToShoppingCart();
        Thread.sleep(2000);

        checkoutStep.infoCheckoutSuccess(ReadProperties.firstName(), ReadProperties.lastName(), ReadProperties.postalCode());
        Thread.sleep(2000);

        checkoutStep.continueButton();

        checkoutStep.cancelButton();
        Thread.sleep(2000);
    }

    @Test
    public void returnToCart() throws InterruptedException {
        LoginStep loginStep = open("", LoginStep.class);
        CheckoutStep checkoutStep = open("", CheckoutStep.class);
        loginStep.login(ReadProperties.username(), ReadProperties.password());
        Thread.sleep(4000);

        checkoutStep.successAddToShoppingCart();
        Thread.sleep(2000);

        checkoutStep.infoCheckoutSuccess(ReadProperties.firstName(), ReadProperties.lastName(), ReadProperties.postalCode());
        Thread.sleep(2000);

        checkoutStep.continueButton();

        checkoutStep.shoppingCartIcon();
        Thread.sleep(2000);
    }
}
