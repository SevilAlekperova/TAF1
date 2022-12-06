package steps;

import org.checkerframework.checker.units.qual.C;
import pages.CheckoutPage;

public class CheckoutStep {
    CheckoutPage checkoutPage;


    public CheckoutStep() {
        checkoutPage = new CheckoutPage();
    }

    public void successAddToShoppingCart() throws InterruptedException {
        checkoutPage.clickAddToCardButton();
        Thread.sleep(2000);
        checkoutPage.clickShoppingCartContainerIcon();
        Thread.sleep(2000);
        checkoutPage.clickCheckoutButton();
        Thread.sleep(2000);
    }

    public void infoCheckoutSuccess(String firstName, String lastName, String postalCode) {
        checkoutPage.setFirstName(firstName);
        checkoutPage.setLastName(lastName);
        checkoutPage.setPostalCode(postalCode);
    }

    public CheckoutPage infoCheckoutIncorrect(String firstName, String lastName, String postalCode) {
        checkoutPage.setFirstName(firstName);
        checkoutPage.setLastName(lastName);
        checkoutPage.setPostalCode(postalCode);

        return checkoutPage;
    }


    public void continueButton() throws InterruptedException {
        checkoutPage.clickContinueButton();
        Thread.sleep(2000);
    }
    public void finishButton(){
        checkoutPage.clickFinishButton();
    }

    public void infoOfElement() {
        checkoutPage.clickInfoOfElement();
    }

    public void cancelButton(){
        checkoutPage.clickCancelButton();
    }

    public void shoppingCartIcon(){
        checkoutPage.clickShoppingCartContainerIcon();
    }

}
