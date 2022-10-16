package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage extends BasePage {
    //Блок описания селекторов
    private final By addToCardButtonLocator = By.id("add-to-cart-sauce-labs-backpack");
    private final By shoppingCartContainerIconLocator = By.id("shopping_cart_container");
    private final By checkoutButtonLocator = By.id("checkout");
    private final By firstNameLocator = By.id("first-name");
    private final By lastNameLocator = By.id("last-name");
    private final By postalCodeLocator = By.id("postal-code");
    private final By continueButtonLocator = By.className("submit-button");
    private final By finishButtonLocator = By.className("btn_action");
    private final By errorTextLocator = By.className("error-message-container");
    private final By infoOfElementLocator = By.className("inventory_item_name");
    private final By cancelButtonLocator = By.id("cancel");

    //Блок инициализации
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return checkoutButtonLocator;
    }

    //Блок атомарных методов
    public WebElement getAddToCardButton() { return driver.findElement(addToCardButtonLocator); }
    public WebElement getShoppingCartContainer() { return driver.findElement(shoppingCartContainerIconLocator); }
    public WebElement getFirstName() { return driver.findElement(firstNameLocator); }
    public WebElement getLastNameButton() { return driver.findElement(lastNameLocator); }
    public WebElement getPostalCodeButton() { return driver.findElement(postalCodeLocator); }
    public WebElement getCheckoutButton() { return driver.findElement(checkoutButtonLocator); }
    public WebElement getContinueButton() { return driver.findElement(continueButtonLocator); }
    public WebElement getFinishButton() { return driver.findElement(finishButtonLocator); }
    public WebElement getErrorTextElement() { return driver.findElement(errorTextLocator); }
    public WebElement getInfoOfElementElement() { return driver.findElement(infoOfElementLocator); }
    public WebElement getCancelButton() { return driver.findElement(cancelButtonLocator); }

    public void clickAddToCardButton() { getAddToCardButton().click(); }
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
