package tests;

import baseEntities.BaseTest;
import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;
import configuration.ReadProperties;
import pages.ManeMenuPage;
import steps.LoginStep;
import steps.MainPageStep;


import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;


public class MainMenuTest extends BaseTest {


    @Test
    public void addOneProductTest() {
        LoginStep loginStep = open("", LoginStep.class);
        MainPageStep mainPageStep = open("", MainPageStep.class);
        loginStep.loginSuccessful(ReadProperties.usernameStandard(), ReadProperties.password());
        ManeMenuPage maneMenuPage = mainPageStep.addSauceLabsBaskPack();
        maneMenuPage.getShoppingCartValueLocators().shouldHave(Condition.text("1"));
    }

    @Test
    public void addTwoProductTest() {
        LoginStep loginStep = open("", LoginStep.class);
        MainPageStep mainPageStep = open("", MainPageStep.class);
        loginStep.loginSuccessful(ReadProperties.usernameStandard(), ReadProperties.password());
        mainPageStep.addSauceLabsBaskPack();
        ManeMenuPage maneMenuPage = mainPageStep.addSauceLabsBoltTShirt();
        maneMenuPage.getShoppingCartValueLocators().shouldHave(Condition.text("2"));
    }

    @Test
    public void addTheProductTest() {
        LoginStep loginStep = open("", LoginStep.class);
        MainPageStep mainPageStep = open("", MainPageStep.class);
        loginStep.loginSuccessful(ReadProperties.usernameStandard(), ReadProperties.password());
        mainPageStep.addSauceLabsBikeLight();
        mainPageStep.addSauceLabsBoltTShirt();
        ManeMenuPage maneMenuPage = mainPageStep.addSauceLabsOnesie();
        maneMenuPage.getShoppingCartValueLocators().shouldHave(Condition.text("3"));
    }

    @Test
    public void addFourProductTest() {
        LoginStep loginStep = open("", LoginStep.class);
        MainPageStep mainPageStep = open("", MainPageStep.class);
        loginStep.loginSuccessful(ReadProperties.usernameStandard(), ReadProperties.password());
        mainPageStep.addSauceLabsOnesie();
        mainPageStep.addSauceLabsBikeLight();
        mainPageStep.addSauceSauceLabsFleeceJacket();
        ManeMenuPage maneMenuPage = mainPageStep.addSauceLabsBoltTShirt();
        maneMenuPage.getShoppingCartValueLocators().shouldHave(Condition.text("4"));

    }

    @Test
    public void addFiveProductTest() {
        LoginStep loginStep = open("", LoginStep.class);
        MainPageStep mainPageStep = open("", MainPageStep.class);
        loginStep.loginSuccessful(ReadProperties.usernameStandard(), ReadProperties.password());
        mainPageStep.addSauceLabsOnesie();
        mainPageStep.addSauceLabsBikeLight();
        mainPageStep.addSauceSauceLabsFleeceJacket();
        mainPageStep.addSauceLabsBoltTShirt();
        ManeMenuPage maneMenuPage = mainPageStep.addTShirtRed();
        maneMenuPage.getShoppingCartValueLocators().shouldHave(Condition.text("5"));
    }

    @Test
    public void addSixProductTest() {
        LoginStep loginStep = open("", LoginStep.class);
        MainPageStep mainPageStep = open("", MainPageStep.class);
        loginStep.loginSuccessful(ReadProperties.usernameStandard(), ReadProperties.password());
        mainPageStep.addSauceLabsOnesie();
        mainPageStep.addSauceLabsBikeLight();
        mainPageStep.addSauceSauceLabsFleeceJacket();
        mainPageStep.addSauceLabsBoltTShirt();
        mainPageStep.addTShirtRed();
        ManeMenuPage maneMenuPage = mainPageStep.addSauceLabsBaskPack();
        maneMenuPage.getShoppingCartValueLocators().shouldHave(Condition.text("6"));
    }

    @Test
    public void removeOneProductTest() {
        LoginStep loginStep = open("", LoginStep.class);
        MainPageStep mainPageStep = open("", MainPageStep.class);
        loginStep.loginSuccessful(ReadProperties.usernameStandard(), ReadProperties.password());
        mainPageStep.addTShirtRed();
        mainPageStep.addSauceLabsBaskPack();
        ManeMenuPage maneMenuPage = mainPageStep.removeTShirtRed();
        maneMenuPage.getShoppingCartValueLocators().shouldHave(Condition.text("1"));
    }

    @Test
    public void removeTwoProductTest() {
        LoginStep loginStep = open("", LoginStep.class);
        MainPageStep mainPageStep = open("", MainPageStep.class);
        loginStep.loginSuccessful(ReadProperties.usernameStandard(), ReadProperties.password());
        mainPageStep.addSauceLabsOnesie();
        mainPageStep.addSauceLabsBikeLight();
        mainPageStep.addTShirtRed();
        mainPageStep.removeSauceLabsOnesie();
        ManeMenuPage maneMenuPage = mainPageStep.removeSauceLabsBikeLight();
        maneMenuPage.getShoppingCartValueLocators().shouldHave(Condition.text("1"));
    }

    @Test
    public void removeThreeProductTest() {
        LoginStep loginStep = open("", LoginStep.class);
        MainPageStep mainPageStep = open("", MainPageStep.class);
        loginStep.loginSuccessful(ReadProperties.usernameStandard(), ReadProperties.password());
        mainPageStep.addTShirtRed();
        mainPageStep.addSauceSauceLabsFleeceJacket();
        mainPageStep.addSauceLabsOnesie();
        mainPageStep.addSauceLabsBoltTShirt();
        mainPageStep.removeTShirtRed();
        mainPageStep.removeSauceSauceLabsFleeceJacket();
        ManeMenuPage maneMenuPage = mainPageStep.removeSauceLabsOnesie();
        maneMenuPage.getShoppingCartValueLocators().shouldHave(Condition.text("1"));
    }

    @Test
    public void removeFourProductTest() {
        LoginStep loginStep = open("", LoginStep.class);
        MainPageStep mainPageStep = open("", MainPageStep.class);
        loginStep.loginSuccessful(ReadProperties.usernameStandard(), ReadProperties.password());
        mainPageStep.addSauceSauceLabsFleeceJacket();
        mainPageStep.addSauceLabsOnesie();
        mainPageStep.addSauceLabsBoltTShirt();
        mainPageStep.addSauceLabsBikeLight();
        mainPageStep.addTShirtRed();
        mainPageStep.removeTShirtRed();
        mainPageStep.removeSauceSauceLabsFleeceJacket();
        mainPageStep.removeSauceLabsOnesie();
        ManeMenuPage maneMenuPage = mainPageStep.removeSauceLabsBoltTShirt();
        maneMenuPage.getShoppingCartValueLocators().shouldHave(Condition.text("1"));
    }

    @Test
    public void removeFiveProductTest() {
        LoginStep loginStep = open("", LoginStep.class);
        MainPageStep mainPageStep = open("", MainPageStep.class);
        loginStep.loginSuccessful(ReadProperties.usernameStandard(), ReadProperties.password());
        mainPageStep.addSauceSauceLabsFleeceJacket();
        mainPageStep.addSauceLabsOnesie();
        mainPageStep.addSauceLabsBoltTShirt();
        mainPageStep.addSauceLabsBikeLight();
        mainPageStep.addTShirtRed();
        mainPageStep.addSauceLabsBaskPack();
        mainPageStep.removeTShirtRed();
        mainPageStep.removeSauceSauceLabsFleeceJacket();
        mainPageStep.removeSauceLabsOnesie();
        mainPageStep.removeSauceLabsBoltTShirt();
        ManeMenuPage maneMenuPage = mainPageStep.removeSauceLabsBaskPack();
        maneMenuPage.getShoppingCartValueLocators().shouldHave(Condition.text("1"));
    }

    @Test
    public void clickOnButtonTwitterTest() {
        LoginStep loginStep = open("", LoginStep.class);
        MainPageStep mainPageStep = open("", MainPageStep.class);
        loginStep.loginSuccessful(ReadProperties.usernameStandard(), ReadProperties.password());
        mainPageStep.сlickOnTwiter();
        switchTo().window(1);
        webdriver().shouldHave(url(ReadProperties.twiter()));
    }

    @Test
    public void clickOnButtonFacebook() throws InterruptedException {
        LoginStep loginStep = open("", LoginStep.class);
        MainPageStep mainPageStep = open("", MainPageStep.class);
        loginStep.loginSuccessful(ReadProperties.usernameStandard(), ReadProperties.password());
        mainPageStep.сlickOnFacebook();
        switchTo().window(1);
        webdriver().shouldHave(url(ReadProperties.facebook()));
    }
}
