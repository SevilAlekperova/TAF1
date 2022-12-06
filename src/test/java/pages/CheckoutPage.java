package pages;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class CheckoutPage {

    private final By pageIndetifer = By.xpath("//*[text()='Checkout']");
    private final By inputForFirstname = By.id("first-name");
    private final By inputForLastname = By.id("last-name");
    private final By clickContinue = By.id("continue");
    private final By inputForZipcode = By.id("postal-code");
    private final By clickFinish = By.id("finish");

    public SelenideElement getClickFinish() {
        return $(clickFinish).shouldBe(Condition.visible);
    }

    public void clickFinish() {
        getClickFinish().click();
    }

    public SelenideElement getInputForFirstname() {
        return $(inputForFirstname).shouldBe(Condition.visible);
    }

    public SelenideElement getClickContinue() {
        return $(clickContinue).shouldBe(Condition.visible);
    }

    public void clickContinue() {
        getClickContinue().click();
    }

    public SelenideElement getInputForLastname() {
        return $(inputForLastname).shouldBe(Condition.visible);
    }

    public SelenideElement getInputForZipcode() {
        return $(inputForZipcode).shouldBe(Condition.visible);
    }

    public SelenideElement buttonCheckout() {
        return $(pageIndetifer).shouldBe(Condition.visible);
    }

    public void clickButtonCheckout() {
        buttonCheckout().click();
    }

    public void setFistName(String value) {
        getInputForFirstname().setValue(value);
    }

    public void setLastName(String value) {
        getInputForLastname().setValue(value);
    }

    public void setLastZipCode(String value) {
        getInputForZipcode().setValue(value);
    }


}


