package steps;


import pages.CheckoutPage;
import pages.ManeMenuPage;

public class CheckoutStep  {

    ManeMenuPage maneMenuPage;

    CheckoutPage checkoutPage;

    public CheckoutStep() {
        maneMenuPage = new ManeMenuPage();
        checkoutPage = new CheckoutPage();
    }

    public void goToContinueCheckout() {
        checkoutPage.clickButtonCheckout();
    }

    public void successfulCheckout(String firstName, String lastname, String zipCode) {
        checkoutPage.setFistName(firstName);
        checkoutPage.setLastName(lastname);
        checkoutPage.setLastZipCode(zipCode);
    }

    public void clickToFinishCheckout() {
        checkoutPage.clickContinue();
    }

    public void finishCheckout() {
        checkoutPage.clickFinish();
    }
}
