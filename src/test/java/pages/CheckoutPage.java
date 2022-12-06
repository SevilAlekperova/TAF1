package pages;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;

public class CheckoutPage{
    // Блок описания селекторов для элементов
    private final By addToCardButtonLocator = By.id("add-to-cart-sauce-labs-backpack");
    private final By shoppingCartContainerIconLocator = By.className("shopping_cart_link");
    private final By checkoutButtonLocator = By.id("checkout");
    private final By firstNameLocator = By.id("first-name");
    private final By lastNameLocator = By.id("last-name");
    private final By postalCodeLocator = By.id("postal-code");
    private final By continueButtonLocator = By.className("submit-button");
    private final By finishButtonLocator = By.className("btn_action");
    private final By infoOfElementLocator = By.className("inventory_item_name");
    private final By cancelButtonLocator = By.id("cancel");



    // Блок инициализации страницы

    // Блок атомарных методов
    public SelenideElement getAddToCardButton() {
        return $(addToCardButtonLocator).shouldBe(Condition.visible);

    }
    public SelenideElement getShoppingCartContainer() {
        return $(shoppingCartContainerIconLocator).shouldBe(Condition.visible);
    }
    public SelenideElement getFirstName() {
        return $(firstNameLocator).shouldBe(Condition.visible);
    }
    public SelenideElement getLastNameButton() {
        return $(lastNameLocator).shouldBe(Condition.visible);
    }
    public SelenideElement getPostalCodeButton() {
        return $(postalCodeLocator).shouldBe(Condition.visible);
    }
    public SelenideElement getCheckoutButton() {
        return $(checkoutButtonLocator).shouldBe(Condition.visible);
    }
    public SelenideElement getContinueButton() {
        return $(continueButtonLocator).shouldBe(Condition.visible);
    }
    public SelenideElement getFinishButton() {
        return $(finishButtonLocator).shouldBe(Condition.visible);
    }
    public SelenideElement getInfoOfElementElement() {
        return $(infoOfElementLocator).shouldBe(Condition.visible);
    }
    public SelenideElement getCancelButton() {
        return $(cancelButtonLocator).shouldBe(Condition.visible);
    }




    public void clickAddToCardButton() {
        getAddToCardButton().click();
    }
    public void clickShoppingCartContainerIcon() { getShoppingCartContainer().click(); }
    public void clickCheckoutButton() { getCheckoutButton().click(); }
    public void setFirstName(String value) { getFirstName().sendKeys(value); }
    public void setLastName(String value) { getLastNameButton().sendKeys(value); }
    public void setPostalCode(String value) { getPostalCodeButton().sendKeys(value); }
    public void clickContinueButton() { getContinueButton().click(); }
    public void clickFinishButton() { getFinishButton().click(); }
    public void clickInfoOfElement() { getInfoOfElementElement().click(); }
    public void clickCancelButton() { getCancelButton().click(); }

}
