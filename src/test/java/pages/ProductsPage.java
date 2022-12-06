package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage{
    private final static String pagePath = "inventory.html";

    // Блок описания селекторов для элементов
    private final By headerTitleLabelLocator = By.xpath("//span[contains(text(), 'Products')]");

    protected By getPageIdentifier() {
        return headerTitleLabelLocator;
    }
}

