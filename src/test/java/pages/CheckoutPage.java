package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    public WebElement addToCardButton;
    @FindBy(id = "shopping_cart_container")
    public WebElement shoppingCartContainerIcon;

    @FindBy(id = "checkout")
    public WebElement checkoutButton;

    @FindBy(id = "first-name")
    public WebElement firstName;

    @FindBy(id = "last-name")
    public WebElement lastName;

    @FindBy(id = "postal-code")
    public WebElement postalCode;

    @FindBy(id = "submit-button")
    public WebElement continueButton;

    @FindBy(className = "btn_action")
    public WebElement finishButton;

    @FindBy(id = "inventory_item_name")
    public WebElement infoOfElement;

    @FindBy(id = "cancel")
    public WebElement cancelButton;



    // Блок инициализации страницы
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public void clickAddToCardButton() { addToCardButton.click(); }
    public void clickShoppingCartContainerIcon() { shoppingCartContainerIcon.click(); }
    public void clickCheckoutButton() { checkoutButton.click(); }
    public void setFirstName(String value) { firstName.sendKeys(value); }
    public void setLastName(String value) { lastName.sendKeys(value); }
    public void setPostalCode(String value) { postalCode.sendKeys(value); }
    public void clickContinueButton() { continueButton.click(); }
    public void clickFinishButton() { finishButton.click(); }
    public void clickInfoOfElement() { infoOfElement.click(); }
    public void clickCancelButton() { cancelButton.click(); }

}
