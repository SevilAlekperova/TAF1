package pages;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    // Блок описания селекторов для элементов
    private final By userNameInputLocator = By.id("user-name");
    private final By pswInputLocator = By.id("password");
    private final By loginButtonLocator = By.id("login-button");
    private final By errorTextLocator = By.tagName("h3");


    public SelenideElement getPageIdentifier() {
        return $(loginButtonLocator).shouldBe(Condition.visible);
    }

    // Блок атомарных методов
    public SelenideElement getUserNameInputLocator() {
        return $(userNameInputLocator).shouldBe(Condition.visible);
    }

    public SelenideElement getPswInput() {
        return $(pswInputLocator).shouldBe(Condition.visible);
    }

    public SelenideElement getLoginButton() {
        return $(loginButtonLocator).shouldBe(Condition.visible);
    }

    public void setEmail(String value) {
        getUserNameInputLocator().setValue(value);
    }

    public void setPsw(String value) {
        getPswInput().setValue(value);
    }

    public void clickLoginButton() {
        getLoginButton().click();
    }

    public SelenideElement getErrorTextElement() {
        return $(errorTextLocator).shouldBe(Condition.visible);
    }

}
