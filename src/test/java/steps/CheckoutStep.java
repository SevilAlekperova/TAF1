package steps;

import baseEntities.BasePage;
import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;
import pages.CheckoutPage;

public class CheckoutStep extends BaseStep {
    CheckoutPage checkoutPage;

    public CheckoutStep(WebDriver driver) {
        super(driver);

        checkoutPage = new CheckoutPage(driver);
    }

    public CheckoutPage successAddToShoppingCart() throws InterruptedException {
        checkoutPage.clickAddToCardButton();
        Thread.sleep(2000);
        checkoutPage.clickShoppingCartContainerIcon();
        Thread.sleep(2000);
        checkoutPage.clickCheckoutButton();
        Thread.sleep(2000);

        return checkoutPage;
    }

    public CheckoutPage CheckoutSuccess(String firstName, String lastName, String postalCode) {
        checkoutPage.setFirstName(firstName);
        checkoutPage.setLastName(lastName);
        checkoutPage.setPostalCode(postalCode);

        return checkoutPage;
    }

    public CheckoutPage CheckoutIncorrect(String firstName, String lastName, String postalCode) {
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
