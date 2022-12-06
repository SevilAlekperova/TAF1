package pages;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;

public class ManeMenuPage {
    private final static String pagePath = "/inventory.html";


    // Блок описания селекторов для элементов
    private final By headerTitleLabelLocator = By.xpath("//*[text()='Products']");
    private final By sauceLabsBackpackLocator = By.id("add-to-cart-sauce-labs-backpack");
    private final By sauceLabsBikeLighLocator = By.id("add-to-cart-sauce-labs-bike-light");
    private final By sauceLabsBoltTShirtLocator = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    private final By sauceLabsFleeceJackeLocator = By.id("add-to-cart-sauce-labs-fleece-jacket");
    private final By sauceLabsOnesieLocator = By.id("add-to-cart-sauce-labs-onesie");
    private final By testallTheThingsTShirtRedLocators = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
    private final By sauceLabsBackpackLocatorRemove = By.id("remove-sauce-labs-backpack");
    private final By sauceLabsBikeLighLocatorRemove = By.id("remove-sauce-labs-bike-light");
    private final By sauceLabsBoltTShirtLocatoRemove = By.id("remove-sauce-labs-bolt-t-shirt");
    private final By sauceLabsFleeceJackeLocatorRemove = By.id("remove-sauce-labs-fleece-jacket");
    private final By sauceLabsOnesieLocatorRemove = By.id("remove-sauce-labs-onesie");
    private final By testallTheThingsTShirtRedLocatorsRemove = By.id("remove-test.allthethings()-t-shirt-(red)");
    private final By shoppingCartValueLocators = By.className("shopping_cart_badge");
    private final By shoppingCartLink = By.className("shopping_cart_link");
    private final By twitterClick = By.linkText("Twitter");
    private final By facebookClick = By.linkText("Facebook");


    public SelenideElement getSauceLabsBikeLighLocatorRemove() {
        return $(sauceLabsBikeLighLocatorRemove).shouldBe(Condition.visible);
    }

    public SelenideElement getSauceLabsBoltTShirtLocatoRemove() {
        return $(sauceLabsBoltTShirtLocatoRemove).shouldBe(Condition.visible);
    }

    public SelenideElement getSauceLabsFleeceJackeLocatorRemove() {
        return $(sauceLabsFleeceJackeLocatorRemove).shouldBe(Condition.visible);
    }

    public SelenideElement getSauceLabsOnesieLocatorRemove() {
        return $(sauceLabsOnesieLocatorRemove).shouldBe(Condition.visible);
    }

    public SelenideElement getTestallTheThingsTShirtRedLocatorsRemove() {
        return $(testallTheThingsTShirtRedLocatorsRemove).shouldBe(Condition.visible);
    }


    public SelenideElement getShoppingCartLink() {
        return $(shoppingCartLink).shouldBe(Condition.visible);
    }

    public void clickToCheckoutPage() {
        getShoppingCartLink().click();
    }


    public SelenideElement getSauceLabsBackpackLocator() {
        return $(sauceLabsBackpackLocator).shouldBe(Condition.visible);

    }

    public SelenideElement getSauceLabsBikeLighLocator() {
        return $(sauceLabsBikeLighLocator).shouldBe(Condition.visible);
    }

    public SelenideElement getSauceLabsBoltTShirtLocator() {
        return $(sauceLabsBoltTShirtLocator).shouldBe(Condition.visible);
    }

    public SelenideElement getSauceLabsFleeceJackeLocator() {
        return $(sauceLabsFleeceJackeLocator).shouldBe(Condition.visible);
    }

    public SelenideElement getSauceLabsOnesieLocator() {
        return $(sauceLabsOnesieLocator).shouldBe(Condition.visible);
    }

    public SelenideElement getTestallTheThingsTShirtRedLocators() {
        return $(testallTheThingsTShirtRedLocators).shouldBe(Condition.visible);
    }

    public SelenideElement getTwitterClick() {
        return $(twitterClick).shouldBe(Condition.visible);
    }

    public void twitterClick() {
        getTwitterClick().click();
    }

    public SelenideElement getFacebookClick() {
        return $(facebookClick).shouldBe(Condition.visible);
    }

    public void facebookClick() {
        getFacebookClick().click();
    }

    public SelenideElement getSauceLabsBackpackLocatorRemove() {
        return $(sauceLabsBackpackLocatorRemove).shouldBe(Condition.visible);
    }


    public void removeToShoppingCarsStepSauceLabsBackPack() {
        getSauceLabsBackpackLocatorRemove().click();

    }

    public void addToShoppingCarsStepSauceLabsBackPack() {
        getSauceLabsBackpackLocator().click();
    }

    public void removeToShoppingCarsStepSauceLabsBikeLight() {
        getSauceLabsBikeLighLocatorRemove().click();

    }

    public void addToShoppingCartStepSauceLabsBoltTShirt() {
        getSauceLabsBoltTShirtLocator().click();
    }

    public void removeToShoppingCartStepSauceLabsBoltTShirt() {
        getSauceLabsBoltTShirtLocatoRemove().click();
    }

    public void addToShoppingCarsStepSauceLabsBikeLight() {
        getSauceLabsBikeLighLocator().click();
    }


    public void removeToShoppingCartStepSauceSauceLabsFleeceJacket() {
        getSauceLabsFleeceJackeLocatorRemove().click();
    }

    public void addToShoppingCartStepSauceSauceLabsFleeceJacket() {
        getSauceLabsFleeceJackeLocator().click();
    }

    public void addToShoppingCartStepSauceLabsOnesie() {
        getSauceLabsOnesieLocator().click();
    }

    public void removeToShoppingCartStepSauceLabsOnesie() {
        getSauceLabsOnesieLocatorRemove().click();
    }

    public void addToShoppingCarsStepTShirtRed() {
        getTestallTheThingsTShirtRedLocators().click();
    }

    public void removeToShoppingCarsStepTShirtRed() {
        getTestallTheThingsTShirtRedLocatorsRemove().click();
    }

    public SelenideElement getShoppingCartValueLocators() {
        return $(shoppingCartValueLocators).shouldBe(Condition.visible);
    }
}


