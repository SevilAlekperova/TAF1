package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckoutPage;

public class CheckoutTest extends BaseTest {
    CheckoutPage checkoutPage;

    @Test
    public void successCheckout() throws InterruptedException {
        loginStep.login(ReadProperties.username(), ReadProperties.password());
        Thread.sleep(4000);

        checkoutStep.successAddToShoppingCart();
        Thread.sleep(2000);

        checkoutStep.infoCheckoutSuccess(ReadProperties.firstName(), ReadProperties.lastName(), ReadProperties.postalCode());
        Thread.sleep(2000);

        checkoutStep.finishButton();
    }

    @Test
    public void infoCheckoutIncorrect() throws InterruptedException {
        loginStep.login(ReadProperties.username(), ReadProperties.password());
        Thread.sleep(4000);

        checkoutStep.successAddToShoppingCart();
        Thread.sleep(2000);

        Assert.assertEquals(
                checkoutStep.infoCheckoutIncorrect("", ReadProperties.password(), ReadProperties.postalCode())
                        .getErrorTextElement().getText()
                , "");
    }

    @Test
    public void infoOfElementFromCheckout() throws InterruptedException {
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
